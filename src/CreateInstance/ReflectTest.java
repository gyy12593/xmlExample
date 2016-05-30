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
 * ������ƵĲ���
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
			System.out.println("***************************��������********************");
	        // ȡ�ñ����ȫ������
	        Field[] field = demo.getDeclaredFields();
	        //��ʼ��ֵ
	        for (int i = 0; i<field.length; i++) {
	            // Ȩ�����η�
	            int mo = field[i].getModifiers();
	            String priv = Modifier.toString(mo);
	            // ��������
	            Class<?> type = field[i].getType();
	            if(type.getName().equals("java.lang.String")){//��������ΪStringʱ
					try {
						String[] s = new String[1];
						s[0] = getRandomString(5);//������ɲ���
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
	        
	        System.out.println("********************���������*********************");
	        // ȡ��ʵ�ֵĽӿڻ��߸��������
	        //��һ���ݹ��ȡ���и���
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
	            int mo = field1.get(j).getModifiers();
	            String priv = Modifier.toString(mo);
	            // ��������
	            Class<?> type = field1.get(j).getType();
	            if(type.getName().equals("java.lang.String")){//��������ΪStringʱ
					try {
						String[] s = new String[1];
						s[0] = getRandomString(5);//������ɲ���
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
		System.out.println("***************************�������********************");
		StudentT ct = (StudentT)obj;
		System.out.println("stuNo:"+ct.getStudentNo());
		System.out.println("stuSex:"+ct.getSex());
		System.out.println("PersonID:"+ct.getPersonID());
		System.out.println("Name:"+ct.getPersonName());
	}
	
	public static String getRandomString(int length) { //��������ַ����ķ�����length��ʾ�����ַ����ĳ���  
	    String base = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";     
	    Random random = new Random();     
	    StringBuffer sb = new StringBuffer();     
	    for (int i = 0; i < length; i++) {     
	        int number = random.nextInt(base.length());     
	        sb.append(base.charAt(number));     
	    }     
	    return sb.toString();     
	} 
	
	public static void getFatherClass(Class<?> demo,ArrayList<Class<?>> list){//��ȡĳ��������и���
		if(!demo.getSuperclass().getSimpleName().equals("Object")&&!demo.getSuperclass().getSimpleName().equals("ManagedObjectT")){
			list.add(demo.getSuperclass());
			getFatherClass(demo.getSuperclass(),list);
		}
	}

}
