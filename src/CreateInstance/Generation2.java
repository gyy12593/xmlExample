package CreateInstance;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
import java.util.Vector;

//import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

//import XSDToJava.DNSetType;


public class Generation2 {
private ArrayList<InstanceNode> instanceRootList;//������������ʵ��
public static ArrayList<String[]> idList=new ArrayList<String[]>();//��������ʵ����ObjectClass�Լ�ObjectInstance
public static Vector<InstanceNode> result = new Vector<InstanceNode>();//��������ʵ��
public Generation2(){
	instanceRootList = new ArrayList<InstanceNode>();
}
//����İ�����ϵ������ĳ�ʵ���İ�����ϵ����� ����˺��ӵķ������� gyy added 2016-4-12
//�����ǽ�ÿ�����׵ĺ��������̶�
public void iteratorValue(TreeNode t,InstanceNode superId,ArrayList<String[]> out) throws IllegalArgumentException, InvocationTargetException {
		if(t!=null){
			//���˷�����ʼ gyy 2016-4-12
			
			int num4Class =0;
			for(int i=0;i<out.size();i++){
				if(t.getName().equals(out.get(i)[1])){
					num4Class=Integer.parseInt(out.get(i)[2]);
					//System.out.println(t.getName()+"������="+num4Class);
					break;
				}
			}
			//���˷�������
			for(int j=0;j<num4Class;j++){
				String s = null;
				InstanceNode in = null;
				if(superId!=null){//���Ǹ��࣬��Ҫ��������뵽����������б���
					s = superId.getObjectInstance()+","+ t.getName()+"Id=100"+j;
					in = new InstanceNode();
					in.setObjectClass(t.getName()+"T");
					in.setObjectInstance(s);
					String a[]=new String[]{t.getName(),s};
					idList.add(a);
					in.setId(t.getName()+"Id=100"+j);
//					try {
//						//���÷��佨�������࣬�����ʵ��
//						in.creatObject(in.getObjectClass(),"100"+j);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					superId.addChildInatanceNode(in);
//					System.out.println(j+":"+s);
					//System.out.println("******************************�Ѵ���Ǹ���");
				}
				else{//�Ǹ��࣬û�и��࣬�������κνڵ�������б���
					s = t.getName()+"Id=100"+j;
					in = new InstanceNode();
					in.setObjectClass(t.getName()+"T");
					in.setObjectInstance(s);
					String a[]=new String[]{t.getName(),s};					
					idList.add(a);
					in.setId(s);
//					try {
//						in.creatObject(in.getObjectClass(),"100"+j);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					instanceRootList.add(in);
					//System.out.println("******************************�Ѵ������");
				}
				for(int i=0;i<t.getsubordinateClass().size();i++){//������ȱ���
					//System.out.println("******************************"+ t.getName()+"  ������ȱ���"+i);
					iteratorValue(t.getsubordinateClass().get(i),in,out);
					//System.out.println("***************************�˳�"+ t.getName()+"  ������ȱ���"+i);
				}
			}
		}
	}
public ArrayList<InstanceNode> getInstanceRootList(){//���ʵ���������б�
		return instanceRootList;
}
public static void main(String[] args) throws IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Generation2 gi = new Generation2();
		CreatContainTree cct = new CreatContainTree("src/resource/relationship.xml");
		///*������ʽ������������˽�� gyy added 2016-4-12
		String in="root contains 1 School$every School contains 2 Class$every Class contains 1 Student$every School contains 2 Teacher$";
		//out��ÿһ������Ĳ��� School Class 3 0 ��ʾSchool����3��Class������'0'��ʾ�˹�ϵδ����ʵ������
		ArrayList<String[]> out=Rule4Containment2.ContainmentGenerator.generate(in);
		
