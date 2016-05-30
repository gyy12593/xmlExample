package Rule5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;



public class test {
	public static void main(String arg[]) throws Exception {
//		//String in="StudentT$age$java.lang.int$LIST 41 INTEGER 111 213$"; //测试通过 
//		//String in="StudentT$sex$String$ sex(woman,man)$";//测试通过
//		//String in="StudentT$sex$String$LIST 4 sex(woman,man)$";//测试通过
//		//String in="StudentT$studentNo$String$LIST 5fre_f[[0-9]^10]$";//测试通过
//		//String in="StudentT$startTime$Date$LIST 4 DATE$";//测试通过
//		//String in="StudentT$color$EnumT$LIST 14 ENUM CYCLE$";//测试通过
//		String in="TeacherT$classList$x.DNType$ ASSOCIATION$";//测试通过
//		//String in="StudentT$ip$java.lang.String$ IP [10.1.1.211,10.45.2.109][192.1.1.211,192.12.2.109] RANDOM$";//测试通过
//		ArrayList<String> out=generate(in);
//		for(int i=0;i<out.size();i++){
//			System.out.println("最终结果  "+(i+1)+" = "+out.get(i));
//		}

		
		AssociationAnalysis nodeL=new AssociationAnalysis("src/resource/relationship.xml");
		ArrayList<AssociationNode> re=nodeL.nodeList;
		for(int i=0;i<re.size();i++){
			System.out.println("*************************************");
			System.out.println(re.get(i).getAssociationRelationshipName());
			System.out.println(re.get(i).getAssociationDirection());
			System.out.println(re.get(i).getFromAssociationAttribute());
			System.out.println(re.get(i).getFromClass());
			System.out.println(re.get(i).getToAssociationAttribute());
			System.out.println(re.get(i).getToClass());
			System.out.println(re.get(i).getFromMultiplicity()[0]);
	    }		
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<String> generate(String in){
		System.out.println("进入生成程序");
		ANTLRInputStream input = new ANTLRInputStream(in);	
		RuleLexer lexer = new RuleLexer(input);	
		CommonTokenStream tokens = new CommonTokenStream(lexer);	
		RuleParser parser = new RuleParser(tokens);		
		ParseTree tree = parser.prog(); // parse 		
		EvalVisitor eval = new EvalVisitor();		
		ArrayList<String> out=eval.visit(tree);
		return out;
	}

}
