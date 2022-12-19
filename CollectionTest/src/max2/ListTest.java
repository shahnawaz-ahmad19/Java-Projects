package max2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {
	public static List<Integer> getData()
	{
//		 List<String> l= new ArrayList<String>();
		 List<Integer> l= new ArrayList<Integer>();
		 
			
//			 l.add("Bala");
//			 l.add("Aala"); 
//			 l.add("Kaala"); 
//			 l.add("Maala"); 
			 
		 l.add(9);
		 l.add(3);
		 l.add(6);
		 Collections.sort(l);
		 
		return l;
	}

}
