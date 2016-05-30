package Rule1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
//import java.io.FileInputStream;
//import java.io.InputStream;

public class test {
	public static void main(String arg[]) throws Exception {
		//System.out.println("begin!!!");
//		String inputFile = null;
//		if ( arg.length>0 ) 
//			inputFile = arg[0];
//		//else
//			InputStream is = System.in;
//		if ( inputFile!=null ) is = new FileInputStream(inputFile);
		
		//String in="studentNo$String$ [[0-9]^6]$ ID$String$ hgg_f[[3-9]^13] RANDOM$ startTime$Date$ DATE$ ip$String$ IP [10.1.1.211,10.45.2.109][192.1.1.211,192.12.2.109] RANDOM$ color$Enum$ ENUM RANDOM$ friend$String$ s.frieng=b.studentNo$ age$int$ INTEGER 17 23$";
	   String in="position$String$position(professor,lecturer,Assistant)$";
	   //birthday$String$Date$
		String out=generate(in);
		System.out.print("最终结果="+out);



	}
	public static String generate(String in){
		System.out.println("进入生成程序");
		ANTLRInputStream input = new ANTLRInputStream(in);	
		RuleLexer lexer = new RuleLexer(input);	
		CommonTokenStream tokens = new CommonTokenStream(lexer);	
		RuleParser parser = new RuleParser(tokens);		
		ParseTree tree = parser.prog(); // parse 		
		EvalVisitor eval = new EvalVisitor();		
		String out=eval.visit(tree);
		return out;
	}
	public static String readTxtFile(String filePath){
		String result = "";
        try {
            String encoding="GBK";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while((lineTxt = bufferedReader.readLine()) != null){
                	result += lineTxt + "\r\n";
                    //System.out.println(lineTxt);
                }
                read.close();
	        }else{
	            System.out.println("找不到指定的文件");
	        }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }
        return result;
     
    }

}