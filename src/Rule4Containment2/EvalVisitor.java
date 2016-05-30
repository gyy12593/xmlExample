package Rule4Containment2;

public class EvalVisitor extends  Rule4ContainmentBaseVisitor<String>{
	@Override 
	public String visitProg(Rule4ContainmentParser.ProgContext ctx) { 
		String re=visitChildren(ctx);
		//System.out.println("prog���"+re);
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
		//System.out.println("����description4instances");
		int length=ctx.example4class().size();
		String re="";
		for(int i=0;i<length-1;i++){
			//String e=ctx.example4class(i).getText()+',';
			String e=visit(ctx.example4class(i))+',';//ע��visit��getText������
			re+=e;
		}
		//re+=ctx.example4class(length-1).getText();
		re+=visit(ctx.example4class(length-1));
		//System.out.println("description4instances���"+re);
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
		//System.out.println("����process4special");
		String class4Father = ctx.className(0).getText();
		String class4Child = ctx.className(1).getText();
		//int numer=Integer.parseInt(ctx.number4class().getText());
		String numer=ctx.number4class().getText();
		//"0"��һ����־λ������Ϊ�������캢�ӣ���δ�����죬Ϊ0������Ϊ1
		String re=class4Father+" "+class4Child+" "+numer+" "+"0";
		//System.out.println("example4class���"+re);
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
		//System.out.println("����process4simple");
		String class4Father = ctx.className(0).getText();
		String class4Child = ctx.className(1).getText();
		//int numer=Integer.parseInt(ctx.number4class().getText());
		String numer=ctx.number4class().getText();
		//"0"��һ����־λ������Ϊ�������캢�ӣ���δ�����죬Ϊ0������Ϊ1
		//Ϊ�Ժ���ƾ������ĺ����������½ӿ�
		String re=class4Father+" "+class4Child+" "+numer+" "+"0";
		//System.out.println("example4class���"+re);
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
