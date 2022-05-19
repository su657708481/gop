package granulej.lang;

import granulej.lang.mthred.ThredInfo;

import java.util.*;

/*
	监听上下文是否改变，是脏技术的一部分，若改变，则将监听的粒标记为脏粒
 */
public class ContextChangedEvent {
    //	监听每个上下文对应的粒
    static Map<String, List<String>> listeners = new HashMap<String, List<String>>();

    /*
        查询 指定上下文与粒之间的监听关系，若已经存在则返回，若不存在，监听
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
        上下文改变之后，将上下文监听的粒置为脏
     */
    public static synchronized void notifyChanged(String contextName) {
        if (!GranuleOptions.enableDirtyFlag) return;
        long t0;
        if (GranuleOptions.enableMarkTime)
            t0 = System.nanoTime();

        List<String> listenersOfContext = listeners.get(contextName);
        if (listenersOfContext != null) {
            for (String listener : listenersOfContext) {
                // 找到上下文监听的粒
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
        多线程gop:上下文改变之后，将上下文监听的粒置为脏
     */
    public static synchronized void notifyChanged(String contextName, ThredInfo thredInfo) {

        if (!GranuleOptions.enableDirtyFlag) return;
        long t0;
        if (GranuleOptions.enableMarkTime)
            t0 = System.nanoTime();

        List<String> listenersOfContext = listeners.get(contextName);
        if (listenersOfContext != null) {
            for (String listener : listenersOfContext) {
                // 找到上下文监听的粒
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
        多线程gop
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
