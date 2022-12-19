package max2;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class LinkedListTest {
	public static void main(String[] args) {
//		LinkedList<String> l = new LinkedList<String>();
		Vector<String> l = new Vector<String>();
		
		l.add("A");
		l.add("B");
		l.add("C");
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			String p = it.next();
					System.out.println(p);
		}
		System.out.println("------------------------");
		Enumeration<String> e = l.elements();
		while(e.hasMoreElements())
		{
			String t=e.nextElement();
			System.out.println(t);
		}
	}

}
