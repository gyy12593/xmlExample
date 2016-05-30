package CreateInstance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
//import java.util.List;
//import java.util.List;
import java.util.Random;

//import javax.lang.model.element.Element;
//import org.dom4j.Element;

import Rule6.*;
//import XSDToJava.DNSetType;



//���ɵ���ʵ�����
public class InstanceNode {
	private String objectClass;
	private String objectInstance;
	private String id;
	private Object object;
	
	private LinkedList<InstanceNode> childrenList;
	
	public InstanceNode(){
		childrenList = new LinkedList<InstanceNode>();
	}
	public String getObjectClass(){
		return objectClass;
	}
	public String getObjectInstance(){
		return objectInstance;
	}
	public String getId(){
		return id;
	}
	public void setId(String s){
		this.id = s;
	}
	public void setObjectClass(String _objectClass){
		this.objectClass = _objectClass;
	}
	public void setObjectInstance(String _objectInstance){
		this.objectInstance = _objectInstance;
	}
	
	public void addChildInatanceNode(InstanceNode s){
		childrenList.add(s);
	}
	public LinkedList<InstanceNode> getChildInatance(){
		return childrenList;
	}
	public Object getObject(){
		return object;
	}
	
	//���÷��佨�������࣬�����ʵ��
	public void creatObject(String className,String ID) throws IOException, IllegalArgumentException, InvocationTargetException{
		 Class<?> demo=null;
		 Object obj = null;
	     try {
			demo=Class.forName("XSDToJava."+className);
			obj = demo.newInstance();
			//*****************����������*********************
			//System.out.println("class::::::::::::::::::::::::::"+className);
			Field field[] = demo.getDeclaredFields();//���������
			int flag=0;//���������Ƿ��������ļ����ҵ��ı�־��0Ϊû���ҵ�       ��λλ��     �����޸�
			int flag1=0;//���������Ƿ��������ļ����ҵ��ı�־��0Ϊû���ҵ�
			FileReader reader = null;
			try {
				reader = new FileReader("E:\\��Ŀ\\test.txt");
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			BufferedReader br = new BufferedReader(reader);
			ArrayList<String> ss= new ArrayList<String>();
			String s=null;
			  try {
				while((s = br.readLine()) != null) {
					if("end".equals(s)){
						break;
					}
					ss.add(s);
					//System.out.println("s============================================"+s);
				  }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 br.close();
			 reader.close();
			for(int i=0;i<field.length;i++){
				Class<?> type = field[i].getType();
//				//////////////////////////////////////////////////////////*gyy added 2016-3-28
				String att = field[i].getName();
				//String ty=type.getName();
				//System.out.println("******"+className+" "+att+" "+ty+" "+att+"$"+ty+"$");
				//System.out.println("*************************************"+className+" "+att+" flag="+flag);
				String input=className+" "+att;
				ArrayList<String> output=null;
				//System.out.println("******************************************************input : "+input);
				for(int i1=0;i1<ss.size();i1++){
					//System.out.println(i+" "+ss.get(i));
					if(ss.get(i1)!=null){
						//System.out.println("����if");
						String[] temp=ss.get(i1).split("\\$");
						String te=temp[0]+" "+temp[1];
						//String in=temp[3];	
						String in=ss.get(i1);
						if(te.equals(input)){
							//System.out.println("*************************************����flag==1");
							flag=1;
							int flag4Association=0;//������ϵ�ı�־
							//������ϵ�Ĵ���
							String[] strings=temp[temp.length-1].split(" ");
							for(int a=0;a<strings.length;a++){
								if(("ASSOCIATION").equals(strings[a])){
									flag4Association=1;
								}
							}
							
//							if(temp.length>4){
//								for(int j=4;j<temp.length;j++)
//									in+=" "+temp[j];//�Է����ɹ������ж���ո�����INTEGER 23 34$
//							}
							//System.out.println("******************************in : "+in);
							
								output=generate.generate(in);//������д����������������������������������������������������
								//System.out.println("���ɽ����"+output);
								String str = field[i].getName();
								Method method = null;
								try {
									if(type.getName().equals("java.math.BigInteger")){
										//System.out.println("����java.math.BigInteger");
										BigInteger ou = new BigInteger(output.get(0));
										method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),BigInteger.class);
										//System.out.println("�뿪java.math.BigInteger");
										//System.out.println("output"+output);
				            			method.invoke(obj,ou);
									}
									else if(type.getName().equals("java.lang.String")){
										//System.out.println("����java.lang.String");
										method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),String.class);
										method.invoke(obj,output.get(0));
									}
									else if(type.getName().equals("java.lang.Integer")){
										//ע������ת��
										//System.out.println("����java.lang.Integer");
										Integer integer=Integer.valueOf(output.get(0));
										method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),String.class);
										method.invoke(obj,integer);
									}
									else if(type.getName().equals("int")){
										//ע������ת��
										//System.out.println("����int");
										int integer=Integer.valueOf(output.get(0));
										method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),int.class);
										method.invoke(obj,integer);
									}
									//�����������͵Ĵ���
									else if(("XSDToJava").equals(type.getName().split("\\.")[0])){				
										//������
										
										//String addedType=type.getName();
										String TypeName =type.getName().split("\\.")[1];
										//System.out.println(str+"++++++++++++++++++++++++����DNSetType");
										//Object ob=Assignment(TypeName,output);
										method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),type);
										
