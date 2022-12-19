package max;

public class H {
	public static void main(String[] args) {
		for(int i = 1; i <= 3;)
		{
			for(int j = 3; j>1;)
			{
				if(i!=j)
				{
				System.out.println(i + " " + j);
				break;
				}
				j--;
			}
			i++;
		}
	}

}
