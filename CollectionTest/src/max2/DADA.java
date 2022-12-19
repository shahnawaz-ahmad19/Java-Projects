package max2;

import java.util.Collections;
import java.util.List;

public class DADA {
	public static void main(String[] args) {
		List<Integer> list = ListTest.getData();
		Collections.synchronizedList(list);
		synchronized (list) {
			
		
		for(Integer p:list)
		{
			System.out.println(p);
		}
		
		}
	}

}
