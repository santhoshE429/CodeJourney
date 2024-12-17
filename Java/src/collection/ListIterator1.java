package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator1 {

	public static void main(String[] args) {
		
		List ls=new ArrayList();
		ls.add("Java");
		ls.add("SQL");
		ls.add("Manual");
		ls.add(null);
		ls.add(1);
		
		ListIterator i=ls.listIterator();
		System.out.println("Traversing Forward direction");
		while (i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("********************");
		while (i.hasPrevious())
		{
			System.out.println(i.previous());
		}
		System.out.println("**********************");
	}

}
