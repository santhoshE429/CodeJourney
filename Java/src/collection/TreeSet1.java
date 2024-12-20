package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		Set <String >s=new TreeSet();
		//Add the element to TreeSet
		
		//It accept only homogeneous element
		//Elements are stored in ascending order
		//Mainly used for uniqueness and sorting
		s.add("Sant");
		s.add("Abc");
		s.add("def");
		s.add("Java");
		System.out.println(s);
		
		//Remove the element to TreeSet
		s.remove("def");
		System.out.println(s);
		
		//Search the element to TreeSet
		System.out.println(s.contains("Java"));
		
		//Access the element to TreeSet
		
		Iterator<String> i=s.iterator();
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
