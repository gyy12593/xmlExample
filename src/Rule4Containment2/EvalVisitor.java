package Rule4Containment2;

public class EvalVisitor extends  Rule4ContainmentBaseVisitor<String>{
	@Override 
	public String visitProg(Rule4ContainmentParser.ProgContext ctx) { 
		String re=visitChildren(ctx);
		//System.out.println("prog结果"+re);
		return re;
		//return  visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 * description4instances : example4class+
	 */
	@Override 
	public String visitDescription4instances(Rule4ContainmentParser.Description4instancesContext ctx) { 
		//System.out.println("进入description4instances");
		int length=ctx.example4class().size();
		String re="";
		for(int i=0;i<length-1;i++){
			//String e=ctx.example4class(i).getText()+',';
			String e=visit(ctx.example4class(i))+',';//注意visit和getText的区别
			re+=e;
		}
		//re+=ctx.example4class(length-1).getText();
		re+=visit(ctx.example4class(length-1));
		//System.out.println("description4instances结果"+re);
		return re; 
		//return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 * example4class : EVERY className CONTAINS number4class className '$'	 #process4special
	 */
	@Override 
	public String visitProcess4special(Rule4ContainmentParser.Process4specialContext ctx) { 
		//System.out.println("进入process4special");
		String class4Father = ctx.className(0).getText();
		String class4Child = ctx.className(1).getText();
		//int numer=Integer.parseInt(ctx.number4class().getText());
		String numer=ctx.number4class().getText();
		//"0"是一个标志位，便于为父类认领孩子，若未被认领，为0，否则为1
		String re=class4Father+" "+class4Child+" "+numer+" "+"0";
		//System.out.println("example4class结果"+re);
		return re; 
		//return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 * className CONTAINS number4class className '$'      #process4simple
	 */
	@Override 
	public String visitProcess4simple(Rule4ContainmentParser.Process4simpleContext ctx) { 
		//System.out.println("进入process4simple");
		String class4Father = ctx.className(0).getText();
		String class4Child = ctx.className(1).getText();
		//int numer=Integer.parseInt(ctx.number4class().getText());
		String numer=ctx.number4class().getText();
		//"0"是一个标志位，便于为父类认领孩子，若未被认领，为0，否则为1
		//为以后设计具体的类的孩子数量留下接口
		String re=class4Father+" "+class4Child+" "+numer+" "+"0";
		//System.out.println("example4class结果"+re);
		return re; 
		//return visitChildren(ctx);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
	public String visitClassName(Rule4ContainmentParser.ClassNameContext ctx) { 
		return visitChildren(ctx); 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override 
	public String visitNumber4class(Rule4ContainmentParser.Number4classContext ctx) { 
		return visitChildren(ctx); 
	}

}
