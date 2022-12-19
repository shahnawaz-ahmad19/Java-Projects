package set;

import java.util.HashSet;
import java.util.Set;

public class SetEmp {
	public static Set<Emp> getData()
	{
		Set<Emp> s=new HashSet<Emp>();
		Emp e = new Emp();
		e.setEid(10);
		e.setName("Bala");
		s.add(e);
//		System.out.println(e.hashCode());
		
		Emp e1 = new Emp();
		e1.setEid(12);
		e1.setName("Aala");
		s.add(e1);
//		System.out.println(e1.hashCode());
		
		Emp e2 = new Emp();
		e2.setEid(10);
		e2.setName("Bala");
		s.add(e2);
//		System.out.println(e2.hashCode());
		
		return s;
	}
	

}
