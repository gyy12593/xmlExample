package Rule1;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class generate {
	public static String generate(String in){
		//System.out.println("�������ɳ���");
		ANTLRInputStream input = new ANTLRInputStream(in);	
		RuleLexer lexer = new RuleLexer(input);	
		CommonTokenStream tokens = new CommonTokenStream(lexer);	
		RuleParser parser = new RuleParser(tokens);		
		ParseTree tree = parser.prog(); // parse 		
		EvalVisitor eval = new EvalVisitor();		
		String out=eval.visit(tree);
		return out;
	}
}