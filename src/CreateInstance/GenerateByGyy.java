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
public class GenerateByGyy {
private ArrayList<InstanceNode> instanceRootList;//������������ʵ��
	
	public GenerateByGyy(){
		instanceRootList = new ArrayList<InstanceNode>();
	}
	//����İ�����ϵ������ĳ�ʵ���İ�����ϵ����� ����˺��ӵķ������� gyy added 2016-3-21
	//public void iteratorValue(TreeNode t,InstanceNode superId,HashMap<String,Integer> h) throws IllegalArgumentException, InvocationTargetException {
	public void iteratorValue(TreeNode t,InstanceNode superId,ArrayList<String[]> out) throws IllegalArgumentException, InvocationTargetException {
		int num4Class=0;	
		if(t!=null){
//			System.out.println("!!!!!"+t.getName()+"!!!!!");
			//���˷�����ʼ gyy added 2016-4-1	
//			int x = h.get(t.getName());//��ȡ���������
//			if(t.getName().equals("Student"))//gyy test
//				x=2;
			if(superId!=null){
				for(int i=0;i<out.size();i++)
					if(t.getName().equals(out.get(i)[1]))
						if(("0").equals(out.get(i)[3])){
							num4Class=Integer.parseInt(out.get(i)[2]);
							//"0"��һ����־λ������Ϊ�������캢�ӣ���δ�����죬Ϊ0������Ϊ1
							out.get(i)[3]="1";
							break;
						}
				//System.out.println("x:"+x);
			}
		else {//����
			ArrayList<String> temp=new ArrayList<String>();
			for(int i=0;i<out.size();i++){
				//System.out.println("***********"+i+"*********************");
				if(t.getName().equals(out.get(i)[0])){
					//System.out.println("2222222222222222222222222222222");
					String r=out.get(i)[1];
					//System.out.println("2222222222222222222222222222222 r: "+r);
					if(temp.size()!=0){
						//System.out.println("temp.size()"+temp.size());
						int len=temp.size();
						for(int j=0;j<len;j++){
							//System.out.println("4444444444444444444444444444444444444j: "+j);
							if(temp.get(j).equals(r)){
								//x=x+1;
								//System.out.println("33333333333333333333333333333333r: "+r);
								temp.add(r);
							
							}
							
						}
					}
					else{
						//System.out.println("333333333333333333333");
						//x=x+1;
						temp.add(r);
					}
					
				}
			}//System.out.println("x:"+x);
			num4Class=temp.size();
		}
			//System.out.println("***********************************************************"+superId+"x:"+x);	
			//���˷�������
			for(int j=0;j<num4Class;j++){
				System.out.println("*******************����"+t.getName()+j);
				String s = null;
				InstanceNode in = null;
				if(superId!=null){//���Ǹ��࣬��Ҫ��������뵽����������б���
					s = superId.getObjectInstance()+","+ t.getName()+"Id=100"+j;
					in = new InstanceNode();
					in.setObjectClass(t.getName()+"T");
					in.setObjectInstance(s);
					in.setId(t.getName()+"Id=100"+j);
					try {
						//���÷��佨�������࣬�����ʵ��
						in.creatObject(in.getObjectClass(),"100"+j);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					superId.addChildInatanceNode(in);
//					System.out.println(j+":"+s);
					System.out.println("******************************�Ѵ���Ǹ���");
				}
				else{//�Ǹ��࣬û�и��࣬�������κνڵ�������б���
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
					System.out.println("******************************�Ѵ������");
				}
				for(int i=0;i<t.getsubordinateClass().size();i++){//������ȱ���
					System.out.println("******************************"+ t.getName()+"  ������ȱ���"+i);
					iteratorValue(t.getsubordinateClass().get(i),in,out);
					System.out.println("***************************�˳�"+ t.getName()+"  ������ȱ���"+i);
				}
			}
		}
	}
	public ArrayList<InstanceNode> getInstanceRootList(){//���ʵ���������б�
		return instanceRootList;
	}
	public static void main(String[] args) throws IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		GenerateByGyy gi = new GenerateByGyy();
		CreatContainTree cct = new CreatContainTree("src/resource/relationship.xml");
//		HashMap<String,Integer> h = new HashMap<String, Integer>();
//		h.put("School",1);
//		h.put("Class",2);
//		h.put("Student",4);
//		h.put("Teacher",4);
		///*������ʽ������������˽�� gyy added 2016-3-31
		String in="School contains 3 Class$Class contains 3 Student$Class contains 2 Student$Class contains 1 Student$School contains 2 Teacher$School contains 2 Class$Class contains 1 Student$Class contains 1 Student$School contains 3 Teacher$";
		//out��ÿһ������Ĳ��� School Class 3 0 ��ʾSchool����3��Class������'0'��ʾ�˹�ϵδ����ʵ������
		ArrayList<String[]> out=Rule4Containment1.ContainmentGenerator.generate(in);
//		for(int i=0;i<out.size();i++){
//			System.out.println("out"+i+out.get(i)[0]);
//			System.out.println("out"+i+out.get(i)[1]);
//			System.out.println("out"+i+out.get(i)[2]);
//			System.out.println("out"+i+out.get(i)[3]);
//		}
		//*/
		for(int i=0;i<cct.getRootList().size();i++){//�м�������������
			//����İ�����ϵ������ĳ�ʵ���İ�����ϵ�����
			System.out.println("��"+i+"����***************************Name : "+cct.getRootList().get(i).getName());
			gi.iteratorValue(cct.getRootList().get(i),null,out);
		}
		ArrayList<InstanceNode> instanceRootList = gi.getInstanceRootList();//�õ�����ʵ��
		Vector<InstanceNode> result = new Vector<InstanceNode>();
		for(int i=0;i<instanceRootList.size();i++){
			if(instanceRootList.get(i).getChildInatance().size()>0){
				read(instanceRootList.get(i),result);//�����нڵ�ŵ�result��ȥ
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
        Element root = document.addElement("root");//����ĵ���
		for(int i=0;i<result.size();i++){
			writeOne(result.get(i),root);
		}
		OutputFormat format = OutputFormat.createPrettyPrint();  
        format.setEncoding("GBK");//������Ҫ���ñ���  
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
	
	public static void read(InstanceNode in,Vector<InstanceNode> ins){//��ȱ���ʵ����������Vector��
		ins.add(in);
		for(int i=0;i<in.getChildInatance().size();i++){
			read(in.getChildInatance().get(i),ins);
		}
	}
	private static void writeOne(InstanceNode n,Element root){//��һ���ڵ�д��xml�ĵ�
        Element request = root.addElement(n.getObjectClass().substring(0, n.getObjectClass().length()-1));
        Element objectClass = request.addElement("ObjectClass");
        objectClass.addText(n.getObjectClass().substring(0, n.getObjectClass().length()-1));
        Element objectInstance = request.addElement("ObjectInstance");
        objectInstance.addText(n.getObjectInstance());
        Element id = request.addElement("ID");
        id.addText(n.getId());
        //gyy add 2016-3-15 
        ///*
		String ty=n.getObjectClass();
		//System.out.print("����"+ty);
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
