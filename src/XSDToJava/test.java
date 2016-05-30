package XSDToJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
import java.util.Random;

public class test {
	public static void main(String[] args){
		String a="class XSDToJava.DNSetType";
		//System.out.println("a.split[1] "+a.split(" ")[1]);
		String[] a1=a.split(" ");
		System.out.println("a1 "+a1.length);
		if(a1.length>1){
			String[] a2=a1[1].split("\\.");
			if(("XSDToJava").equals(a2[0])){
				System.out.println("sucess");
			}
			else{
				System.out.println("continue");
			}
		}
		//System.out.println("a2 "+a2);
//		if(("XSDToJava").equals(a.split(" ")[1].split("\\.")[0])){	
//			System.out.println("sucess");
//		}
//		else{
//			System.out.println("continue");
//		}
		
		
		
		
		
		
		List<String> list = new LinkedList<String>();
		TeacherT t=new TeacherT();
		DNSetType dns = new DNSetType();
		
		list.add("sdfv");
		list.add("vgdsf");
		list.add("bnhf");
		int i=0;
		while (i<list.size()) {
			System.out.println(list.get(i));
			dns.getDn().add(list.get(i));
			i++;
		}	
		
//		try{
//			//dns.setDn(list);
//		}
//		catch(Exception e){
//			System.out.print(e.toString());
//		}
//		Class<Object> value=null;
		//Assignment(value,list);
		
		t.setFriendList(dns);
		//a.friendList=dns;
		//a.setFriendList(list);
		i=0;
		while (i<t.getFriendList().getDn().size()) {
			System.out.println(t.getFriendList().getDn().get(i));
			//dns.getDn().add(list.get(i));
			i++;
		}
		//System.out.print(t.getFriendList());
	}
	private static void Assignment(Class<?> demo, ArrayList<String> list){
		int len=list.size();
		if(len==1){
			Object temp=list.get(0);
			demo=(Class<?>) temp;
		}
		else{
			Object temp=list;
			demo=(Class<?>) temp;
		}
	}
}
