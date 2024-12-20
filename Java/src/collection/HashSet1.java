package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet1 {

	public static void main(String[] args) {
		
		//add the element from hashSet
		Set s=new HashSet();
		s.add(10);
		s.add("sant");
		s.add(null);
		s.add(20);
		s.add(null);
		System.out.println(s);
		
		//add the element from hashSet
		s.remove(10);
		System.out.println(s);
		//Search the element from hashSet
		System.out.println(s.contains(null));
		
		////add the elt from hashSet
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
