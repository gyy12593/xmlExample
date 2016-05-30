package Rule;
import java.util.Calendar;
import java.util.Random;
import java.util.ArrayList;
public class EvalVisitor extends RuleBaseVisitor<String> {
	public static int flag4Enum=0;
	//��ں���
	/*prog : express4Data+;*/
	@Override 
	public String visitProg(RuleParser.ProgContext ctx) { 
		int length=ctx.express4Data().size();
		System.out.println("����prog");
		String value="";
		for(int i=0;i<length-1;i++)
			value=value+visit(ctx.express4Data(i))+",";
		value=value+visit(ctx.express4Data(length-1));
		System.out.println("����"+value);
		System.out.println("�˳�prog");
		return value; 
	}
	/** attName? typeName?  DATE Style4generate? '$'             # printDate   //����ʵ�ֵ�ʱ����1990��1��1�յ�����ʱ���ѡȡ*/
	@Override
	public String visitPrintDate(RuleParser.PrintDateContext ctx) {
		System.out.println("������������");
	
		Calendar now = Calendar.getInstance();  
        //System.out.println("��: " + now.get(Calendar.YEAR));  
       // System.out.println("��: " + (now.get(Calendar.MONTH) + 1) + "");  
        //System.out.println("��: " + now.get(Calendar.DAY_OF_MONTH));  
	  
		int year0=1990;
		int year1=now.get(Calendar.YEAR);
		int month0=1;
		int month1=(now.get(Calendar.MONTH) + 1);
		int day0=1;
		int day1=now.get(Calendar.DAY_OF_MONTH);
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
		String re=year+"-"+month+"-"+day;
		//return re;
		//String value = "1992-3-5"; // evaluate the expr child
		System.out.println("���ɽ����"+re);
		return re;
	}
	/**  attName? typeName?  ENUM	Style4generate?   '$'          # printEnum   //ö��   */
	@Override
	public String visitPrintEnum(RuleParser.PrintEnumContext ctx) {
		System.out.println("����ö�ٵ�����");
		String attName=null;
		String typeName=null;
		if(ctx.attName().getText() != null)
		{
			//attName=visit(ctx.attName());
			String temp=ctx.attName().getText();
			attName=temp.substring(0, temp.length()-1);
		}
		if(ctx.typeName().getText() != null)
		{
			//typeName=visit(ctx.typeName());
			String temp=ctx.typeName().getText();
			typeName=temp.substring(0, temp.length()-1);
		}
		System.out.println("attName="+attName);
		System.out.println("attName="+typeName);
		ArrayList<String> list4Enum=new ArrayList<String>();
		list4Enum.add("enum1");
		list4Enum.add("enum2");
		list4Enum.add("enum3");
		list4Enum.add("enum4");
		list4Enum.add("enum5 fr");
		
		String re=null;//ö�ٵķ��ؽ��
		int length=list4Enum.size();	
		//System.out.println("ctx.factor().size()==========="+length);		
		int i;
		String style=ctx.Style4generate().getText();
		if(style.equals("RANDOM")){
			Random random = new Random();
			i=random.nextInt(length); 
			re=(String) list4Enum.get(i);
		}
		else if(style.equals("CYCLE")){
			//re="CYCLE";
			re=(String) list4Enum.get(flag4Enum);
			if(flag4Enum<length-1)
				flag4Enum=flag4Enum+1;
			else
				flag4Enum=0;
		}
		System.out.println("ö�ٵ����ɽ��="+re);
		return re;
	}
	/**  attName? typeName? '|' ip Style4generate?	      # printIP           //һ����Χ�ڵ�ip */
	@Override 
	public String visitPrintIP(RuleParser.PrintIPContext ctx) { 
		System.out.println("����ip������");
		String value = visit(ctx.ip());
		System.out.println("Ip�����ɽ����"+value);
		//System.out.println("Ip�Ĵ�ӡ�����"+visitChildren(ctx));
		//return visitChildren(ctx); 
		return value;
	}
	/**  attName? typeName? '|' id Style4generate?         # printId   */
	@Override
	public String visitPrintId(RuleParser.PrintIdContext ctx) {
		System.out.println("����id������");
		String value = visit(ctx.id()); // evaluate the expr child
		System.out.println("���ɽ����"+value);
		return value;
	}
	/**  attName? typeName? '|' relationship Style4generate?       # printAttribute //������ϵ*/
	@Override
	public String visitPrintAttribute(RuleParser.PrintAttributeContext ctx) { 
		System.out.println("���������ϵ���ݵ�����");
		String ve=visit(ctx.relationship());
		System.out.println("�˳�������ϵ���ݵ�����");
		return ve; 
	}
	/** attName? typeName?  limitedInteger Style4generate? '$' */
	@Override 
	public String visitPrintInteger(RuleParser.PrintIntegerContext ctx) { 
		System.out.println("�����������ݵ�����");
		String ve=visit(ctx.limitedInteger()); 
		System.out.println("�˳��������ݵ�����");
		return ve;
	}
	
