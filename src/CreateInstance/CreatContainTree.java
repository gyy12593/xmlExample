package CreateInstance;
//������İ�����ϵ�Ķ����
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
//import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class CreatContainTree {
	private ArrayList<TreeNode> rootList;
 	public CreatContainTree(String file){//Constructor
		Document doc = readXML(file);
		Element root = doc.getRootElement();
		iniTree(root);
	}
 	/*private ArrayList<String> classNames;//��ȡ����������ֹ�ǰ������е��������ǲ����б�Ҫ
	public void getAllClassName(String file){
		Document doc = readXML(file);
		classNames = new ArrayList<String>();
		Element root = doc.getRootElement();
	}*/
	public void iniTree(Element root){//����������ϵ��
		rootList = new ArrayList<TreeNode>();
		ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();
		for(Iterator<Element> it=root.elementIterator();it.hasNext();){
			Element element = it.next();
			if(element.getName().equals("containmentList")){
				//��ĳ�ڵ��µ������ӽڵ���б���
				for(Iterator<Element> it1=element.elementIterator();it1.hasNext();){//�ѽڵ㶼�ŵ�һ��ArrayList�У��ȴ�����
					Element e1 = it1.next();
					if(e1.elementText("superiorClass").equals("ROOT")){
						TreeNode head = new TreeNode(e1.elementText("subordinateClass"));
						head.setSuperClass();
						head.setMultiplicity(e1.elementText("subordinateClassMultiplicity"));
						nodeList.add(head);
					}
					else{
						TreeNode t = new TreeNode(e1.elementText("subordinateClass"));
						t.setMultiplicity(e1.elementText("subordinateClassMultiplicity"));
						//System.out.println("subordinateClassMultiplicity"+e1.elementText("subordinateClassMultiplicity"));
						nodeList.add(t);
					}
				}
				for(Iterator<Element> it1=element.elementIterator();it1.hasNext();){//�������Ĺ�ϵ
					Element e1 = it1.next();
					String father = e1.elementText("superiorClass");
					String child = e1.elementText("subordinateClass");
					int f = 0,c = 0;
					if(!e1.elementText("superiorClass").equals("ROOT")){
						for(int i=0;i<nodeList.size();i++){
							if(nodeList.get(i).getName().equals(father)) f = i;
							else if(nodeList.get(i).getName().equals(child)) c = i;
						}
						nodeList.get(f).addSubordinateClass(nodeList.get(c));
						nodeList.get(c).setSuperClass(nodeList.get(f));
					}
					else{
						for(int i=0;i<nodeList.size();i++){
							if(nodeList.get(i).getName().equals(child))
								rootList.add(nodeList.get(i));
						}
					}
				}
			}
		}
	}
	public  ArrayList<TreeNode> getRootList(){//��Ҫ���ظ�����ʵ�����ķ��������а�������ڵ�
		return rootList;
	}
	public Document readXML(String file){//Read relationship.XML
		SAXReader sr = new SAXReader();
		Document doc = null;
		try {
			doc = sr.read(new File(file));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
	}
//	public TreeNode getContainmentTree(){//ֻ��һ������ʱ��
//		return this.containmentTree;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatContainTree cct = new CreatContainTree("src/resource/relationship.xml");
//		TreeNode t = cct.containmentTree;
//		printTree(t);
	}
	public static void printTree(TreeNode t){
		System.out.println(t.getName());
		for(int i=0;i<t.getsubordinateClass().size();i++){
			printTree(t.getsubordinateClass().get(i));
		}
	}

}
class TreeNode{
	private String name;
	private TreeNode superClass;
	private ArrayList<TreeNode> subordinateClass;
	private char multiplicity[];
	public TreeNode(String _name){
		this.name = _name;
		superClass = null;
		subordinateClass = new ArrayList<TreeNode>();
		multiplicity = new char[2];
	}
	public String getName(){
		return name;
	}
	public void setName(String _name){
		this.name = _name;
	}
	public TreeNode getSuperClass(){
		return superClass;
	}
	public void setSuperClass(){
		superClass = null;
	}
	public void setSuperClass(TreeNode t){
		superClass = t;
	}
	public ArrayList<TreeNode> getsubordinateClass(){
		return subordinateClass;
	}
	public void addSubordinateClass(TreeNode e){
		subordinateClass.add(e);
	}
	public void setMultiplicity(String s){
		multiplicity[0] = s.charAt(0);
		multiplicity[1] = s.charAt(s.length()-1);
	}
	public char[] getMultiplicity(){
		return multiplicity;
	}
}