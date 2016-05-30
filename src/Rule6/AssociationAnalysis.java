package Rule6;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class AssociationAnalysis {
	public  ArrayList<AssociationNode> nodeList=new ArrayList<AssociationNode>();
	public AssociationAnalysis(String file){//Constructor
		Document doc = readXML(file);
		Element root = doc.getRootElement();
		analysis(root);
	}
	public void analysis(Element root) {
		// TODO Auto-generated method stub
		for(Iterator<Element> it=root.elementIterator();it.hasNext();){
			Element element = it.next();
			if(element.getName().equals("associationList")){
				//对某节点下的所有子节点进行遍历
				for(Iterator<Element> it1=element.elementIterator();it1.hasNext();){//把节点都放到一个ArrayList中，等待处理
					Element e1 = it1.next();
	
					//将相关信息存入
						AssociationNode t = new AssociationNode(e1.elementText("associationRelationshipName"));					    
						t.setAssociationDirection(e1.elementText("associationDirection"));
						t.setFromAssociationAttribute(e1.elementText("fromAssociationAttribute"));
						t.setFromClass(e1.elementText("fromClass")+"T");
						t.setFromMultiplicity(e1.elementText("fromMultiplicity"));
						t.setToAssociationAttribute(e1.elementText("toAssociationAttribute"));
						t.setToClass(e1.elementText("toClass")+"T");
						t.setToMultiplicity(e1.elementText("toMultiplicity"));
//						//System.out.println("subordinateClassMultiplicity"+e1.elementText("subordinateClassMultiplicity"));
						nodeList.add(t);
//					}
				}
			}
		}
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
	
}
//class AssociationNode{
//	private String associationRelationshipName;
//	private String associationDirection;
//	private String fromClass;
//	private String fromAssociationAttribute;
//	private String toClass;
//	private String toAssociationAttribute;
//	private char fromMultiplicity[];
//	private char toMultiplicity[];
//	public AssociationNode(String _associationRelationshipName){
//		this.associationRelationshipName = _associationRelationshipName;
//		fromClass = null;
//		fromAssociationAttribute = null;
//		toClass = null;
//		toAssociationAttribute = null;
//		fromMultiplicity = new char[2];
//		toMultiplicity = new char[2];
//	}
//	public String getAssociationRelationshipName(){
//		return associationRelationshipName;
//	}
//	public void setAssociationRelationshipName(String _associationRelationshipName){
//		this.associationRelationshipName = _associationRelationshipName;
//	}
//	public String getAssociationDirection(){
//		return associationDirection;
//	}
//	public void setAssociationDirection(String _associationDirection){
//		associationDirection = _associationDirection;
//	}
//	public String getFromClass(){
//		return fromClass;
//	}
//	public void setFromClass(String _fromClass){
//		fromClass = _fromClass;
//	}
//	public String getFromAssociationAttribute(){
//		return fromAssociationAttribute;
//	}
//	public void setFromAssociationAttribute(String _fromAssociationAttribute){
//		fromAssociationAttribute = _fromAssociationAttribute;
//	}
//	
//	public String getToClass(){
//		return toClass;
//	}
//	public void setToClass(String _toClass){
//		toClass = _toClass;
//	}
//	public String getToAssociationAttribute(){
//		return toAssociationAttribute;
//	}
//	public void setToAssociationAttribute(String _toAssociationAttribute){
//		toAssociationAttribute = _toAssociationAttribute;
//	}
//	public void setFromMultiplicity(String s){
//		fromMultiplicity[0] = s.charAt(0);
//		fromMultiplicity[1] = s.charAt(s.length()-1);
//	}
//	public char[] getFromMultiplicity(){
//		return fromMultiplicity;
//	}
//	public void setToMultiplicity(String s){
//		toMultiplicity[0] = s.charAt(0);
//		toMultiplicity[1] = s.charAt(s.length()-1);
//	}
//	public char[] getToMultiplicity(){
//		return toMultiplicity;
//	}
//}
