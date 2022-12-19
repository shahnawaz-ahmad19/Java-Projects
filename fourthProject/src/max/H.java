package max;

public class H {//without loop i.e using recursion
	
	public void getFactorial(int n)
	{
		int f = 1;
		if(n==0 || n == 1 ) 
		{
			System.out.println(f);
		}
		else
		{
			for(int i =n;i>1;)
			{
				f=f*i;
				i--;
			}
			System.out.println(f);
		}
	}
	
	
	public void print(int n)
	{
		if(n<=10)
		{
		System.out.println(n);
		print(n+1);
		}
		
	}
	
	public static void main(String[] args) {
		H h = new H();
//		h.print(1);
		h.getFactorial(5);
	}

}
