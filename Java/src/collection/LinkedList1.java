package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {

	public static void main(String[] args) {
		List ls=new LinkedList();
		//add the element from LinkedList
		ls.add(90);
		ls.add(9);
		ls.add(34);
		ls.add(2, "Sant");
		System.out.println(ls);                                                    
		System.out.println(ls.indexOf("Sant"));
		
		//Remove the element from LinkedList
		ls.remove(2);
		System.out.println(ls);
		
		//Search the element from LinkedList
		System.out.println(ls.contains(90));
		
		// Access the element from LinkedList
		for (Object o : ls) {
			System.out.println(o);
		}
		 Iterator i=ls.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }
		//to get size
		 
		 System.out.println(ls.size());
		 System.out.println(ls.isEmpty());
		 System.out.println(ls.toArray());
		 System.out.println(ls.hashCode());
		

	}

}
