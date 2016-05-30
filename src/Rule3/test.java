package Rule3;

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
		//String in="age$int$LIST 41 INTEGER 111 213$"; //����ͨ�� 
		//String in="sex$String$ sex(woman,man)$";//����ͨ��
		//String in="sex$String$LIST 4 sex(woman,man)$";//����ͨ��
		//String in="studentNo$String$LIST 5fre_f[[0-9]^10]$";//����ͨ��
		//String in="startTime$Date$LIST 4 DATE$";//����ͨ��
		//String in="color$EnumT$LIST 14 ENUM CYCLE$";//����ͨ��
		//String in="s$friend$LIST 8 s.friend=B.studentNo$";//����ͨ��
		String in="ip$String$LIST 3 IP [10.1.1.211,10.45.2.109][192.1.1.211,192.12.2.109] RANDOM$";//����ͨ��
		ArrayList<String> out=generate(in);
		for(int i=0;i<out.size();i++){
			System.out.println("���ս��  "+(i+1)+" = "+out.get(i));
		}

	}
	@SuppressWarnings("unchecked")
	public static ArrayList<String> generate(String in){
		System.out.println("�������ɳ���");
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
