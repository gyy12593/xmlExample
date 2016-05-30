package CreateInstance;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

//import XSDToJava.ClassT;
import XSDToJava.StudentT;
/* gyy add 2016/1/7 15:59
 * 反射机制的测试
 * */
public class ReflectTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object obj = null;
		Class<?> demo = null;
		try {
			demo = Class.forName("XSDToJava.StudentT");
			System.out.println(demo.getName());
			obj = demo.newInstance();
			System.out.println("***************************本类属性********************");
	        // 取得本类的全部属性
	        Field[] field = demo.getDeclaredFields();
	        //开始赋值
	        for (int i = 0; i<field.length; i++) {
	            // 权限修饰符
	            int mo = field[i].getModifiers();
	            String priv = Modifier.toString(mo);
	            // 属性类型
	            Class<?> type = field[i].getType();
	            if(type.getName().equals("java.lang.String")){//属性类型为String时
					try {
						String[] s = new String[1];
						s[0] = getRandomString(5);//随机生成参数
						String str = field[i].getName();
						Method method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),String.class);
						method.invoke(obj,s[0]);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	            else if(type.getName().equals("java.math.BigInteger")){
	            	try{
	            		String str = field[i].getName();
	            		BigInteger bi = new BigInteger("1001");
	            		Method method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),BigInteger.class);
	            		method.invoke(obj,bi);
	            	}catch(Exception e){
	            		e.printStackTrace();
	            	}
	            }
	            System.out.println(priv + " " + type.getName() + " "
	                    + field[i].getName() + ";");
	        }
	        
	        System.out.println("********************父类的属性*********************");
	        // 取得实现的接口或者父类的属性
	        //第一步递归获取所有父类
	        ArrayList<Class<?>> list = new ArrayList<Class<?>>();
	        ArrayList<Field> field1 = new ArrayList<Field>();
	        getFatherClass(demo,list);
	        for(int i=0;i<list.size();i++){
	        	Field f[] = list.get(i).getDeclaredFields();
	        	for(int j=0;j<f.length;j++){
	        		field1.add(f[j]);
	        	}
	        }
	        //开始赋值
	        for (int j = 0; j < field1.size(); j++) {
	            // 权限修饰符
	            int mo = field1.get(j).getModifiers();
	            String priv = Modifier.toString(mo);
	            // 属性类型
	            Class<?> type = field1.get(j).getType();
	            if(type.getName().equals("java.lang.String")){//属性类型为String时
					try {
						String[] s = new String[1];
						s[0] = getRandomString(5);//随机生成参数
						String str = field1.get(j).getName();
						Method method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),String.class);
						method.invoke(obj,s[0]);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	            else if(type.getName().equals("java.math.BigInteger")){
	            	try{
	            		String str = field1.get(j).getName();
	            		BigInteger bi = new BigInteger("1001");
	            		Method method = obj.getClass().getMethod("set"+str.replaceFirst(str.substring(0, 1),str.substring(0, 1).toUpperCase()),BigInteger.class);
	            		method.invoke(obj,bi);
	            	}catch(Exception e){
	            		e.printStackTrace();
	            	}
	            }
	            System.out.println(priv + " " + type.getName() + " "
	                    + field1.get(j).getName() + ";");
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
		}
		System.out.println("***************************结果测试********************");
		StudentT ct = (StudentT)obj;
		System.out.println("stuNo:"+ct.getStudentNo());
		System.out.println("stuSex:"+ct.getSex());
		System.out.println("PersonID:"+ct.getPersonID());
		System.out.println("Name:"+ct.getPersonName());
	}
	
	public static String getRandomString(int length) { //随机生成字符串的方法，length表示生成字符串的长度  
	    String base = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < length; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return sb.toString();     
	} 
	
	public static void getFatherClass(Class<?> demo,ArrayList<Class<?>> list){//获取某个类的所有父类
		if(!demo.getSuperclass().getSimpleName().equals("Object")&&!demo.getSuperclass().getSimpleName().equals("ManagedObjectT")){
			list.add(demo.getSuperclass());
			getFatherClass(demo.getSuperclass(),list);
		}
	}

}
