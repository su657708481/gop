package granulej.lang.mthred;

import granulej.lang.Context;
import granulej.lang.GopContext;
import granulej.lang.GranuleNode;
import granulej.lang.GranuleTree;

import java.util.HashMap;

public class ThredInfo {

    // ȫ���߳���Ϣ
    public static HashMap<Long, ThredInfo> globalThredInfo = new HashMap<Long, ThredInfo>();

    public static int thredNum = 0;

    private long thredId = 0;

    private String thredName = null;

    // �����߳�level �����ġ���
    public HashMap<String, Context> contexts = new HashMap<String, Context>();
    public HashMap<String, GranuleNode> treeNodeMaps = new HashMap<String, GranuleNode>();

    //�����߳�level
    public ThredContextChangedEvent contextChangedEvent= new ThredContextChangedEvent();

    public ThredInfo(Long thredId, String thredName) {
        this.thredId = thredId;
        this.thredName = thredName;

        ThredInfo.globalThredInfo.put(this.thredId, this);
        initThred();
    }

    public static ThredInfo getThredInfo(Long thredId){
        return globalThredInfo.get(thredId);
    }

    /*
        ��ʼ���̹߳�������Ϣ
     */
    public void initThred(){
        // �������̻߳��������ĵ���ǰ����
        this.contexts=GopContext.copyContext();
        // �������߳���������ǰ����
        this.treeNodeMaps=GranuleTree.copyGranuleTree();
    }


    /*
        �ͷ��߳���Ϣ
    */
    public void freeThred(){
        globalThredInfo.remove(this.thredId);
    }

    public void  printInfo(){
        System.out.println(
            "thredId: "+Long.toString(this.thredId)+"; "+
            "thredName: "+this.thredName
        );
    }

    public String getThredName(){
        return this.thredName;
    }

    public GranuleNode getGranuleNode(String node_name) {
        if (this.treeNodeMaps.containsKey(node_name)) {
            return (GranuleNode) this.treeNodeMaps.get(node_name);
        } else
            return null;
    }



    public static void main(String[] args) {

        HashMap<Long, String> hash = new HashMap<Long, String>();
        hash.put(new Long(-1),"test1");
        hash.put(new Long(234),"test2");
//        System.out.println(hash.get(new Long(-1)));

        HashMap<Long, String> deepCopy=new HashMap<Long, String>();
        deepCopy.putAll(hash);
        deepCopy.put(new Long(-1),"test3");
        System.out.println(hash.get(new Long(-1)));
        System.out.println(deepCopy.get(new Long(-1)));

    }
}
