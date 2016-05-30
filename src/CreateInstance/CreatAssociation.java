package CreateInstance;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
//�������еĹ�ϵ
//�������汻�����������֮���ϵ��XML�ļ���
public class CreatAssociation {
	HashMap<String,AssociationShipType> associationMap;//���������ϵ
	public CreatAssociation(String file){
		associationMap = new HashMap<String,AssociationShipType>();
		iniRelation(file);
	}
	//����������ϵ
	public void iniRelation(String file){
		Document doc;
		Element root;
		doc = readXSD(file);
		root = doc.getRootElement();
		for(Iterator<Element> it=root.elementIterator();it.hasNext();){//�Թ�������Ϊkey���洢������ϵ
			Element element = it.next();
			if(element.getName().equals("associationList")){
				for(Iterator<Element> itx=element.elementIterator();itx.hasNext();){
					Element ele = itx.next();
					AssociationShipType ast = new AssociationShipType();
					String keyFrom = null,keyTo = null;
					ast.setDirection(ele.elementText("associationDirection"));
					ast.setFromClass(ele.elementText("fromClass"));
					keyFrom = ele.elementText("fromAssociationAttribute");
					ast.setToClass(ele.elementText("toClass"));
					keyTo = ele.elementText("toAssociationAttribute");
					ast.setFromAttribute(ele.elementText("fromAssociationAttribute"));
					ast.setToAttribute("toAssociationAttribute");
					if(!keyFrom.equals("NULL")) associationMap.put(keyFrom,ast);
					if(!keyTo.equals("NULL")) associationMap.put(keyTo,ast); 
				}
			}
		}
	}
	
	public Document readXSD(String file){
		SAXReader saxReader = new SAXReader();
		Document doc = null;
		try {
			doc = saxReader.read(new File(file));
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return doc;
	}

	///*
	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatAssociation rr = new CreatAssociation("src/resource/relationship.xml");
		System.out.println(rr.associationMap.size());
		Set<String> keys = rr.associationMap.keySet();
		for(String s:keys){
			System.out.println(s);
		}
	}
	    //*/

}
