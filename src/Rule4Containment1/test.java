package Rule4Containment1;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



public class test {
	public static void main(String arg[]) throws Exception {
		
		String in="School contains 3 Class$Class contains 43 Student$Class contains 42 Student$Class contains 41 Student$School contains 3 Teacher$";
		String out=generate(in);
		System.out.print("最终结果="+out);


	}
	public static String generate(String in){
		System.out.println("进入生成程序");
		ANTLRInputStream input = new ANTLRInputStream(in);	
		Rule4ContainmentLexer lexer = new Rule4ContainmentLexer(input);	
		CommonTokenStream tokens = new CommonTokenStream(lexer);	
		Rule4ContainmentParser parser = new Rule4ContainmentParser(tokens);		
		ParseTree tree = parser.prog(); // parse 		
		EvalVisitor eval = new EvalVisitor();		
		String out=eval.visit(tree);
		return out;
	}
}
