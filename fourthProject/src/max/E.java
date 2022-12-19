package max;

public class E {
	public static void main(String[] args) {
		int i = 3; int j = 2;
		do 
		{
			i+=i+2;
			i=i+j;
			j=i;
			i+=j;
		}while(i<10);//pointer enters into while loop when the condition is false
		System.out.println(i + " "+j);
	}

}
