package collection;

import java.util.ArrayList;
import java.util.List;

public class Non_Generic {

	public static void main(String[] args) {
		List ls=new ArrayList();
		ls.add(10);
		ls.add(0.0);
		ls.add(null);
		ls.add("hello");
		ls.add('s');
		
		System.out.println(ls);
		
	}
}
