package Rule2;

import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class test {
	public static void main(String arg[]) throws Exception {
		//String in="age$int$ INTEGER 17 23$";  
		//String in="sex$String$ sex(woman,man)$";
		//String in="sex$String$LIST 3 sex(woman,man)$";
		String in="studentNo$String$fre_f[[0-9]^6]$";
		//String in="startTime$Date$  DATE$";
		//String in="color$EnumT$ ENUM RANDOM$";
		//String in="s$friend$ s.friend=B.studentNo$";
		//String in="ip$String$ IP [10.1.1.211,10.45.2.109][192.1.1.211,192.12.2.109] RANDOM$";
		ArrayList<String> out=generate.generate(in);
		//ArrayList<String> out=generate(in);
		for(int i=0;i<out.size();i++){
			System.out.println("���ս��  "+(i+1)+" = "+out);
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
//	public static String readTxtFile(String filePath){
//		String result = "";
//        try {
//            String encoding="GBK";
//            File file=new File(filePath);
//            if(file.isFile() && file.exists()){ //�ж��ļ��Ƿ����
//                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//���ǵ������ʽ
//                BufferedReader bufferedReader = new BufferedReader(read);
//                String lineTxt = null;
//                while((lineTxt = bufferedReader.readLine()) != null){
//                	result += lineTxt + "\r\n";
//                    //System.out.println(lineTxt);
//                }
//                read.close();
//	        }else{
//	            System.out.println("�Ҳ���ָ�����ļ�");
//	        }
//        } catch (Exception e) {
//            System.out.println("��ȡ�ļ����ݳ���");
//            e.printStackTrace();
//        }
//        return result;
//     
//    }

}
