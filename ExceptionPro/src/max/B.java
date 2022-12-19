package max;

public class B extends Exception {
	
	public B() {
		
	}
	B (String s)
	{
		super(s);
	}
	public String mul(int a, int b)throws B, AB
	{
		
		if(a==0 && b!=0)
		{
			throw new B (ProUtility.getValue("a"));
		}
		else if(a !=0 && b == 0)
		{
			throw new B (ProUtility.getValue("b"));
		}
		else if (a == 0 && b ==0) {
			throw new AB (ProUtility.getValue("ab"));
		}
		else
		{
			int c = a*b;
			return "Multiply is = " + c;
		}
		
		
		
	}

}
