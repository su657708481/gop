package granulej.lang;

import java.lang.reflect.Method;
import java.util.LinkedList;

/*
	粒节点
 */
public class GranuleNode {

    //粒名
    private String granuleName = null;

    //粒附着的类名
    private String root_class = null;

    //粒对应的class对象
    private Class granuleClass = null;

    //粒的子粒
    private LinkedList<GranuleNode> children = null;

    //父粒
    private GranuleNode parent = null;

    //粒中影子类的状态
    private boolean status = false;

    //粒的脏标记
    private boolean dirty = true;
    private boolean removed = false;

    public GranuleNode(String gname, GranuleNode parent) {
        this.granuleName = gname;
        this.parent = parent;
        children = new LinkedList<GranuleNode>();
        initGranuleStatus();
    }

    public GranuleNode(String gname, String root_class, GranuleNode parent) {
        this.granuleName = gname;
        this.root_class = root_class;
        this.parent = parent;
        children = new LinkedList<GranuleNode>();
        initGranuleStatus();
    }

    public void setRootClass(String cname) {
        this.root_class = cname;
    }

    public String getRootClass() {
        return root_class;
    }

    public void setGranuleName(String gname) {
        this.granuleName = gname;
    }

    public String getGranuleName() {
        return granuleName;
    }

    public void setGranuleParent(GranuleNode parent) {
        this.parent = parent;
    }

    public GranuleNode getGranuleParent() {
        return parent;
    }

    public boolean hasChildren() {
        if (children.size() > 0)
            return true;
        else
            return false;
    }

    public LinkedList<GranuleNode> getChildren() {
        if (this.children == null) {
            return new LinkedList<GranuleNode>();
        }
        return this.children;
    }

    public void setChildren(LinkedList<GranuleNode> children) {
        this.children = children;
    }

    public int getNumberOfChildren() {
        if (children == null) {
            return 0;
        }
        return children.size();
    }

    public void addChild(GranuleNode child) {
        if (children == null) {
            children = new LinkedList<GranuleNode>();
        }
        children.add(child);
    }

    /*
        返回子粒的所有祖先节点
     */
    public LinkedList<GranuleNode> getParents() {
        LinkedList<GranuleNode> parents = new LinkedList<GranuleNode>();
        GranuleNode parent = this.getGranuleParent();
        while (parent != null) {
            parents.add(parent);
            parent = parent.getGranuleParent();
        }
        return parents;
    }

    /*
        递归  找到粒的所有子粒
     */
    public LinkedList<GranuleNode> getAllChildren() {
        LinkedList<GranuleNode> allChildren = new LinkedList<GranuleNode>();
        if (allChildren.isEmpty()) {
            int children_size = children.size();
            for (int i = 0; i < children_size; i++) {
                GranuleNode gn = (GranuleNode) children.get(i);
                allChildren.add(gn);
                allChildren.addAll(gn.getAllChildren());
            }
        }
        return allChildren;
    }

    public void setStatus(boolean s) {
        status = s;
    }

    public boolean getStatus() {
        return status;
    }

    Method fitMethod = null;

    public Method getFitMethod() {
        return fitMethod;
    }

    //初始化粒的状态
    private void initGranuleStatus() {
        if (granuleName.endsWith("g0"))
            return;
        granuleClass = GranuleLoader.loadGranule(granuleName);

        if (granuleClass == null) {
            status = false;
            return;
        }

        //获取fitness方法
        try {
            fitMethod = granuleClass.getDeclaredMethod("fitness");
        } catch (Exception e) {
            e.printStackTrace();
            status = false;
            return;
        }
        try {
            //先将fitness方法的访问权限去掉，然后再执行
            fitMethod.setAccessible(true);
            status = (Boolean) fitMethod.invoke(null, null);
        } catch (Exception e) {
            e.printStackTrace();
            status = false;
        }

    }

    public boolean checkStatus() {
        return status;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void clearDirty() {
        dirty = false;
    }

    /*
        将粒以及它的子粒标记为脏，递归标记
     */
    public synchronized void markDirty() {
        dirty = true;
        // TODO 是不是写错了，待验证
        if (!dirty)
            for (GranuleNode node : children)
                node.markDirty();
    }

    public void setRemoved() {
        removed = true;
    }

    public boolean isRemoved() {
        return removed;
    }
}