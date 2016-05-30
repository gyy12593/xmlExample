package Rule3;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;


 
@SuppressWarnings({ "unchecked", "unused" })
public class EvalVisitor extends RuleBaseVisitor<ArrayList>{
	//ѭ�����ɷ�ʽ�н��ȡֵ�ı�־λ
	public static int flag4Enum=0;
	//����list��������Ҫ��ʵ������
	public static int num4RelationshipList=1;
	public static int num4DateList=1;
	public static int num4EnumList=1;
	public static int num4IpList=1;
	public static int num4IdList=1;
	public static int num4LimitIntList=1;
	public static int num4ValuesList=1;
	//��ں���
	/*prog : express4Data+;*/
	@Override 
	public ArrayList<String> visitProg(RuleParser.ProgContext ctx) { 
		int length=ctx.express4Data().size();
		//System.out.println("����prog");
		ArrayList<String> value=new ArrayList<String>();
		for(int i=0;i<length;i++)
			value=visit(ctx.express4Data(i)); 
		return value; 
	}
//////////////////////////////////////////////////////////���ڴ���ʼ////////////////////////////////////////////
	
	/** attAndTypeName?  isList? DATE Style4generate? SEPARATOR             # printDate      //���ڣ�Ĭ����1990.1.1������֮��ȡֵ*/
	@Override
	public ArrayList<String> visitPrintDate(RuleParser.PrintDateContext ctx) {
		//System.out.println("������������");
		if (ctx.isList()!=null){
			//System.out.println("list : "+ctx.isList().getText());
			num4DateList=Integer.parseInt(ctx.isList().getText().split("T")[1]);
		}
		Calendar now = Calendar.getInstance();  
		ArrayList<String> re=new ArrayList<String>();
        //System.out.println("��: " + now.get(Calendar.YEAR));  
       // System.out.println("��: " + (now.get(Calendar.MONTH) + 1) + "");  
        //System.out.println("��: " + now.get(Calendar.DAY_OF_MONTH));  	  
		int year0=1990;
		int year1=now.get(Calendar.YEAR);
		int month0=1;
		int month1=(now.get(Calendar.MONTH) + 1);
		int day0=1;
		int day1=now.get(Calendar.DAY_OF_MONTH);
		for(int i=0;i<num4DateList;i++){
			Random random = new Random();
			int temp = year1-year0+1;
			int year=year0+random.nextInt(temp); 
			int month=0;
			int day=0;
			int flag=0;//������������ı�־��1Ϊ���֣�0Ϊû����
			if(year==year0){
				flag = 1;
				int i1=12-month0+1;
				month=month0+random.nextInt(i1); 
				if(month==month0){
					int i2=31-day0+1;
					day=day0+random.nextInt(i2); 
				}
				else{
					day=random.nextInt(32);
				}
			}
			if(year==year1){
				flag = 1;
				month=random.nextInt(month1+1); 
				if(month==month1)
					day=random.nextInt(day1+1); 
				else
					day=random.nextInt(32);
			}
			if(flag==0){
				month=random.nextInt(13);
				day=random.nextInt(32);
			}
			
			if(year==0)
				year=1;
			if(month==0)
				month=1;
			if(day==0)
			   day=1;
			int y=0;
			if((month==2)&&(day>28)){
				y = year/4;
				if(!(y==0))
					day=28;
				else if(day>29)
						day=29;
			}
			if((month==4)||(month==6)||(month==9)||(month==11)){
				if(day==31)
					day=30;
			}
			
			//String re=year+"-"+month+"-"+day;
			re.add(year+"-"+month+"-"+day);
		}
//		for(int i=0;i<re.size();i++)
//			System.out.println("���ɽ����"+re.get(i));
		return re;
	}
//////////////////////////////////////////////////////////���ڴ������////////////////////////////////////////////

//////////////////////////////////////////////////////////ö�ٴ���ʼ////////////////////////////////////////////
	/** attAndTypeName?  isList? ENUM	Style4generate?   SEPARATOR          # printEnum  	 //ö�� */
	@Override
	public ArrayList<String> visitPrintEnum(RuleParser.PrintEnumContext ctx) {
		//System.out.println("����ö�ٵ�����");
		if (ctx.isList()!=null){
			//System.out.println("list : "+ctx.isList().getText());
			num4EnumList=Integer.parseInt(ctx.isList().getText().split("T")[1]);
		}
		ArrayList<String> list4Enum=new ArrayList<String>();
		list4Enum.add("enum1");
		list4Enum.add("enum2");
		list4Enum.add("enum3");
		list4Enum.add("enum4");
		list4Enum.add("enum5 fr");
		
		//String re=null;//ö�ٵķ��ؽ��
		ArrayList<String> re=new ArrayList<String>();
		for(int ii=0;ii<num4EnumList;ii++){
			int length=list4Enum.size();	
			//System.out.println("ctx.factor().size()==========="+length);		
			int i;
			String style=ctx.Style4generate().getText();
			if(style.equals("RANDOM")){
				Random random = new Random();
				i=random.nextInt(length); 
				//re=(String) list4Enum.get(i);
				re.add((String) list4Enum.get(i));
			}
			else if(style.equals("CYCLE")){
				//re="CYCLE";
				//re=(String) list4Enum.get(flag4Enum);
				re.add((String) list4Enum.get(flag4Enum));
				if(flag4Enum<length-1)
					flag4Enum=flag4Enum+1;
				else
					flag4Enum=0;
			}
		}
//		for(int i=0;i<re.size();i++)
//			System.out.println("ö�ٵ����ɽ��="+re.get(i));
		return re;
	}
//////////////////////////////////////////////////////////ö�ٴ������////////////////////////////////////////////

//////////////////////////////////////////////////////////Ip����ʼ////////////////////////////////////////////
	/**  attAndTypeName?  isList? ip Style4generate?	SEPARATOR             # printIP       //һ����Χ�ڵ�ip */
	@Override 
	public ArrayList<String> visitPrintIP(RuleParser.PrintIPContext ctx) { 
		//System.out.println("����ip������");
		if (ctx.isList()!=null){
			//System.out.println("list : "+ctx.isList().getText());
			num4IpList=Integer.parseInt(ctx.isList().getText().split("T")[1]);
		}
		ArrayList<String> value = visit(ctx.ip());
		//System.out.println("Ip�����ɽ����"+value);
		//System.out.println("�˳�Ip������");
		//return visitChildren(ctx); 
		return value;
	}	
	public static long Ip2Long(String strIp)
    {
    	long[] ip = new long[4];
        int position1 = strIp.indexOf(".");
        int position2 = strIp.indexOf(".", position1 + 1);
        int position3 = strIp.indexOf(".", position2 + 1);
        // ��ÿ��.֮����ַ���ת�������� 
        ip[0] = Long.parseLong(strIp.substring(0, position1));
        ip[1] = Long.parseLong(strIp.substring(position1 + 1, position2));
        ip[2] = Long.parseLong(strIp.substring(position2 + 1, position3));
        ip[3] = Long.parseLong(strIp.substring(position3 + 1));
        //��������λ����
        return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
    }
	/** ip : 'IP' range4Ip+;*/
	@Override 
	public ArrayList<String> visitIp(RuleParser.IpContext ctx) { 
		//System.out.println("����IP�����ɹ���");
		int length=ctx.range4Ip().size();
		ArrayList<String> r=new ArrayList<String>();
		for(int i=0;i<num4IpList;i++){
			Random random = new Random();
			int flag=random.nextInt(length);
			String ip[]=ctx.range4Ip(flag).getText().split(",");
			String startIP = ip[0].replace("[", "");
			String endIP = ip[1].replace("]", "");;
			long ip1=Ip2Long(startIP);
			long ip2=Ip2Long(endIP);	
			long re=Math.round(Math.random()*(ip2-ip1)+ip1);			
			r.add(Long2Ip(re));
		}
//		for(int i=0;i<r.size();i++)
//			System.out.println("�˳�IP�����ɹ���");
		return r; 
		//return visitChildren(ctx); 
	}
    /// <summary>
    /// ��ʮ����������ʽת����127.0.0.1��ʽ��ip��ַ 
    /// </summary>
    /// <param name="ip"></param>
    /// <returns></returns>
    public static String Long2Ip(long ip)
    {
        StringBuilder sb = new StringBuilder();
        //ֱ������24λ
        sb.append(ip >> 24);
        sb.append(".");
        //����8λ��0��Ȼ������16
        sb.append((ip & 0x00FFFFFF) >> 16);
        sb.append(".");
        //����16λ��0��Ȼ������8λ
        sb.append((ip & 0x0000FFFF) >> 8);
        sb.append(".");
        //����24λ��0
        sb.append((ip & 0x000000FF));
        return sb.toString();
    }
//////////////////////////////////////////////////////////Ip�������////////////////////////////////////////////

//////////////////////////////////////////////////////////ID����ʼ////////////////////////////////////////////
    /**  attAndTypeName?  isList? id Style4generate?   SEPARATOR              # printId        //id ��������ĸ�������ֿ�ͷ�Ĵ�������������    */
	@Override
	public ArrayList<String> visitPrintId(RuleParser.PrintIdContext ctx) {
		//System.out.println("����id������");
		if (ctx.isList()!=null){
			//System.out.println("list : "+ctx.isList().getText());
			num4IdList=Integer.parseInt(ctx.isList().getText().split("T")[1]);
		}
		ArrayList<String> value =visit(ctx.id()); // evaluate the expr child
//		for(int i=0;i<value.size();i++)
//			System.out.println("���ɽ����"+value.get(i));
		return value;
	}
	/** chooseD : '[' digit '-' digit ']'  */ 
	@Override
	public ArrayList<String> visitChooseD(RuleParser.ChooseDContext ctx) {
		//System.out.println("����visitChooseDigit");
		String t1=(String)ctx.digit(0).getText();	
		String t2=(String)ctx.digit(1).getText();
		//System.out.println("visit(ctx.DIGIT(0))==========="+t1);
		//System.out.println("visit(ctx.DIGIT(1))==========="+t2);
		int t12=Integer.parseInt(t1);
		int t22=Integer.parseInt(t2);
		Random random = new Random();
		int i;
		//i = Math.abs(random.nextInt()) % 10;
		int temp=t22-t12+1;
		i=t12+random.nextInt(temp); 
		//String re=Integer.toString(i);
		ArrayList<String> re=new ArrayList<String>();
		re.add(Integer.toString(i));
		return re;
	}
	/** �������Ϊid :  Alphas* '[' chooseD '^' number ']' 
	    �˴��ǽ���ȡ�����Ϊ��������:�̶������Լ��䶯�����ֲ���
		�̶�����ALPHAS*�ķ���ֵΪlist
	*/
	@Override
	public ArrayList<String> visitId(RuleParser.IdContext ctx) {
		//System.out.println("����visitProcess ");
		String temp1="";
		int length4ALPHAS=ctx.Alphas().size();
		ArrayList<String> re=new ArrayList<String>();
		for(int i=0;i<length4ALPHAS;i++)
			temp1=temp1+ctx.Alphas(i);
		//System.out.println("visit(ctx.number())=============="+ctx.number().getText());
		for(int ii=0;ii<num4IdList;ii++){
			String t=(String)ctx.number().getText();
			int tt=3;
			if(t!=null)
				tt=Integer.parseInt(t);
			String temp2="";
			for(int i=0;i<tt;i++)
				temp2=temp2+(String)visit(ctx.chooseD()).get(0);
			//System.out.println("temp1======================"+temp1);
			//System.out.println("temp2======================"+temp2);		
			re.add(temp1+temp2);
		}
		return re;
	}
//////////////////////////////////////////////////////////ID�������////////////////////////////////////////////

/////////////////////////////////////////////////////�������ݴ���ʼ////////////////////////////////////////////
	/*
	 * ĳһ�����е�ʵ��ֵ��������һ�����е�ȡֵ�����ҷ���ֵΪ�ַ�����
	 * attAndTypeName?  isList? relationship   Style4generate?  SEPARATOR     # printAttribute //������ϵ*/
	@Override
	public ArrayList<String> visitPrintAttribute(RuleParser.PrintAttributeContext ctx) { 
		//System.out.println("���������ϵ���ݵ�����");

		if (ctx.isList()!=null){
			//System.out.println("list : "+ctx.isList().getText());
			num4RelationshipList=Integer.parseInt(ctx.isList().getText().split("T")[1]);
		}
		ArrayList<String> re=new ArrayList<String>();
		re=visit(ctx.relationship());			
		//System.out.println("�˳�������ϵ���ݵ�����");
//		for(int i=0;i<re.size();i++){
//			System.out.println(i+"��� �� "+re.get(i));
//		}
		return re; 
	}
	/*
	* relationship : className '.' attributeName '=' className '.' attributeName   #process4relationship;
	* ������
	* ������ϵ�����Ե�ȡֵ��Χ�Ļ�ȡ--�����ݿ⣿
	* ������ϵ�����Ե�ȡֵ��ѡȡ
	*/
	@Override//������
	public ArrayList<String> visitRelationship(RuleParser.RelationshipContext ctx) {
		//System.out.println("����Attribute������");
		String[] value = {"Attribute1","Attribute2","Attribute3","Attribute4","Attribute5"}; // evaluate the expr child
		//System.out.println("���ɽ����"+value);
		ArrayList<String> re=new ArrayList<String>();
		for(int i=0;i<num4RelationshipList;i++){
			Random x=new Random();
			int rr=x.nextInt(value.length);		
			re.add(value[rr]);
		}
		return re;
	}
/////////////////////////////////////////////////////�������ݴ������////////////////////////////////////////////

/////////////////////////////////////////////////////�������ɿ�ʼ////////////////////////////////////////////
	/** attAndTypeName?  isList? limitedInteger Style4generate? SEPARATOR    # 	printInteger    //һ����Χ�ڵ����� */
	@Override 
	public ArrayList<String> visitPrintInteger(RuleParser.PrintIntegerContext ctx) { 
		//System.out.println("�����������ݵ�����");
		if (ctx.isList()!=null){
			//System.out.println("list : "+ctx.isList().getText());
			num4LimitIntList=Integer.parseInt(ctx.isList().getText().split("T")[1]);
		}
		ArrayList<String> ve=visit(ctx.limitedInteger()); 
		//System.out.println("�˳��������ݵ�����");
		return ve;
	}
/** �������Ϊ
	limitedInteger : INTEGER  number number 
			;
    ����ָ����Χ�ڵ�����
*/
@Override
public ArrayList<String> visitLimitedInteger(RuleParser.LimitedIntegerContext ctx) { 
	//System.out.println("����visitProcess4limitedInteger1");
	String t1=(String)ctx.number(0).getText();
	String t2=(String)ctx.number(1).getText();
	int t12=Integer.parseInt(t1);
	int t22=Integer.parseInt(t2);
	ArrayList<String> re=new ArrayList<String>();
	for(int j=0;j<num4LimitIntList;j++){
		Random random = new Random();
		int i;
		//i = Math.abs(random.nextInt()) % 10;
		int temp=0;
		if(t22>t12){
			temp=t22-t12+1;
			i=t12+random.nextInt(temp); 
		}
		else
		{
			temp=t12-t22+1;
			i=t22+random.nextInt(temp); 
		}
		
		//String re=Integer.toString(i);
		re.add(Integer.toString(i));
	}
//	for(int i=0;i<re.size();i++)
//		System.out.println("���ɽ����"+re.get(i));
	return re;
}
/////////////////////////////////////////////////////�������ɽ���////////////////////////////////////////////

/////////////////////////////////////////////////////����дȡֵ��Χ�����Դ���ʼ////////////////////////////////////////////
	/** attAndTypeName?  isList? value4Attribute Style4generate? SEPARATOR    # printValue    //����дȡֵ���������� ����sex��man,woman��*/
	@Override 
	public ArrayList<String> visitPrintValue(RuleParser.PrintValueContext ctx) { 
		if (ctx.isList()!=null){
			//System.out.println("list : "+ctx.isList().getText());
			num4ValuesList=Integer.parseInt(ctx.isList().getText().split("T")[1]);
		}
		
		ArrayList<String> re=visit(ctx.value4Attribute());
		return re;
		//return visitChildren(ctx); 
	}
	/*value4Attribute : attributeName '(' values ')'         */
	@Override 
	public ArrayList<String> visitValue4Attribute(RuleParser.Value4AttributeContext ctx) { 
		String[] values=((String) visit(ctx.values()).get(0)).split(",");
		ArrayList<String> va=new ArrayList<String>();
		int len=values.length;
		//���ֻ������������ôѡ�ڶ����ļ��ʱȽϴ�
		for(int i=0;i<num4ValuesList;i++){
			Random random = new Random();
			int re=random.nextInt(len);
			va.add(values[re]);
		}
		return va; 
	}
	/*values : value* Alphas**/
	@Override 
	public ArrayList<String> visitValues(RuleParser.ValuesContext ctx) { 
		String values="";
		int length=ctx.value().size();
		for(int i=0;i<length-1;i++){
			int len=ctx.value(i).getText().length();
			values+=ctx.value(i).getText().substring(0, len-1)+",";//ȥ��ֵ�е�","
		}
		int length4ALPHAS=ctx.Alphas().size();
		String temp1="";
		for(int i=0;i<length4ALPHAS;i++)
			temp1=temp1+ctx.Alphas(i);
		values+=temp1;
		ArrayList<String> re=new ArrayList<String>();
		re.add(values);
		return re; 
	}
/////////////////////////////////////////////////////����дȡֵ��Χ�����Դ������////////////////////////////////////////////
}
