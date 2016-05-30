package Rule;
import java.util.Calendar;
import java.util.Random;
import java.util.ArrayList;
public class EvalVisitor extends RuleBaseVisitor<String> {
	public static int flag4Enum=0;
	//入口函数
	/*prog : express4Data+;*/
	@Override 
	public String visitProg(RuleParser.ProgContext ctx) { 
		int length=ctx.express4Data().size();
		System.out.println("进入prog");
		String value="";
		for(int i=0;i<length-1;i++)
			value=value+visit(ctx.express4Data(i))+",";
		value=value+visit(ctx.express4Data(length-1));
		System.out.println("过程"+value);
		System.out.println("退出prog");
		return value; 
	}
	/** attName? typeName?  DATE Style4generate? '$'             # printDate   //现在实现的时间是1990年1月1日到现在时间的选取*/
	@Override
	public String visitPrintDate(RuleParser.PrintDateContext ctx) {
		System.out.println("进入日期生成");
	
		Calendar now = Calendar.getInstance();  
        //System.out.println("年: " + now.get(Calendar.YEAR));  
       // System.out.println("月: " + (now.get(Calendar.MONTH) + 1) + "");  
        //System.out.println("日: " + now.get(Calendar.DAY_OF_MONTH));  
	  
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
		int flag=0;//出现特殊情况的标志，1为出现，0为没出现
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
		System.out.println("生成结果："+re);
		return re;
	}
	/**  attName? typeName?  ENUM	Style4generate?   '$'          # printEnum   //枚举   */
	@Override
	public String visitPrintEnum(RuleParser.PrintEnumContext ctx) {
		System.out.println("进入枚举的生成");
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
		
		String re=null;//枚举的返回结果
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
		System.out.println("枚举的生成结果="+re);
		return re;
	}
	/**  attName? typeName? '|' ip Style4generate?	      # printIP           //一定范围内的ip */
	@Override 
	public String visitPrintIP(RuleParser.PrintIPContext ctx) { 
		System.out.println("进入ip的生成");
		String value = visit(ctx.ip());
		System.out.println("Ip的生成结果："+value);
		//System.out.println("Ip的打印结果："+visitChildren(ctx));
		//return visitChildren(ctx); 
		return value;
	}
	/**  attName? typeName? '|' id Style4generate?         # printId   */
	@Override
	public String visitPrintId(RuleParser.PrintIdContext ctx) {
		System.out.println("进入id的生成");
		String value = visit(ctx.id()); // evaluate the expr child
		System.out.println("生成结果："+value);
		return value;
	}
	/**  attName? typeName? '|' relationship Style4generate?       # printAttribute //关联关系*/
	@Override
	public String visitPrintAttribute(RuleParser.PrintAttributeContext ctx) { 
		System.out.println("进入关联关系数据的生成");
		String ve=visit(ctx.relationship());
		System.out.println("退出关联关系数据的生成");
		return ve; 
	}
	/** attName? typeName?  limitedInteger Style4generate? '$' */
	@Override 
	public String visitPrintInteger(RuleParser.PrintIntegerContext ctx) { 
		System.out.println("进入数字数据的生成");
		String ve=visit(ctx.limitedInteger()); 
		System.out.println("退出数字数据的生成");
		return ve;
	}
	
	/** ip : 'IP' range4Ip+    #process4Ip;*/
	@Override 
	public String visitProcess4Ip(RuleParser.Process4IpContext ctx) { 
		System.out.println("进入IP的生成过程");
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
		//System.out.println("生成的网址："+r);
		System.out.println("退出IP的生成过程");
		return r; 
	}
	public static long Ip2Long(String strIp)
    {
    	long[] ip = new long[4];
        int position1 = strIp.indexOf(".");
        int position2 = strIp.indexOf(".", position1 + 1);
        int position3 = strIp.indexOf(".", position2 + 1);
        // 将每个.之间的字符串转换成整型 
        ip[0] = Long.parseLong(strIp.substring(0, position1));
        ip[1] = Long.parseLong(strIp.substring(position1 + 1, position2));
        ip[2] = Long.parseLong(strIp.substring(position2 + 1, position3));
        ip[3] = Long.parseLong(strIp.substring(position3 + 1));
        //进行左移位处理
        return (ip[0] << 24) + (ip[1] << 16) + (ip[2] << 8) + ip[3];
    }

    /// <summary>
    /// 将十进制整数形式转换成127.0.0.1形式的ip地址 
    /// </summary>
    /// <param name="ip"></param>
    /// <returns></returns>
    public static String Long2Ip(long ip)
    {
        StringBuilder sb = new StringBuilder();
        //直接右移24位
        sb.append(ip >> 24);
        sb.append(".");
        //将高8位置0，然后右移16
        sb.append((ip & 0x00FFFFFF) >> 16);
        sb.append(".");
        //将高16位置0，然后右移8位
        sb.append((ip & 0x0000FFFF) >> 8);
        sb.append(".");
        //将高24位置0
        sb.append((ip & 0x000000FF));
        return sb.toString();
    }
	/*
	*  relationship          # printAttribute  
	* 待处理
	* 关联关系的属性的取值范围的获取--读数据库？
	* 关联关系的属性的取值的选取
	*/
	@Override//待处理
	public String visitProcess4relationship(RuleParser.Process4relationshipContext ctx) {
		System.out.println("进入Attribute的生成");
		String value = "Attribute2"; // evaluate the expr child
		//System.out.println("生成结果："+value);
		return value;
	}
	/** '[' DIGIT '-' DIGIT ']' */ 
	@Override//待处理
	public String visitChooseDigit(RuleParser.ChooseDigitContext ctx) {
		//System.out.println("进入visitChooseDigit");
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
	/** 分析语句为ALPHAS* '[' chooseD '^' DIGIT ']'   #process4Id1  
	    此处是将获取结果分为两个部分:固定部分以及变动的数字部分
		固定部分ALPHAS*的返回值为list
	*/
	@Override
	public String visitProcess4Id1(RuleParser.Process4Id1Context ctx) {
		System.out.println("进入visitProcess");
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
	/** 分析语句为ALPHAS* '[' chooseD '^' INT ']'   #process4Id2  
	    此处是将获取结果分为两个部分:固定部分以及变动的数字部分
		固定部分ALPHAS*的返回值为list
	*/
	@Override
	public String visitProcess4Id2(RuleParser.Process4Id2Context ctx) {
		System.out.println("进入visitProcess");
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
	/** 分析语句为
		limitedInteger : INTEGER  number4Integer number4Integer         #process4limitedInteger1
				;
	    生成指定范围内的整数
	*/
	@Override
	public String visitProcess4limitedInteger1(RuleParser.Process4limitedInteger1Context ctx) { 
		System.out.println("进入visitProcess4limitedInteger1");
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
		System.out.println("生成结果："+re);
		return re;
	}
}

