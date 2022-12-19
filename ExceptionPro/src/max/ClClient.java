package max;

public class ClClient {
	public static void main(String[] args) {
		 B b = new B();
		 try {
			 String t= b.mul (0, 6);
			 System.out.println(t);
		} catch (B e) {
			
			e.printStackTrace();
		}
		 catch (AB e) {
				
				e.printStackTrace();
			}
	}

}
