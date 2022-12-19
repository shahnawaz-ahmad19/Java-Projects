package max;

public class A {
	public void add(int a,int b)
	{
		System.out.println("add " + (a+b));
	}
	public void div(int a,int b)
	{
		try
		{
		int c = a/b;
		System.out.println("div " + c);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.exit(0);
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		finally
		{
			System.out.println("finallyfinally");
		}
		
	}
	public void mul(int a,int b)
	{
		System.out.println("mul " + (a*b));
	}

}
