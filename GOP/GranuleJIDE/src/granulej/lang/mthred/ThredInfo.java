package granulej.lang.mthred;

import granulej.lang.*;

import java.util.HashMap;
import java.util.LinkedList;

public class ThredInfo {

    // ȫ���߳���Ϣ
    public static HashMap<Long, ThredInfo> globalThredInfo = new HashMap<Long, ThredInfo>();

    public static int thredNum = 0;

    private long thredId = 0;

    private String thredName = null;

    // �����߳�level ������
    public HashMap<String, Context> contexts = new HashMap<String, Context>();
    // ��
    private GranuleNode root;
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
        this.root=new GranuleNode(GranuleTree.getInstance().getRootNode());
        this.treeNodeMaps=GranuleTree.copyGranuleTree();
        // ����������-���ļ�����ϵ
        contextChangedEvent.listeners= ContextChangedEvent.copyListeners();
    }


    /*
        �ͷ��߳���Ϣ
    */
    public void freeThred(){
        globalThredInfo.remove(this.thredId);
    }


    /*
        ��ӡ�߳�info
     */
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

    /*
        ��������ɾ�����ڵ㣬���ظ��ڵ�
     */
    public GranuleNode getDelParentNode(String node_name) {
        synchronized (this) {
            GranuleNode parent = null;
            GranuleNode gn = getGranuleNode(node_name);
            if (gn == null)
                throw new IllegalArgumentException(node_name + " can not be found !");
            if (gn.getGranuleParent() != null) {
                parent = gn.getGranuleParent();
                deleteGranuleNode(node_name);
                return parent;
            }
            return null;
        }
    }

    /*
        ��������ɾ�����ڵ�
     */
    public void deleteGranuleNode(String node_name) {
        synchronized (this) {
            GranuleNode node = getGranuleNode(node_name);
            if (node == null)
                throw new IllegalArgumentException(node_name + " can not be found !");
            if (node.getGranuleParent() == null) {
                root = null;
                treeNodeMaps.clear();
            } else {
                // �ҵ����ĸ��ڵ㣬�����Ӹ��ڵ�ĺ����б���ɾ��
                node.getGranuleParent().getChildren().remove(node);
                node.setRemoved();
                treeNodeMaps.remove(node.getGranuleName());
                // �ҵ������ӽڵ㣬���ӽڵ�ȫ��ɾ��
                // TODO  �ӽڵ���ӽڵ��Ƿ�Ӧ�õݹ�ɾ�� �����ʣ�
                LinkedList sons = node.getAllChildren();
                int size = sons.size();
                for (int i = 0; i < size; i++) {
                    GranuleNode gn = (GranuleNode) sons.get(i);
                    gn.setRemoved();
                    treeNodeMaps.remove(gn.getGranuleName());
                }
            }
        }
    }

    /*
        �����������
     */
    public void addGranuleNode(GranuleNode node) {
        synchronized (this) {
            treeNodeMaps.put(node.getGranuleName(), node);
            GranuleNode g_parent = node.getGranuleParent();
            if (g_parent != null)
                g_parent.addChild(node);
        }
    }

    public static void main(String[] args) {

        String newValue =new String("value1");
        String oldValue =new String("value1");
        System.out.println( newValue.equals(oldValue) );
        System.out.println( newValue==oldValue );

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
