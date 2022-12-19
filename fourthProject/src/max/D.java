package max;

public class D {
	public static void main(String[] args) {
		for(int i =3;i<=10;)
		{
			i *=i%2+2;
			System.out.println(++i);
			i+=++i+1;
		}
	}

}
