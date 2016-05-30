package CreateInstance;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import XSDToJava.StudentT;
import XSDToJava.SchoolT;
import XSDToJava.TeacherT;
import XSDToJava.ClassT;
public class Generation1 {
private ArrayList<InstanceNode> instanceRootList;//保存包含根类的实例
public Generation1(){
	instanceRootList = new ArrayList<InstanceNode>();
}
	//将类的包含关系多叉树改成实例的包含关系多叉树 解决了孩子的分配问题 gyy added 2016-4-12
	//这里是将每个父亲的孩子数量固定
	public void iteratorValue(TreeNode t,InstanceNode superId,ArrayList<String[]> out) throws IllegalArgumentException, InvocationTargetException {
		if(t!=null){
			//拓扑分析开始 gyy 2016-4-12
			
			int num4Class =0;
			for(int i=0;i<out.size();i++){
				if(t.getName().equals(out.get(i)[1])){
					num4Class=Integer.parseInt(out.get(i)[2]);
					System.out.println(t.getName()+"的数量="+num4Class);
					break;
				}
			}
			//拓扑分析结束
			for(int j=0;j<num4Class;j++){
				String s = null;
				InstanceNode in = null;
				if(superId!=null){//不是根类，需要把自身加入到父类的子类列表中
					s = superId.getObjectInstance()+","+ t.getName()+"Id=100"+j;
					in = new InstanceNode();
					in.setObjectClass(t.getName()+"T");
					in.setObjectInstance(s);
					in.setId(t.getName()+"Id=100"+j);
					try {
						//利用反射建立具体类，并填充实例
						in.creatObject(in.getObjectClass(),"100"+j);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					superId.addChildInatanceNode(in);
//					System.out.println(j+":"+s);
					//System.out.println("******************************已处理非根类");
				}
				else{//是根类，没有父类，不加入任何节点的子类列表中
					s = t.getName()+"Id=100"+j;
					in = new InstanceNode();
					in.setObjectClass(t.getName()+"T");
					in.setObjectInstance(s);
					in.setId(s);
					try {
						in.creatObject(in.getObjectClass(),"100"+j);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					instanceRootList.add(in);
					//System.out.println("******************************已处理根类");
				}
				for(int i=0;i<t.getsubordinateClass().size();i++){//深度优先遍历
					//System.out.println("******************************"+ t.getName()+"  深度优先遍历"+i);
					iteratorValue(t.getsubordinateClass().get(i),in,out);
					//System.out.println("***************************退出"+ t.getName()+"  深度优先遍历"+i);
				}
			}
		}
	}
	public ArrayList<InstanceNode> getInstanceRootList(){//获得实例树根的列表
		return instanceRootList;
	}
	public static void main(String[] args) throws IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Generation1 gi = new Generation1();
		CreatContainTree cct = new CreatContainTree("src/resource/relationship.xml");
		///*利用形式化描述获得拓扑结果 gyy added 2016-4-12
		String in="root contains 2 School$every School contains 2 Class$every Class contains 1 Student$every School contains 2 Teacher$";
		//out的每一项均有四部分 School Class 3 0 表示School包含3个Class，而且'0'表示此关系未加入实例拓扑
		ArrayList<String[]> out=Rule4Containment2.ContainmentGenerator.generate(in);
//		for(int i=0;i<out.size();i++){
//			System.out.println("out"+i+out.get(i)[0]);
//			System.out.println("out"+i+out.get(i)[1]);
//			System.out.println("out"+i+out.get(i)[2]);
//			System.out.println("out"+i+out.get(i)[3]);
//		}
		//*/
		for(int i=0;i<cct.getRootList().size();i++){//有几棵树遍历几次
			//将类的包含关系多叉树改成实例的包含关系多叉树
			System.out.println("第"+i+"棵树***************************Name : "+cct.getRootList().get(i).getName());
			gi.iteratorValue(cct.getRootList().get(i),null,out);
		}
		ArrayList<InstanceNode> instanceRootList = gi.getInstanceRootList();//得到所有实例
		Vector<InstanceNode> result = new Vector<InstanceNode>();
		for(int i=0;i<instanceRootList.size();i++){
			if(instanceRootList.get(i).getChildInatance().size()>0){
				read(instanceRootList.get(i),result);//把树中节点放到result中去
			}
			else{
				result.add(instanceRootList.get(i));
			}
		}
		System.out.println("size: "+result.size());
//		///*gyy add 2016-3-15
//		System.out.println("result: "+result.get(2).getObjectClass());
//		StudentT ct=(StudentT)result.get(2).getObject();
//		//Object ct=result.get(2).getObject();
//		System.out.println("stuNo:"+ct.getStudentNo());
//		System.out.println("stuSex:"+ct.getSex());
//		System.out.println("PersonID:"+ct.getPersonID());
//		System.out.println("Name:"+ct.getPersonName());
//		//*/
		Document document = DocumentHelper.createDocument();  
        Element root = document.addElement("root");//添加文档根
		for(int i=0;i<result.size();i++){
			writeOne(result.get(i),root);
		}
		OutputFormat format = OutputFormat.createPrettyPrint();  
        format.setEncoding("GBK");//根据需要设置编码  
        XMLWriter writer = null;
		try {
			writer = new XMLWriter(System.out, format);
			document.normalize();  
	        writer.write(document);    
	        writer.close(); 
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
         
      
	}
	
	public static void read(InstanceNode in,Vector<InstanceNode> ins){//深度遍历实例树，放入Vector中
		ins.add(in);
		for(int i=0;i<in.getChildInatance().size();i++){
			read(in.getChildInatance().get(i),ins);
		}
	}
	private static void writeOne(InstanceNode n,Element root){//将一个节点写入xml文档
        Element request = root.addElement(n.getObjectClass().substring(0, n.getObjectClass().length()-1));
        Element objectClass = request.addElement("ObjectClass");
        objectClass.addText(n.getObjectClass().substring(0, n.getObjectClass().length()-1));
        Element objectInstance = request.addElement("ObjectInstance");
        objectInstance.addText(n.getObjectInstance());
        Element id = request.addElement("ID");
        id.addText(n.getId());
        ///*gyy add 2016-3-15      
		String ty=n.getObjectClass();
		//System.out.print("类名"+ty);
		Element a;
		if(("StudentT").equals(ty)){
			StudentT ct=(StudentT)n.getObject();
			a=request.addElement("studentNo");
			a.addText(ct.getStudentNo().toString());
			a=request.addElement("sex");
			a.addText(ct.getSex());
			a=request.addElement("Name");
			a.addText(ct.getPersonName());
			a=request.addElement("personId");
			a.addText(""+ct.getPersonID());
			a=request.addElement("birthday");
			a.addText(ct.getBirthday());
			a=request.addElement("friendList");
			a.addText(""+ct.getFriendList());
		}
		else if(("SchoolT").equals(ty)){
			SchoolT ct=(SchoolT)n.getObject();
			a=request.addElement("schoolId");
			a.addText(""+ct.getSchoolID());
			a=request.addElement("location");
			a.addText(ct.getLocation());
			a=request.addElement("SchoolName");
			a.addText(ct.getSchoolName());
			a=request.addElement("StudentLimit");
			a.addText(""+ct.getStudentLimit());
		}
		
		else if(("ClassT").equals(ty)){
			ClassT ct=(ClassT)n.getObject();
			a=request.addElement("ClassID");
			a.addText(ct.getClassID().toString());
			a=request.addElement("teacherList");
			a.addText(""+ct.getTeacherList());
		}
		else if(("TeacherT").equals(ty)){
			TeacherT ct=(TeacherT)n.getObject();
			a=request.addElement("personId");
			a.addText(ct.getPersonID().toString());
			a=request.addElement("teacherID");
			a.addText(""+ct.getTeacherID());
			a=request.addElement("personName");
			a.addText(ct.getPersonName());
			a=request.addElement("birthday");
			a.addText(ct.getBirthday());
			a=request.addElement("phoneNo");
			a.addText(ct.getPhoneNo().toString());
			a=request.addElement("position");
			a.addText(ct.getPosition());
			a=request.addElement("salary");
			a.addText(""+ct.getSalary());
			a=request.addElement("friendList");
			a.addText(""+ct.getFriendList());
			a=request.addElement("classList");
			a.addText(""+ct.getClassList());
		}
		//*/
	}

}