		//*/
		for(int i=0;i<cct.getRootList().size();i++){//�м�������������
			//����İ�����ϵ������ĳ�ʵ���İ�����ϵ�����
			//System.out.println("��"+i+"����***************************Name : "+cct.getRootList().get(i).getName());
			gi.iteratorValue(cct.getRootList().get(i),null,out);
		}
		ArrayList<InstanceNode> instanceRootList = gi.getInstanceRootList();//�õ�����ʵ��
		//Vector<InstanceNode> result = new Vector<InstanceNode>();//Ӧ����Ϊȫ�ֱ���
		for(int i=0;i<instanceRootList.size();i++){
			if(instanceRootList.get(i).getChildInatance().size()>0){
				read(instanceRootList.get(i),result);//�����нڵ�ŵ�result��ȥ
			}
			else{
				result.add(instanceRootList.get(i));
			}
		}		
		//���ʵ��gyy add 5-11
		//System.out.println("result.size()  :  "+result.size());
		for(int i=0;i<result.size();i++){
			try {
				//���÷��佨�������࣬�����ʵ��,�����ID������
//				String[] ids=result.get(i).getObjectInstance().split(",");
//				String id=ids[ids.length-1].split("=")[1];
//				result.get(i).creatObject(result.get(i).getObjectClass(),id);
				//���÷��佨�������࣬�����ʵ��,�����ID��DN
				String id=result.get(i).getObjectInstance();
				result.get(i).creatObject(result.get(i).getObjectClass(),id);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println("size: "+result.size());
		int len=gi.idList.size();
//		System.out.println(len);
//        for(int i=0;i<len;i++) {
//        	System.out.println("*******************");
//        	System.out.println(gi.idList.get(i)[0]);
//        	System.out.println(gi.idList.get(i)[1]);
//        } 
        
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
        Element objectClass = request.addElement("objectClass");
        objectClass.addText(n.getObjectClass().substring(0, n.getObjectClass().length()-1));
        Element objectInstance = request.addElement("objectInstance");
        objectInstance.addText(n.getObjectInstance());
//        Element id = request.addElement("ID");
//        id.addText(n.getId());
        //////////////////////////////////////////////////////////////////////////////////////*gyy added 2016-5-4
        ArrayList<Field> fields = new ArrayList<Field>();//�����������
        //��ñ�������
        Field[] field = n.getObject().getClass().getDeclaredFields(); // ��ȡʵ������������ԣ�����Field����
        for (int j = 0; j < field.length; j++) { // ������������
        	String type = field[j].getGenericType().toString(); // ��ȡ���Ե�����
        	fields.add(field[j]);
        }
        //��ø�������
        Class<?> demo=null;
        try {
        	demo=Class.forName("XSDToJava."+n.getObjectClass().substring(0, n.getObjectClass().length()-1)+"T");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        ArrayList<Class<?>> list = new ArrayList<Class<?>>();
        getFatherClass(demo,list);
        for(int i=0;i<list.size();i++){
        	Field f[] = list.get(i).getDeclaredFields();
        	for(int j=0;j<f.length;j++){
        		fields.add(f[j]);
        		//field.
        	}
        }      
        try {
            for (int j = 0; j < fields.size(); j++) { // ������������
                String name = fields.get(j).getName(); // ��ȡ���Ե�����
                name = name.substring(0, 1).toUpperCase() + name.substring(1); // �����Ե����ַ���д�����㹹��get��set����
                String type = fields.get(j).getGenericType().toString(); // ��ȡ���Ե�����            
                Method m = n.getObject().getClass().getMethod("get" + name);
               /* ��ȡ���Ե�ֵvalue
                * ��Ϊ����
                * һ����Java�������
                * һ�����û��Զ�����࣬��Ҫ����õ�����ȡֵ����
                * flag4Type �Ƿ����Զ������͵ı�־��0Ϊ���ǣ�1Ϊ��
                */
                Object value= m.invoke(n.getObject()); // ����getter������ȡ����ֵ
                Element ele=request.addElement(fields.get(j).getName());
                if(value!=null){ 
                	int flag4Type=0;//�Ƿ����Զ������͵ı�־��0Ϊ���ǣ�1Ϊ��
                	String[] a1=type.split(" ");
            		//System.out.println("a1 "+a1.length);
            		if(a1.length>1){
            			String[] a2=a1[1].split("\\.");
            			if(("XSDToJava").equals(a2[0])){
            				flag4Type=1;
            			}
            		}
                	if(flag4Type==1){	
                		Class<?> demo4T=null;
               		 	Object obj = null;
               		 	try {
               		 	    demo4T=Class.forName(type.split(" ")[1]);
               		 		obj = demo4T.newInstance();
               		 		Field field4T[] = demo4T.getDeclaredFields();//���������
               		 		for(int i=0;i<field4T.length;i++){
	               				Class<?> typeT = field4T[i].getType();
	               				String att = field4T[i].getName();
	               				String ty=typeT.getName();
	               				if(ty.equals("java.util.List")){
	               					Method method = obj.getClass().getMethod("get"+att.replaceFirst(att.substring(0, 1),att.substring(0, 1).toUpperCase()));
	               				    ArrayList list4T=(ArrayList) method.invoke(value);
	               				    //System.out.println("list4T.size *******************"+list4T.size());
	               				    for(int num=0;num<list4T.size();num++){
	               					   Element elt = ele.addElement("dn");//Ϊ�ڵ�����ӽڵ�
	               					   elt.addText(list4T.get(num).toString());
	               				    }
	               				}
            			}
            	     } catch (ClassNotFoundException e) {
            				// TODO Auto-generated catch block
            				e.printStackTrace();
            			} catch (InstantiationException e) {
            				// TODO Auto-generated catch block
            				e.printStackTrace();
            			} catch (IllegalAccessException e) {
            				// TODO Auto-generated catch block
            				e.printStackTrace();
            			} catch (SecurityException e) {
            				// TODO Auto-generated catch block
            				e.printStackTrace();
            			}
            			catch (NoSuchMethodException e) {
            				// TODO Auto-generated catch block
            				e.printStackTrace();
            			} catch (IllegalArgumentException e) {
            				// TODO Auto-generated catch block
            				e.printStackTrace();
            			}           			
                	}
	                else{
	                	 ele.addText(value.toString());
	                }
                }
                else{
                	 ele.addText("NULL");
                }
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
      ///*gyy added
	}
	
private static void getFatherClass(Class<?> demo,ArrayList<Class<?>> list){//��ȡĳ��������и���
		if(!demo.getSuperclass().getSimpleName().equals("Object")&&!demo.getSuperclass().getSimpleName().equals("ManagedObjectT")){
			list.add(demo.getSuperclass());
			getFatherClass(demo.getSuperclass(),list);
		}
	}
}
