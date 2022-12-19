package set;

import java.util.Set;

public class DADA {
	public static void main(String[] args) {
		Set<Emp> s = SetEmp.getData();
		
		for(Emp p : s)
		{
			System.out.println(p.getEid()+" "+p.getName());
		}
	}

}
