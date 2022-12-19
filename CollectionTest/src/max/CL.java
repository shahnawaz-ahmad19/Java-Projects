package max;

import java.util.List;

public class CL {
	public static void main(String[] args) {
		ListTest listTest = new ListTest();
//		String p = listTest.getDetail();
//		String[] t = p.split(",");
//		System.out.println(t[0]+" "+t[1]+" "+t[2]);
		
//		User q =listTest.getUserDetail();
//		System.out.println(q.getName()+" "+q.getAddress()+" "+q.getPhone());
		
	  List<User> b = listTest.getAllUserDetail();
	  for(   User w : b)
	  {
		  System.out.println(w.getName()+" "+w.getAddress()+" "+w.getPhone());
	  }
	}

}
