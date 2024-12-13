package collection;

import java.util.ArrayList;
import java.util.List;

public class AL2 {

	public static void main(String[] args) {
		//Accessing the elemen using get(int index).it returns object types
		List ls=new ArrayList();
		ls.add("Java");
		ls.add("Sql");
		ls.add("WebTech");
		System.out.println(ls);
		
		
		Object o=ls.get(0);
		Object o1=ls.get(2);
		String o2=(String)ls.get(1);
		System.out.println(o);
		System.out.println(o1);
		System.out.println(o2);

	}

}
