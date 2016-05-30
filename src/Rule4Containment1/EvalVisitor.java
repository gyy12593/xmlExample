package Rule4Containment1;

import java.util.ArrayList;
import java.util.HashMap;


public class EvalVisitor extends Rule4ContainmentBaseVisitor<String>{
	
	/*prog : description4instances;//*/
	@Override 
	public String visitProg(Rule4ContainmentParser.ProgContext ctx) { 
		//String re=ctx.description4instances().getText();
		//////////////////System.out.println("进入prog");
		String re=visitChildren(ctx);
		System.out.println("prog结果"+re);
		return re;
	}
	///*description4instances : example4class+*/
	@Override 
	public String visitDescription4instances(Rule4ContainmentParser.Description4instancesContext ctx) { 
		System.out.println("进入description4instances");
		int length=ctx.example4class().size();
		String re="";
		for(int i=0;i<length-1;i++){
			//String e=ctx.example4class(i).getText()+',';
			String e=visit(ctx.example4class(i))+',';//注意visit和getText的区别
			re+=e;
		}
		//re+=ctx.example4class(length-1).getText();
		re+=visit(ctx.example4class(length-1));
		System.out.println("description4instances结果"+re);
		return re; 
	}
	//example4class : className CONTAINS number4class className '$*/
	@Override 
	public String visitExample4class(Rule4ContainmentParser.Example4classContext ctx) { 
		System.out.println("进入example4class");
		String class4Father = ctx.className(0).getText();
		String class4Child = ctx.className(1).getText();
		//int numer=Integer.parseInt(ctx.number4class().getText());
		String numer=ctx.number4class().getText();
		//"0"是一个标志位，便于为父类认领孩子，若未被认领，为0，否则为1
		String re=class4Father+" "+class4Child+" "+numer+" "+"0";
		System.out.println("example4class结果"+re);
		return re; 
	}
	//className : ALPHAS*;*/
	@Override 
	public String visitClassName(Rule4ContainmentParser.ClassNameContext ctx) { 
		//String re=
		//System.out.println("example4class结果"+re);
		return visitChildren(ctx); 
	}
	//number4class : DIGIT|INT;*/
	@Override 
	public String visitNumber4class(Rule4ContainmentParser.Number4classContext ctx) { 
		return visitChildren(ctx); 
	}
}
