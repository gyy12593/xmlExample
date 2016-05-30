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
private ArrayList<InstanceNode> instanceRootList;//保存包含根类的实例
public static ArrayList<String[]> idList=new ArrayList<String[]>();//保存所有实例的ObjectClass以及ObjectInstance
public static Vector<InstanceNode> result = new Vector<InstanceNode>();//保存所有实例
public Generation2(){
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
					//System.out.println(t.getName()+"的数量="+num4Class);
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
					String a[]=new String[]{t.getName(),s};
					idList.add(a);
					in.setId(t.getName()+"Id=100"+j);
//					try {
//						//利用反射建立具体类，并填充实例
//						in.creatObject(in.getObjectClass(),"100"+j);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
					superId.addChildInatanceNode(in);
//					System.out.println(j+":"+s);
					//System.out.println("******************************已处理非根类");
				}
				else{//是根类，没有父类，不加入任何节点的子类列表中
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
		Generation2 gi = new Generation2();
		CreatContainTree cct = new CreatContainTree("src/resource/relationship.xml");
		///*利用形式化描述获得拓扑结果 gyy added 2016-4-12
		String in="root contains 1 School$every School contains 2 Class$every Class contains 1 Student$every School contains 2 Teacher$";
		//out的每一项均有四部分 School Class 3 0 表示School包含3个Class，而且'0'表示此关系未加入实例拓扑
		ArrayList<String[]> out=Rule4Containment2.ContainmentGenerator.generate(in);
		
		//*/
		for(int i=0;i<cct.getRootList().size();i++){//有几棵树遍历几次
			//将类的包含关系多叉树改成实例的包含关系多叉树
			//System.out.println("第"+i+"棵树***************************Name : "+cct.getRootList().get(i).getName());
			gi.iteratorValue(cct.getRootList().get(i),null,out);
		}
		ArrayList<InstanceNode> instanceRootList = gi.getInstanceRootList();//得到所有实例
		//Vector<InstanceNode> result = new Vector<InstanceNode>();//应该设为全局变量
		for(int i=0;i<instanceRootList.size();i++){
			if(instanceRootList.get(i).getChildInatance().size()>0){
				read(instanceRootList.get(i),result);//把树中节点放到result中去
			}
			else{
				result.add(instanceRootList.get(i));
			}
		}		
		//填充实例gyy add 5-11
		//System.out.println("result.size()  :  "+result.size());
		for(int i=0;i<result.size();i++){
			try {
				//利用反射建立具体类，并填充实例,传入的ID是数字
//				String[] ids=result.get(i).getObjectInstance().split(",");
//				String id=ids[ids.length-1].split("=")[1];
//				result.get(i).creatObject(result.get(i).getObjectClass(),id);
				//利用反射建立具体类，并填充实例,传入的ID是DN
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
        Element objectClass = request.addElement("objectClass");
        objectClass.addText(n.getObjectClass().substring(0, n.getObjectClass().length()-1));
        Element objectInstance = request.addElement("objectInstance");
        objectInstance.addText(n.getObjectInstance());
//        Element id = request.addElement("ID");
//        id.addText(n.getId());
        //////////////////////////////////////////////////////////////////////////////////////*gyy added 2016-5-4
        ArrayList<Field> fields = new ArrayList<Field>();//存放所有属性
        //获得本类属性
        Field[] field = n.getObject().getClass().getDeclaredFields(); // 获取实体类的所有属性，返回Field数组
        for (int j = 0; j < field.length; j++) { // 遍历所有属性
        	String type = field[j].getGenericType().toString(); // 获取属性的类型
        	fields.add(field[j]);
        }
        //获得父类属性
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
            for (int j = 0; j < fields.size(); j++) { // 遍历所有属性
                String name = fields.get(j).getName(); // 获取属性的名字
                name = name.substring(0, 1).toUpperCase() + name.substring(1); // 将属性的首字符大写，方便构造get，set方法
                String type = fields.get(j).getGenericType().toString(); // 获取属性的类型            
                Method m = n.getObject().getClass().getMethod("get" + name);
               /* 获取属性的值value
                * 分为两类
                * 一类是Java本身的类
                * 一类是用户自定义的类，需要反射得到类型取值方法
                * flag4Type 是否是自定义类型的标志，0为不是，1为是
                */
                Object value= m.invoke(n.getObject()); // 调用getter方法获取属性值
                Element ele=request.addElement(fields.get(j).getName());
                if(value!=null){ 
                	int flag4Type=0;//是否是自定义类型的标志，0为不是，1为是
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
               		 		Field field4T[] = demo4T.getDeclaredFields();//本类的属性
               		 		for(int i=0;i<field4T.length;i++){
	               				Class<?> typeT = field4T[i].getType();
	               				String att = field4T[i].getName();
	               				String ty=typeT.getName();
	               				if(ty.equals("java.util.List")){
	               					Method method = obj.getClass().getMethod("get"+att.replaceFirst(att.substring(0, 1),att.substring(0, 1).toUpperCase()));
	               				    ArrayList list4T=(ArrayList) method.invoke(value);
	               				    //System.out.println("list4T.size *******************"+list4T.size());
	               				    for(int num=0;num<list4T.size();num++){
	               					   Element elt = ele.addElement("dn");//为节点添加子节点
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
	
private static void getFatherClass(Class<?> demo,ArrayList<Class<?>> list){//获取某个类的所有父类
		if(!demo.getSuperclass().getSimpleName().equals("Object")&&!demo.getSuperclass().getSimpleName().equals("ManagedObjectT")){
			list.add(demo.getSuperclass());
			getFatherClass(demo.getSuperclass(),list);
		}
	}
}
