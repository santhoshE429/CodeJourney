package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator1 {

	public static void main(String[] args) {
		List ls=new ArrayList();
		ls.add(10);
		ls.add("sant");
		ls.add(true);
		ls.add(29.0);
		Iterator i=ls.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
