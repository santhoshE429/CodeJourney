package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		List ls=new ArrayList();
		ls.add(90);
		ls.add(34);
		ls.add(78);
		ls.add(0);
		Collections.sort(ls);
		System.out.println(ls);
		System.out.println("************");
		List ls2=new ArrayList();
		ls2.add("sant");
		ls2.add("ABC");
		ls2.add("xki");
		ls2.add("fght");
		ls.add("pje");
		Collections.sort(ls2);
		System.out.println(ls2);
		
	}
}
