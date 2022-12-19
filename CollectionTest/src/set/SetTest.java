package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
public static void main(String[] args) {
//	Set<String> s=new HashSet<String> ();
//	Set<String> s=new LinkedHashSet<String> ();
	Set<String> s=new TreeSet<String> ();
	s.add("A");
	s.add("B");
//	s.add(null);
	s.add("H");
	s.add("D");
	System.out.println(s);
	for(String p:s)
	{
		System.out.println(p);
	}
	System.out.println("------------------");
	
	Iterator<String>it = s.iterator();
	while(it.hasNext())
	{
		String q = it.next();
		System.out.println(q);
	}
}
}