										 Class<?> demo1=null;
										//  obj1=null;
										 demo1=Class.forName(type.getName());
										 Object obj1 = demo1.newInstance();
										// List<String> list = new LinkedList<String>();
										obj1=Assignment(TypeName,output);
//										for(int o=0;o<output.size();o++)
//											System.out.println(str+"======================output================"+o+"++++++++++++++++"+output.get(o));
//			
//										//��������Ϊʵ�����
//										XSDToJava.DNSetType temp1=(DNSetType) obj1;
//										List<String> temp2=temp1.getDn();
//										for(int o=0;o<temp2.size();o++)
//											System.out.println(str+"============================="+o+"++++++++++++++++"+temp2.get(o));
										method.invoke(obj,obj1);
						            }
								} catch (NoSuchMethodException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								//���ڹ�����ϵ�����ɽ���Ĵ���������˫�������toClass���������
								if(flag4Association==1){
									//��Ҫȷ����˫���������Ҫ���д˲���
								    //�鿴������ϵ���õ���������
									//�������������ҹ�����ϵ
									//System.out.println("���������ϵ�ķ���");
									AssociationAnalysis nodeL=new AssociationAnalysis("src/resource/relationship.xml");
									ArrayList<AssociationNode> node=nodeL.nodeList;
									String attName4ToClass=null;//toClass��������
									String claName4ToClass=null;
									int flag4Direction=0;//flag4Direction��ʾ���ڹ�����ϵ�ķ�����˫��ı�־
									for(int io=0;io<node.size();io++){
										if(node.get(io).getFromAssociationAttribute().equals(att)){
											if(node.get(io).getAssociationDirection().equals("bidirectional")){
												flag4Direction=1;
												attName4ToClass=node.get(io).getToAssociationAttribute();//toClass��������
												claName4ToClass=node.get(io).getToClass();
												break;		
											}
										}
									}
									//ȷ����˫��֮�����toClass��������Խ�������ֵ�ĸ�ֵ
									//��fromClass��DN������Ӧ������,����ID��ֵ������Ӧ������
									if(flag4Direction==1){
										//System.out.println("���������ϵ��˫���ϵ�ķ���");
										for(int reNum=0;reNum<output.size();reNum++){
											//����dn�ҵ�����ʵ��������Ӧ�����м���fromClass��Dn
											//System.out.println("output["+reNum+"]��"+output.get(reNum));
											String dn=output.get(reNum);
											for(int jj=0;jj<Generation2.result.size();jj++){
												if(Generation2.result.get(jj).getObjectInstance().equals(dn)){	
													//System.out.println("�ҵ�ʵ��");
													//System.out.println("�ҵ�����"+attName4ToClass);
													ArrayList<Field> fields = new ArrayList<Field>();//�����������
											        //��ñ�������
											      //  Field[] fields4Personal = Generation2.result.get(jj).getClass().getDeclaredFields(); // ��ȡʵ������������ԣ�����Field����
											        Field[] fields4Personal=Class.forName("XSDToJava."+Generation2.result.get(jj).objectClass).getDeclaredFields();
											        for (int f = 0; f < fields4Personal.length; f++) { // ������������
											        	//String type = fields4Personal[f].getGenericType().toString(); // ��ȡ���Ե�����
											        	fields.add(fields4Personal[f]);
											        }
											        //��ø�������
											        Class<?> demo4Father=null;
													try {
														demo4Father = Class.forName("XSDToJava."+Generation2.result.get(jj).objectClass);
													} catch (ClassNotFoundException e) {
														// TODO Auto-generated catch block
														e.printStackTrace();
													}
											        ArrayList<Class<?>> list = new ArrayList<Class<?>>();
											        getFatherClass(demo4Father,list);
											        for(int listNum=0;listNum<list.size();listNum++){
											        	Field f[] = list.get(listNum).getDeclaredFields();
											        	for(int jf=0;jf<f.length;jf++){
											        		fields.add(f[jf]);
											        		//field.
											        	}
											        }  
											        //System.out.println("fields"+fields.size());
													//�������ԣ��ҵ���Ҫ��ӵ�����
											        for (int jf = 0; jf < fields.size(); jf++) { 
											        	//�ҵ���Ҫ������Ե����ͣ�������ֵ����
											        	//System.out.println("fields.get(jf).getName()"+fields.get(jf).getName());
											        	if(attName4ToClass.equals(fields.get(jf).getName())){
											        		//System.out.println("�ҵ�����"+attName4ToClass);
											        		Class<?> type4Att = fields.get(jf).getType();
											        		String FCDN=ID;//fromClass��DN
											        		Method method4Att=null;
											        		//�����������û��Զ�������
											        		if(("XSDToJava").equals(type4Att.getName().split("\\.")[0])){	
											        			String TypeName =type4Att.getName().split("\\.")[1];
																ArrayList<String> FNS=new ArrayList<String>();
																FNS.add(FCDN);
																try {
																	method4Att = Class.forName("XSDToJava."+Generation2.result.get(jj).objectClass).getMethod("get"+attName4ToClass.replaceFirst(attName4ToClass.substring(0, 1),attName4ToClass.substring(0, 1).toUpperCase()));
																} catch (SecurityException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																} catch (NoSuchMethodException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
																
																 Class<?> demo1=null;
																//  obj1=null;
																 try {
																	demo1=Class.forName(type4Att.getName());
																} catch (ClassNotFoundException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
																 Object obj1;
																try {
																	obj1 = demo1.newInstance();
																} catch (InstantiationException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																} catch (IllegalAccessException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
																obj1=Assignment(TypeName,FNS);		
																//System.out.print("�������ͣ� "+obj1.getClass().getName());
																//System.out.print("��ֵ���ͣ� "+Generation2.result.get(jj).getObject().getClass().getName());
																try {
																	//method4Att.invoke(Generation2.result.get(jj).getObject());//?????????????????????????
																	try {
																		Object temp2=method4Att.invoke(Generation2.result.get(jj).getObject());
																		//System.out.print("��������temp2 �� "+temp2.getClass().getName());
																		Method method2 = temp2.getClass().getMethod("getDn");
																		Object temp1=method2.invoke(temp2);
																		//System.out.print("��������temp1 �� "+temp1.getClass().getName());
																		Method method3=temp1.getClass().getMethod("add",Object.class);
																		method3.invoke(method2.invoke(method4Att.invoke(Generation2.result.get(jj).getObject())), ID);
																	} catch (NoSuchMethodException e) {
																		// TODO Auto-generated catch block
																		e.printStackTrace();
																	}
																} catch (IllegalArgumentException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																} catch (IllegalAccessException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																} catch (InvocationTargetException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
											        		}
											        		//���������Ƿ��û��Զ�������
											        		else{
											        			Object in4Att=FCDN;
											        			try {            
																	method4Att = Class.forName("XSDToJava."+Generation2.result.get(jj).objectClass).getMethod("set"+attName4ToClass.replaceFirst(attName4ToClass.substring(0, 1),attName4ToClass.substring(0, 1).toUpperCase()),type4Att);
																} catch (SecurityException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																} catch (NoSuchMethodException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
																try {
																	method4Att.invoke(Generation2.result.get(jj),in4Att);
																} catch (IllegalArgumentException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																} catch (IllegalAccessException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																} catch (InvocationTargetException e) {
																	// TODO Auto-generated catch block
																	e.printStackTrace();
																}
											        		}
											        	}
											        }
												}
											}
										}
									}
								}
	
						}
					}
				}
				
				
//				//*/
				if(flag==0){
					//System.out.println("*************************************"+"����flag==0");
					if(type.getName().equals("java.math.BigInteger")){
						try{
							String[] ids=ID.split(",");
							//System.out.println("ID=================================== :"+ID);
							String id=ids[ids.length-1].split("=")[1];
							String str = field[i].getName();
		            		BigInteger bi = new BigInteger(id);//��ʵ��ID��ֵ
		            		//System.out.println("******************"+att+"ID : "+ID);
		            		Method method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),BigInteger.class);
		            		method.invoke(obj,bi);
		            	}catch(Exception e){
		            		e.printStackTrace(); 
		            	}
					}
					else if(type.getName().equals("java.lang.String")){//��������ΪStringʱ
						try {
							String str = field[i].getName();
							Method method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),String.class);
							String[] sos = new String[1];
							sos[0] = getRandomString(5);//������ɲ���
							method.invoke(obj,sos[0]);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else if(type.getName().equals("java.lang.Integer")){
						Random r = new Random();
		            	int x = r.nextInt(300);//������ɲ���
		            	try{
		            		String str = field[i].getName();
		            		Method method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),String.class);
		            		method.invoke(obj,x);
		            	}catch(Exception e){
		            		e.printStackTrace();
		            	}
					}
					
				}
				flag=0;
			}
