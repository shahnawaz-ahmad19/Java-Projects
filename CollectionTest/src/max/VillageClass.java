package max;

import java.util.ArrayList;
import java.util.List;

public class VillageClass {
	List<Object> l= new ArrayList<Object>();
	public List<Object> getData()
	{
		Yadav y = new Yadav();
		y.setAddress("Agra");
		y.setId(1123);
		y.setName("Rupesh");
		l.add(y);
		
		
		l.add(new Pandit("Birju", "Lucknow", 198));
		l.add(new Tyagi("Langda", "kanpur", 456));
		
		return l;
		
	}

}
