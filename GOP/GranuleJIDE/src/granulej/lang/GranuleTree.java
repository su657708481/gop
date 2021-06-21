package granulej.lang;

import granulej.util.xmlUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

/*
	粒树
 */
public class GranuleTree {
	
	private GranuleNode root;

	private static GranuleTree instance = null;

	// 粒名：粒对象映射
	private static Map<String,GranuleNode> treeNodeMaps = new HashMap<String,GranuleNode>();

	private static String xmlFile;

	private static final String xmlFileName = "TestGranuleTree.xml";

	public static synchronized GranuleTree getInstance() {
		if (instance == null) {
			instance = new GranuleTree();
			instance.reloadGranuleTree(xmlFile);
		}
		return instance;
	}

	/*
		加载粒数，初始化
	 */
	public void reloadGranuleTree(String xmlFile) {
		synchronized (this) {
			treeNodeMaps.clear();
			root = null;
			xmlFile = getCurrentDir() + xmlFileName;
            
			//从粒树的加载获取DOM
			Document doc = XmlParser.getInstance().getCurrentGranuleFileDom();
            if(doc == null)
				doc = xmlUtil.load(xmlFile);
			Element rt = doc.getDocumentElement();
			setRootNode(readNodeFromXml(rt.getFirstChild(), null));
		}	
		
	}

	public String getCurrentDir() {
		return System.getProperty("user.dir") + File.separator;
	}

