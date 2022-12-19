package max;

public class Table {
	
	public void m(int y)
	{
		for(int i = 0; i<= y; i++)
		{
			if(i%2==0)
			{
			System.out.println(i);
			}
			i++;
		}
	    
	}
	
	
	public void generateTable(int n)
	{
		for(int i =1; i<=10;)
		{
			int t = i*n;
			i++;
			System.out.println(t);
		}
	}

}