	/** ip : 'IP' range4Ip+    #process4Ip;*/
	@Override 
	public String visitProcess4Ip(RuleParser.Process4IpContext ctx) { 
		System.out.println("����IP�����ɹ���");
		int length=ctx.range4Ip().size();
//		System.out.println("length="+length);
//		ArrayList ipList = new ArrayList(); 
//	    for(int i=0;i<length;i++)
//	    	ipList.add(ctx.range4Ip(i));
		Random random = new Random();
		int flag=random.nextInt(length);
		String ip[]=ctx.range4Ip(flag).getText().split(",");
//		System.out.println("ip[0]"+ip[0]);
//		System.out.println("ip[1]"+ip[1]);
		
		String startIP = ip[0].replace("[", "");
		String endIP = ip[1].replace("]", "");;
//		System.out.println("startIP"+startIP);
//		System.out.println("endIP"+endIP);
		long ip1=Ip2Long(startIP);
		long ip2=Ip2Long(endIP);
		//System.out.println("ip1="+ip1);
		//System.out.println("ip2="+ip2);
		long re=Math.round(Math.random()*(ip2-ip1)+ip1);
		//System.out.println("re="+re);
		String r=Long2Ip(re);
		//System.out.println("���ɵ���ַ��"+r);
		System.out.println("�˳�IP�����ɹ���");
		return r; 
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
	/*
	*  relationship          # printAttribute  
	* ������
	* ������ϵ�����Ե�ȡֵ��Χ�Ļ�ȡ--�����ݿ⣿
	* ������ϵ�����Ե�ȡֵ��ѡȡ
	*/
	@Override//������
	public String visitProcess4relationship(RuleParser.Process4relationshipContext ctx) {
		System.out.println("����Attribute������");
		String value = "Attribute2"; // evaluate the expr child
		//System.out.println("���ɽ����"+value);
		return value;
	}
	/** '[' DIGIT '-' DIGIT ']' */ 
	@Override//������
	public String visitChooseDigit(RuleParser.ChooseDigitContext ctx) {
		//System.out.println("����visitChooseDigit");
		String t1=ctx.DIGIT(0).getText();	
		String t2=ctx.DIGIT(1).getText();
		//System.out.println("visit(ctx.DIGIT(0))==========="+t1);
		//System.out.println("visit(ctx.DIGIT(1))==========="+t2);
		int t12=Integer.parseInt(t1);
		int t22=Integer.parseInt(t2);
		Random random = new Random();
		int i;
		//i = Math.abs(random.nextInt()) % 10;
		int temp=t22-t12+1;
		i=t12+random.nextInt(temp); 
		String re=Integer.toString(i);
		return re;
	}
	/** �������ΪALPHAS* '[' chooseD '^' DIGIT ']'   #process4Id1  
	    �˴��ǽ���ȡ�����Ϊ��������:�̶������Լ��䶯�����ֲ���
		�̶�����ALPHAS*�ķ���ֵΪlist
	*/
	@Override
	public String visitProcess4Id1(RuleParser.Process4Id1Context ctx) {
		System.out.println("����visitProcess");
		String temp1="";
		int length4ALPHAS=ctx.ALPHAS().size();
		for(int i=0;i<length4ALPHAS;i++)
			temp1=temp1+ctx.ALPHAS(i);
		//System.out.println("ctx.ALPHAS()=============="+ctx.ALPHAS().size());
		String t=ctx.DIGIT().getText();
		int tt=3;
		if(t!=null)
			tt=Integer.parseInt(t);
		String temp2="";
		for(int i=0;i<tt;i++)
			temp2=temp2+visit(ctx.chooseD());
		//System.out.println("temp1======================"+temp1);
		//System.out.println("temp2======================"+temp2);
		return temp1+temp2;
	}
	/** �������ΪALPHAS* '[' chooseD '^' INT ']'   #process4Id2  
	    �˴��ǽ���ȡ�����Ϊ��������:�̶������Լ��䶯�����ֲ���
		�̶�����ALPHAS*�ķ���ֵΪlist
	*/
	@Override
	public String visitProcess4Id2(RuleParser.Process4Id2Context ctx) {
		System.out.println("����visitProcess");
		String temp1="";
		int length4ALPHAS=ctx.ALPHAS().size();
		for(int i=0;i<length4ALPHAS;i++)
			temp1=temp1+ctx.ALPHAS(i);
		//System.out.println("ctx.ALPHAS()=============="+ctx.ALPHAS().size());
		String t=ctx.INT().getText();
		int tt=3;
		if(t!=null)
			tt=Integer.parseInt(t);
		String temp2="";
		for(int i=0;i<tt;i++)
			temp2=temp2+visit(ctx.chooseD());
		////System.out.println("temp1======================"+temp1);
		//System.out.println("temp2======================"+temp2);
		return temp1+temp2;
	}
	/** �������Ϊ
		limitedInteger : INTEGER  number4Integer number4Integer         #process4limitedInteger1
				;
	    ����ָ����Χ�ڵ�����
	*/
	@Override
	public String visitProcess4limitedInteger1(RuleParser.Process4limitedInteger1Context ctx) { 
		System.out.println("����visitProcess4limitedInteger1");
		String t1=ctx.number4Integer(0).getText();
		String t2=ctx.number4Integer(1).getText();
		int t12=Integer.parseInt(t1);
		int t22=Integer.parseInt(t2);
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
		String re=Integer.toString(i);
		System.out.println("���ɽ����"+re);
		return re;
	}
}