	/*
		从xml中读出粒信息，递归建立粒树，返回根粒
	 */
	public GranuleNode readNodeFromXml(Node node, GranuleNode parent) {
		GranuleNode gn = null;
		String gName = null;
		String cName = null;
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			String name = node.getNodeName();
			if (name.equals("granule")) {
				NamedNodeMap nodeMap = node.getAttributes();
				gName = nodeMap.getNamedItem("name").getNodeValue();
				cName = nodeMap.getNamedItem("class").getNodeValue();
				
				//建立上下文-粒关系
				String contextName = nodeMap.getNamedItem("context").getNodeValue();
				ContextChangedEvent.addListener(contextName, gName);
				
				//孩子和父亲之间建立双向的连接
				gn = new GranuleNode(gName, cName, parent);
				if(parent!=null)
					parent.addChild(gn);
				
				//将结点加到线性表里边方便查询
				treeNodeMaps.put(gName, gn);
			}
		}
		for (Node child = node.getFirstChild(); child != null; child = child.getNextSibling()) {
			parent = gn;
			readNodeFromXml(child, parent);
		}
		return gn;
	}

	public String getXmlFile() {
		return xmlFile;
	}

	public void setXmlFile(String xmlFile) {
		GranuleTree.xmlFile = xmlFile;
	}

	public GranuleNode getRootNode() {
		return root;
	}

	public void setRootNode(GranuleNode root) {
		this.root = root;
	}

	/*
		根据粒的名字找到粒
	 */
	public GranuleNode getGranuleNode(String node_name) {
		if (treeNodeMaps.containsKey(node_name)) {
			return (GranuleNode) treeNodeMaps.get(node_name);
		} else
			return null;
	}
	
	public ArrayList<GranuleNode> getSameBaseGranules0(String cname){
		ArrayList<GranuleNode> list=new ArrayList<GranuleNode>();
		if(cname==null || "".equals(cname))
			return list;
		Iterator iter=treeNodeMaps.entrySet().iterator();
        while(iter.hasNext()){
        	Map.Entry entry=(Map.Entry)iter.next();
        	GranuleNode gn=(GranuleNode)entry.getValue();
        	if(gn.getRootClass().equals(cname)){
        		if(!list.contains(gn))
        		  list.add(gn);
        	}
        }
		return list;
	}

	/*
		递归遍历，找到附着于类的所有粒（相似粒）
	 */
	public ArrayList<GranuleNode> getSameBaseGranules(String cname)
	{
		ArrayList<GranuleNode> list = new ArrayList<GranuleNode>();
		if(cname==null || "".equals(cname))
			return list;
	    traversal(root, cname, list);
	    return list;
	}
	private void traversal(GranuleNode node, String cname, ArrayList<GranuleNode> list)
	{
		if(node.getRootClass().equals(cname))
			list.add(node);
		for(Iterator iter=node.getChildren().iterator(); iter.hasNext();){
			GranuleNode gn = (GranuleNode)iter.next();
			traversal(gn, cname, list);
		}
	}

	/*
		找到粒的所有子节点，返回粒名字集合
	 */
	public static ArrayList<String> getGranuleAllChildren(String node_name) {
		ArrayList<String> list = new ArrayList<String>();
		GranuleNode ggn = GranuleTree.getInstance().getGranuleNode(node_name);
		if (ggn != null) {
			LinkedList<GranuleNode> gson = ggn.getAllChildren();
			Iterator iter = gson.iterator();
			while (iter.hasNext()) {
				GranuleNode gn = (GranuleNode) iter.next();
				String g_name = gn.getGranuleName();
				if (!list.contains(g_name))
					list.add(g_name);
			}
		}
		return list;
	}	

	/*
		找到粒到其指定祖先间的所有粒，返回名字集合
	 */
	public static ArrayList<String> getGranuleParents(String node_name, String ancetors)
	{
		ArrayList<String> list = new ArrayList<String>();		
		if(node_name==null ||  "".equals(node_name) || ancetors==null || "".equals(ancetors) || "g0".equals(ancetors) || node_name.equals(ancetors))
	    	return list;
        if(ancetors.equals("root")){
        	ancetors = "g0";
        }
    	GranuleNode ggn = GranuleTree.getInstance().getGranuleNode(node_name);
         if (ggn != null) {
			LinkedList<GranuleNode> gset = ggn.getParents();
			Iterator<GranuleNode> iter = gset.iterator();
			while (iter.hasNext()) {
				GranuleNode gn = (GranuleNode) iter.next();
				String g_name = gn.getGranuleName();
				if (!g_name.equals(ancetors)) {
					if (!list.contains(g_name))
						list.add(g_name);
				}
				else
				{
					break;
				}
			}
        } 
        return list;
	}
	
	public static void IteratorSons(String gname) {
		ArrayList<String> sons = getGranuleAllChildren(gname);
		System.out.println("node is :"+gname);
		for (Iterator iter = sons.iterator(); iter.hasNext();) {
			String node = (String) iter.next();
			System.out.println("node sons :" + node);
		}
	}

	public static void IteratorParents(String gname) {
		ArrayList<String> parents = getGranuleParents(gname,"root");
		for (Iterator iter = parents.iterator(); iter.hasNext();) {
			String node = (String) iter.next();
            //System.out.println("node parents :" + node);
		}
	}
	
	public static void Iterator()
	{
		Iterator iter = treeNodeMaps.entrySet().iterator();
        while(iter.hasNext()){
        	Map.Entry entry = (Map.Entry)iter.next();
        	String gname = (String)entry.getKey();
            //System.out.println("granule name is :"+gname);
        }	
		
	}
	

	public static ArrayList<GranuleNode> getGranuleTreeNodes()
	{
		 ArrayList<GranuleNode> glist=new ArrayList<GranuleNode>();
	    	Iterator iter = treeNodeMaps.keySet().iterator();
			while (iter.hasNext()) {			
				GranuleNode entry = treeNodeMaps.get((String) iter.next());
            	glist.add(entry);	
			}
	     return glist;
	}	

	/*
		添加粒到粒树
	 */
	public void addGranuleNode(GranuleNode node) {
		synchronized (this) {
			treeNodeMaps.put(node.getGranuleName(), node);
			GranuleNode g_parent = node.getGranuleParent();
			if (g_parent != null)
				g_parent.addChild(node);
		}
	}

	/*
		从粒树中删除粒节点，返回父节点
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
		从粒树中删除粒节点
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
				// 找到粒的父节点，把粒从父节点的孩子列表中删除
				node.getGranuleParent().getChildren().remove(node);
				node.setRemoved();
				treeNodeMaps.remove(node.getGranuleName());
				// 找到粒的子节点，把子节点全部删除
				// TODO  子节点的子节点是否应该递归删除 （疑问）
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
		返回所有粒的名字列表
	 */
	public static ArrayList<String> getGranuleList()
	{
		ArrayList<String> result = new ArrayList<String>();
		for(String granuleName:treeNodeMaps.keySet())
		{
			result.add(granuleName);
		}
		return result;
	}

	public static void main(String args[]) {
		GranuleTree.getInstance().IteratorParents("Dt3");
	}
}
