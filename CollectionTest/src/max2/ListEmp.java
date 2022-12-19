package max2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEmp {
	public List<Emp> getEmp()
	{
		List<Emp> l= new ArrayList<Emp>();
		Emp e = new Emp();
		e.setEid(10);
		e.setName("Bala");
		l.add(e);
		
		Emp e1 = new Emp();
		e1.setEid(18);
		e1.setName("Ala");
		l.add(e1);
		
		Emp e2 = new Emp();
		e2.setEid(1);
		e2.setName("Kala");
		l.add(e2);
		
		Collections.sort(l);
		return l;
	}

}
