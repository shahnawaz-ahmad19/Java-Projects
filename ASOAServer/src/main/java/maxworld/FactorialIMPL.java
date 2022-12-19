package maxworld;

public class FactorialIMPL implements Factorial {

	
	public String getFactorial(String no) {
		int f = 1;
		int n=Integer.parseInt(no);
		if(n==1 || n==0)
			return "Result is "+f+" of "+no+" ! ";
		else
		{
			for(int i=n;i>1;i--)
			{
				f=i*f;
			}
			return "Result is "+f+" of "+no+" ! ";
		}
	}

	
	public String ok(String s) {
		
		return "Mr. "+s.toUpperCase();
	}
	
	/*
	 * public static void main(String[] args) { Factorial f=new FactorialIMPL();
	 * System.out.println(f.getFactorial("5")); }
	 */
	 

}
