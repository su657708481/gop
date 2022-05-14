package granulej.lang.mthred;

import granulej.lang.GranuleNode;
import granulej.lang.GranuleOptions;
import granulej.lang.GranuleTree;
import granulej.lang.PreloadThread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
	�����������Ƿ�ı䣬���༼����һ���֣����ı䣬�򽫼����������Ϊ����
 */
public class ThredContextChangedEvent {
    //	����ÿ�������Ķ�Ӧ����
    public Map<String, List<String>> listeners = new HashMap<String, List<String>>();

    public ThredContextChangedEvent(){}
    /*
        ��ѯ ָ������������֮��ļ�����ϵ�����Ѿ������򷵻أ��������ڣ�����
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
        ���߳�gop:�����ĸı�֮�󣬽������ļ���������Ϊ��
     */
    public synchronized void notifyChanged(String contextName, ThredInfo thredInfo) {

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
}
