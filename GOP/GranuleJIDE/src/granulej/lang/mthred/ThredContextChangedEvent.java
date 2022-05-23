package granulej.lang.mthred;

import granulej.lang.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
	监听上下文是否改变，是脏技术的一部分，若改变，则将监听的粒标记为脏粒
 */
public class ThredContextChangedEvent {
    //	监听每个上下文对应的粒
    public Map<String, List<String>> listeners = new HashMap<String, List<String>>();

    public ThredContextChangedEvent(){}
    /*
        查询 指定上下文与粒之间的监听关系，若已经存在则返回，若不存在，监听
     */
    public synchronized void addListener(String contextName, String granuleName) {
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
        多线程gop:上下文改变之后，将上下文监听的粒置为脏
     */
    public synchronized void notifyChanged(String contextName, ThredInfo thredInfo) {
//        printLisener();

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
                    // TODO
                    printLog("dirty: "+node.getGranuleName()+ " hashocde:"+String.valueOf(node.hashCode()) +" Name: "+String.valueOf(thredInfo.getThredName()) );

                    node.markDirty();
                    if (GranuleOptions.enablePreloadThread){
                        final long lastId=thredInfo.getThredId();
                        MultiPreloadThread.getInstance().invalidateGranule(node, lastId);
//                        PreloadThread.getInstance().invalidateGranule(node);

                    }
                }
            }
        }

        if (GranuleOptions.enableMarkTime) {
            long t1 = System.nanoTime();
            System.out.println("MarkTime:" + (t1 - t0));
        }
    }

    public void printLisener(){
        System.out.print("ThredContextChangedEvent lisener: ");
        for(String key:this.listeners.keySet()){
            System.out.print(key+" ;");
        }
        System.out.println(";");

    }

    /*
        打印log
    */
    public static void printLog(String info) {
        if (GranuleOptions.enableGopTestInfo)
        {
            System.out.println(info);
        }
    }
}
