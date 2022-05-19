package granulej.lang.mthred;

import granulej.lang.*;

import java.util.HashMap;

public class ThredInfo {

    // 全局线程信息
    public static HashMap<Long, ThredInfo> globalThredInfo = new HashMap<Long, ThredInfo>();

    public static int thredNum = 0;

    private long thredId = 0;

    private String thredName = null;

    // 管理线程level 上下文、粒
    public HashMap<String, Context> contexts = new HashMap<String, Context>();
    public HashMap<String, GranuleNode> treeNodeMaps = new HashMap<String, GranuleNode>();

    //监听线程level
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
        初始化线程管理器信息
     */
    public void initThred(){
        // 拷贝主线程环境上下文到当前环境
        this.contexts=GopContext.copyContext();
        // 拷贝主线程粒树到当前环境
        this.treeNodeMaps=GranuleTree.copyGranuleTree();
        // 拷贝上下文-粒的监听关系
        contextChangedEvent.listeners= ContextChangedEvent.copyListeners();
    }


    /*
        释放线程信息
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
