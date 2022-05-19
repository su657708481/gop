package granulej.lang;

import granulej.lang.mthred.ThredInfo;

import java.util.*;

/*
	�����������Ƿ�ı䣬���༼����һ���֣����ı䣬�򽫼����������Ϊ����
 */
public class ContextChangedEvent {
    //	����ÿ�������Ķ�Ӧ����
    static Map<String, List<String>> listeners = new HashMap<String, List<String>>();

    /*
        ��ѯ ָ������������֮��ļ�����ϵ�����Ѿ������򷵻أ��������ڣ�����
     */
    public static synchronized void addListener(String contextName, String granuleName) {
        if (!GranuleOptions.enableDirtyFlag) return;
        List<String> listenersOfContext = listeners.get(contextName);
        if (listenersOfContext == null) {
            listenersOfContext = new ArrayList<String>();
            listeners.put(contextName, listenersOfContext);
        } else {
            if (listenersOfContext.contains(granuleName))
                return;
        }

        listenersOfContext.add(granuleName);
    }

    /*
        �����ĸı�֮�󣬽������ļ���������Ϊ��
     */
    public static synchronized void notifyChanged(String contextName) {
        if (!GranuleOptions.enableDirtyFlag) return;
        long t0;
        if (GranuleOptions.enableMarkTime)
            t0 = System.nanoTime();

        List<String> listenersOfContext = listeners.get(contextName);
        if (listenersOfContext != null) {
            for (String listener : listenersOfContext) {
                // �ҵ������ļ�������
                GranuleNode node = GranuleTree.getInstance().getGranuleNode(listener);
                if (node != null) {
                    node.markDirty();
                    if (GranuleOptions.enablePreloadThread)
                        PreloadThread.getInstance().invalidateGranule(node);
                }
            }
        }

        if (GranuleOptions.enableMarkTime) {
            long t1 = System.nanoTime();
            System.out.println("MarkTime:" + (t1 - t0));
        }
    }


    /*
        ���߳�gop:�����ĸı�֮�󣬽������ļ���������Ϊ��
     */
    public static synchronized void notifyChanged(String contextName, ThredInfo thredInfo) {

        if (!GranuleOptions.enableDirtyFlag) return;
        long t0;
        if (GranuleOptions.enableMarkTime)
            t0 = System.nanoTime();

        List<String> listenersOfContext = listeners.get(contextName);
        if (listenersOfContext != null) {
            for (String listener : listenersOfContext) {
                // �ҵ������ļ�������
                GranuleNode node = thredInfo.getGranuleNode(listener);
//                GranuleNode node = GranuleTree.getInstance().getGranuleNode(listener);
                if (node != null) {
                    node.markDirty();
                    if (GranuleOptions.enablePreloadThread)
                        PreloadThread.getInstance().invalidateGranule(node);
                }
            }
        }

        if (GranuleOptions.enableMarkTime) {
            long t1 = System.nanoTime();
            System.out.println("MarkTime:" + (t1 - t0));
        }
    }

    /*
        ���߳�gop
     */
    public static Map<String, List<String>> copyListeners(){
//        printLisener();
        Map<String, List<String>> deepCopy=new HashMap<String, List<String>>();
        for(String key:ContextChangedEvent.listeners.keySet()){
            List<String> newlist= new ArrayList<String>();
            for(String l:ContextChangedEvent.listeners.get(key)){
                newlist.add(l);
            }
            deepCopy.put(key,newlist);
        }
        return deepCopy;
    }

    public static void printLisener(){
        System.out.print("ContextChangedEvent lisener: ");
        for(String key:ContextChangedEvent.listeners.keySet()){
            System.out.print(key+" : "+ContextChangedEvent.listeners.get(key).get(0)  +";");
        }
        System.out.println(";");

    }


}
