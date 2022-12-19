package max2;

import java.util.List;

public class EMPCL {
	public static void main(String[] args) {
		ListEmp listEmp = new ListEmp();
		List<Emp>list= listEmp.getEmp();
		for(Emp p : list)
		{
			System.out.println(p.getEid()+" "+p.getName());
		}
	}

}
