package granulej.lang;

import granulej.gui.datastructure.GranuleUnit;
import granulej.lang.mthred.ThredInfo;
import gui.constant.GranuleConstant;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    Ԥ����������
 */
public class MultiPreloadThread extends Thread {
    private static MultiPreloadThread instance = null;

    public static synchronized MultiPreloadThread getInstance() {
        if (instance == null) {
            instance = new MultiPreloadThread();
            instance.start();
        }
        return instance;
    }

    private Queue<Runnable> tasks = new LinkedList<Runnable>();
    private Queue<Runnable> highPriviledgeTasks = new LinkedList<Runnable>();
    private ConcurrentHashMap<String, HashMap<String ,GranuleUnit>> similar_cache = new ConcurrentHashMap<String, HashMap<String ,GranuleUnit>>();

    static final Lock lock = new ReentrantLock();
    static final Condition newTask = lock.newCondition();

    private Runnable pollTask() {
        lock.lock();
        try {
            while (true) {
                if (!highPriviledgeTasks.isEmpty()) {
                    return highPriviledgeTasks.poll();
                } else if (!tasks.isEmpty()) {
                    return tasks.poll();
                }
                newTask.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        } finally {
            lock.unlock();
        }
    }

    @Override
    public void run() {
        while (true) {
            Runnable r = pollTask();
            r.run();
        }
    }

    private void addTask(Queue<Runnable> q, Runnable run) {
        lock.lock();
        try {
            q.add(run);
            newTask.signalAll();
        } finally {
            lock.unlock();
        }
    }

    private static class SearchParam {
        public String gName;
        public boolean ready = false;
        public GranuleUnit result = null;

        public SearchParam(String name) {
            gName = name;
        }
    }

    private void searchForSimilarGranule(SearchParam p,final long lastId) {

        // �����߳���Ϣ,����
        ThredInfo.createCite(getId(),lastId);

        printLog("searchForSimilarGranule. thred id: "+String.valueOf(getId()));

        Object[] similarGra = GranulePolling.getInstance().getPollingResult(p.gName, 0);
        if (similarGra[1].equals(GranuleConstant.GRANULE_NOT_EXIST)) {
            System.out.println("no similar granule on granule server!!!");
            return;
        }

        Class simiGranule = (Class) similarGra[0];
        String simiFileName = (String) similarGra[1];


//        boolean isFit = InvokeAgent.executeGranule(simiGranule);
        GranuleUnit unit = new GranuleUnit(simiGranule, null, simiFileName);

        if (!similar_cache.containsKey(p.gName)){
            similar_cache.put(p.gName, new HashMap<String, GranuleUnit>());
        }
        similar_cache.get(p.gName).put(unit.simiGranule.getName(), unit);

        //����
        ThredInfo.freeThred(getId());

        synchronized (p) {
            p.ready = true;
            p.result = unit;
            p.notifyAll();
        }
    }


    /*
        ���� && û��ɾ���������ٴν�����Ӧ�Բ��ԣ������ʺϣ�����������
     */
    public void invalidateGranule(final GranuleNode node, final long lastId) {
        if (node.isDirty() && !node.isRemoved()) {
            addTask(tasks, new Runnable() {
                @Override
                public void run() {
                    if (node.isDirty() && !node.isRemoved()) {
                        try {
                            // �����߳���Ϣ,����
                            ThredInfo.createCite(getId(),lastId);

                            // �ʺ��Բ���
                            node.setStatus((Boolean) node.getFitMethod().invoke(null, null));
                            node.clearDirty();

                            // ���ʺϲ���������
                            if (!node.getStatus()) {
                                addTask(tasks, new Runnable() {
                                    @Override
                                    public void run() {
                                        searchForSimilarGranule(new SearchParam(node.getGranuleName()), lastId);
                                    }
                                });
                            }
                            //����
                            ThredInfo.freeThred(getId());

                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
        }
    }

    public GranuleUnit searchForSimilarGranule(ArrayList<String> gNames, final long lastId) {
        long t0 = System.nanoTime();
        if (gNames == null || gNames.size() == 0)
            return null;

        final String gName = gNames.get(0);


        // ����cache
        HashMap<String ,GranuleUnit> similars = similar_cache.get(gName);
        if (similars != null) {
            for (String similar: similars.keySet())
            {
                GranuleUnit unit = similars.get(similar);
                // cache���ҵ�������
                if (InvokeAgent.executeGranule(unit.simiGranule)) {
                    long t1 = System.nanoTime();
                    if (GranuleOptions.enableSearchTimeStat)
                        System.out.println("SearchTime: " + (t1 - t0));
                    return unit;
                }
            }
        }


        // ����û�Ҽ������ʷ�����
        printLog("cache not found, find in server.");
        final SearchParam p = new SearchParam(gName);
        addTask(highPriviledgeTasks, new Runnable() {
            @Override
            public void run() {
                searchForSimilarGranule(p, lastId);
            }
        });

        try {
            synchronized (p) {
                while (!p.ready)
                    p.wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long t1 = System.nanoTime();
        if (GranuleOptions.enableSearchTimeStat)
            System.out.println("SearchTime: " + (t1 - t0));

        return p.result;

    }

    /*
        ��ӡlog
    */
    public static void printLog(String info) {
        if (GranuleOptions.enableGopTestInfo)
        {
            System.out.println(info);
        }
    }

}
