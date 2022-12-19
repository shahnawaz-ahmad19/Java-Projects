package max;

import java.util.List;

public class Yogi {
	public static void main(String[] args) {
		VillageClass villageClass = new VillageClass();
		List<Object> p = villageClass.getData();
		
		for(Object t:p)
		{
			if(t instanceof Yadav)
			{
			Yadav y = (Yadav) t;
			System.out.println(y.getName()+" "+y.getAddress()+" "+y.getId());
			}
			else if (t instanceof Tyagi) {
				Tyagi f = (Tyagi)t;
				System.out.println(f.name+" "+f.id+" "+f.address);
			}
			else if (t instanceof Pandit) {
				Pandit pp = (Pandit)t;
				System.out.println(pp.name+" "+pp.id+" "+pp.address);
				
				
			}
		}
	}

}