//			System.out.println("********************************���������*********************************");
//			System.out.println("********************************�����࿪ʼ*********************************");
			//******************************����������**********************
	        // ȡ��ʵ�ֵĽӿڻ��߸��������
			ArrayList<Class<?>> list = new ArrayList<Class<?>>();
	        ArrayList<Field> field1 = new ArrayList<Field>();
	        getFatherClass(demo,list);
	        for(int i=0;i<list.size();i++){
	        	Field f[] = list.get(i).getDeclaredFields();
	        	for(int j=0;j<f.length;j++){
	        		field1.add(f[j]);
	        	}
	        }
	        //��ʼ��ֵ
	        for (int j = 0; j < field1.size(); j++) {
	            // Ȩ�����η�
	            Class<?> type = field1.get(j).getType();
//	            ///*gyy add 
	            String att=field1.get(j).getName();
	            String ty=type.getName();
	           // System.out.println("******"+className+" "+att+" "+ty+" "+att+"$"+ty+"$");
//	            //*/
				
	            String input=className+" "+att;
				ArrayList<String> output=null;
				for(int i1=0;i1<ss.size();i1++){
					//System.out.println(i+" "+ss.get(i));
					if(ss.get(i1)!=null){
						//System.out.println("����if");
						String[] temp=ss.get(i1).split("\\$");
						String te=temp[0]+" "+temp[1];
						String in=ss.get(i1);
						if(te.equals(input)){
							//System.out.println("����flag==1");
							flag1=1;
//							if(temp.length>4){
//								for(int jj=4;jj<temp.length;jj++)
//									in+=" "+temp[jj];//�Է����ɹ������ж���ո�����INTEGER 23 34$
//							}
							//System.out.println("in : "+in);
							output=generate.generate(in);
							//System.out.println("���ɽ��    R 2 ��"+output);
							String str = field1.get(j).getName();
							Method method = null;
							try {
								if(type.getName().equals("java.math.BigInteger")){
									//System.out.println("����java.math.BigInteger");
									BigInteger ou = new BigInteger(output.get(0));
									method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),BigInteger.class);
									//System.out.println("�뿪java.math.BigInteger");
									//System.out.println("output"+output);
			            			method.invoke(obj,ou);
								}
								else if(type.getName().equals("java.lang.String")){
									//System.out.println("����java.lang.String");
									method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),String.class);
									method.invoke(obj,output.get(0));
								}
								else if(type.getName().equals("java.lang.Integer")){
									//ע������ת��
									//System.out.println("����java.lang.Integer");
									Integer integer=Integer.valueOf(output.get(0));
									method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),String.class);
									method.invoke(obj,integer);
								}
								else if(type.getName().equals("int")){
									//ע������ת��
									//System.out.println("����int");
									int integer=Integer.valueOf(output.get(0));
									method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),int.class);
									method.invoke(obj,integer);
								}
								//�����������͵Ĵ���
								else if(("XSDToJava").equals(type.getName().split("\\.")[0])){				
									//System.out.println("����DNSetType");
									//String addedType=type.getName();
									String TypeName =type.getName().split("\\.")[1];
									//String str = field1.get(j).getName();
									//Object ob=Assignment(TypeName,output);
									//Method method = null;
									try {
										method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),type);
									} catch (NoSuchMethodException e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
									
									 Class<?> demo1=null;
									// Object obj1=null;
									 demo1=Class.forName(type.getName());
									 Object obj1 =demo1.newInstance();
									// List<String> listT = new LinkedList<String>();
									obj1=Assignment(TypeName,output);
//									
									method.invoke(obj,obj1);
									//obj=value;
				//	            	System.out.println(field[i].getName()+"!!!!");
					            }
							} catch (NoSuchMethodException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

						}
					}
				}
				
				
	            if(flag1==0){
		            if(type.getName().equals("java.lang.String")){//��������ΪStringʱ
						try {
							String[] s0 = new String[1];
							s0[0] = getRandomString(5);//������ɲ���
							String str = field1.get(j).getName();
							Method method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),String.class);
							method.invoke(obj,s0[0]);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
		            else if(type.getName().equals("java.math.BigInteger")){
		            	try{
		            		String str = field1.get(j).getName();
		            		BigInteger bi = new BigInteger(getRandomBigInt());//������ɲ���
		            		Method method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),BigInteger.class);
		            		method.invoke(obj,bi);
		            	}catch(Exception e){
		            		e.printStackTrace();
		            	}
		            }
		           else if(type.getName().equals("java.lang.Integer")){
		            	Random r = new Random();
		            	int x = r.nextInt(300);
		            	try{
		            		String str = field1.get(j).getName();
		            		Method method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),String.class);
		            		method.invoke(obj,x);
		            	}catch(Exception e){
		            		e.printStackTrace();
		            	}
					}
		       	
	           }
	            flag1=0;
	        }
