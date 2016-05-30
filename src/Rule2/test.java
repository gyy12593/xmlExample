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
			System.out.println("最终结果  "+(i+1)+" = "+out);
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
//	public static String readTxtFile(String filePath){
//		String result = "";
//        try {
//            String encoding="GBK";
//            File file=new File(filePath);
//            if(file.isFile() && file.exists()){ //判断文件是否存在
//                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
//                BufferedReader bufferedReader = new BufferedReader(read);
//                String lineTxt = null;
//                while((lineTxt = bufferedReader.readLine()) != null){
//                	result += lineTxt + "\r\n";
//                    //System.out.println(lineTxt);
//                }
//                read.close();
//	        }else{
//	            System.out.println("找不到指定的文件");
//	        }
//        } catch (Exception e) {
//            System.out.println("读取文件内容出错");
//            e.printStackTrace();
//        }
//        return result;
//     
//    }

}
