package Rule4Containment2;

import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class ContainmentGenerator {
	public static ArrayList<String[]> generate(String in){
		//System.out.println("进入生成程序");
		ANTLRInputStream input = new ANTLRInputStream(in);	
		Rule4ContainmentLexer lexer = new Rule4ContainmentLexer(input);	
		CommonTokenStream tokens = new CommonTokenStream(lexer);	
		Rule4ContainmentParser parser = new Rule4ContainmentParser(tokens);		
		ParseTree tree = parser.prog(); // parse 		
		EvalVisitor eval = new EvalVisitor();		
		String out=eval.visit(tree);
		//返回值的包装，
		ArrayList<String[]> re=new ArrayList<String[]>();
		String temp[]=out.split(",");
		String temp1[]=null;
	
		for(int i=0;i<temp.length;i++){
			temp1=temp[i].split(" ");
			re.add(temp1);
		}	
		return re;
	}
	public static void main(String arg[]) throws Exception {
		
		//String in="School contains 3 Class$Class contains 43 Student$Class contains 42 Student$Class contains 41 Student$School contains 3 Teacher$";
		String in="root contains 2 School$every School contains 2 Class$every Class contains 1 Student$every School contains 2 Teacher$";
		ArrayList<String[]> out=generate(in);
		System.out.println("out的大小"+out.size());
		for(int i=0;i<out.size();i++){
			System.out.println("out"+i+out.get(i)[0]);
			System.out.println("out"+i+out.get(i)[1]);
			System.out.println("out"+i+out.get(i)[2]);
			System.out.println("out"+i+out.get(i)[3]);
		}
	}
}
