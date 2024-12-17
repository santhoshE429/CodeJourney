package collection;

import java.util.ArrayList;
import java.util.List;

public class ForEach1 {

	public static void main(String[] args) {
		List ls=new ArrayList();
		ls.add("Sant");
		ls.add("java_developer");
		ls.add(20);
		ls.add(true);
		
		for (Object o : ls) {
			System.out.println(o);
		}
		System.out.println("======================");
		int []a= {10,20,30,40,50};
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("*******************");
		String[] b= {"hi","am","sant"};
		for (String str : b) {
			System.out.println(str);
		}
		
		
	}	
	
	

}
