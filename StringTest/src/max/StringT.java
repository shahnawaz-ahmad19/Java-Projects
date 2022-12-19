package max;

public class StringT {
	public static void main(String[] args) {
		String s = "india";// agar koi method object k saath call kiya jaat hai to non-static method hota hai. yahan 's' object hai . aur agar koi  method class k saath call kiya jaata hai to wo static method kehlata hai.
		char[] t = s.toCharArray();
		String ss = "one  two  three  four";
		String[] d = ss.split("  ");
//		System.out.println(d[3]);
		for(String q : d)
		{
			System.out.println(q);
		}
		
		String s1 = "      Shaan is a good boy";
		System.out.println(s1.trim());// trim() is used to eliminate the space.
		System.out.println(s.charAt(1));
	}

}
