package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		
		Set s=new  LinkedHashSet();
		//add the element to LinkedHashSet
		//it accept heterogeneous element
		//it is similar to just like HashSet but it maintain the insertion order
		s.add("sant");
		s.add(20);
		s.add(12);
		s.add(2002);
		System.out.println(s);
		
		//remove the element to LinkedHashSet
		s.remove(12);
		System.out.println(s);
		//Search the element to LinkedHashSet
		
		System.out.println(s.contains(2002));
		
		//add the element to LinkedHashSet
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		//size
		
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.hashCode());
		System.out.println(s.toArray());
	}
	

}