//	        System.out.println("********************************���������*********************************");
//	        
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
	     this.object = obj;//���ܻ���ȫ�������ԣ�
	}

	private static String getRandomString(int length) { //��������ַ����ķ�����length��ʾ�����ַ����ĳ���  
	    String base = "abcdefghijklmnopqrstuvwxyz0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < length; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return sb.toString();     
	}
	private static String getRandomBigInt() { //�������BigInteger�ķ�����length��ʾ�����ַ����ĳ���  
	    String base = "0123456789";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < 6; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return sb.toString();     
	}
	private static void getFatherClass(Class<?> demo,ArrayList<Class<?>> list){//��ȡĳ��������и���
		if(!demo.getSuperclass().getSimpleName().equals("Object")&&!demo.getSuperclass().getSimpleName().equals("ManagedObjectT")){
			list.add(demo.getSuperclass());
			getFatherClass(demo.getSuperclass(),list);
		}
	}
	//Ϊ�Զ������͸�ֵ��Ҫ��list���� gyy added
	//����˼���ǽ�����������Ϊһ������������ȡ�ڲ���get�������ڱ������и�ֵ
	private static Object Assignment(String typeName, ArrayList<String> list){
		 Class<?> demo=null;
		 Object obj = null;
	     try {
			demo=Class.forName("XSDToJava."+typeName);
			obj = demo.newInstance();
			Field field[] = demo.getDeclaredFields();//���������
			for(int i=0;i<field.length;i++){
				Class<?> type = field[i].getType();
//				//////////////////////////////////////////////////////////*gyy added 2016-3-28
				String att = field[i].getName();
				String ty=type.getName();
				if(ty.equals("java.util.List")){
					//Method method = obj.getClass().getMethod("get"+att.replaceFirst(att.substring(0, 1),att.substring(0, 1).toUpperCase())+"().add",Object.class);
					Method method = obj.getClass().getMethod("get"+att.replaceFirst(att.substring(0, 1),att.substring(0, 1).toUpperCase()));
					//Method method2 = method.invoke(obj).getClass().getMethod("add",String.class);
					Method method2 = method.invoke(obj).getClass().getMethod("add",Object.class);
					//Method method2 = (List)method.invoke(obj).getMethod("add",String.class);
					for(int ii=0;ii<list.size();ii++){						
						method2.invoke(method.invoke(obj),list.get(ii));
					}
				}
			
//				System.out.println("name : "+att);
//				System.out.println("type : "+ty);
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
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
}
			
//			ArrayList<Object> temp=new ArrayList<Object>();
//			for(int i=0;i<len;i++){
//				temp.add(list.get(i));
//			}
//			String[] arrString =temp.toArray(new String[]{});
//			demo=(Class<?>) arrString;
			return  obj;
		}
	
}
