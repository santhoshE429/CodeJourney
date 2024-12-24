package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMap1 {

	public static void main(String[] args) {
		Map m=new LinkedHashMap();
		
		//Adding the element to LinkedHashMap
		//It maintain the insertion order
		m.put(1, "Apple");
		m.put(2,"Orange");
		m.put(3, "Banana");
		m.put(0, "PineApple");
		System.out.println(m);
		
		//removing the element
		m.remove(0);
		System.out.println(m);
		
		//return only key
		
		System.out.println(m.containsKey(1));
		
		//return only value
		System.out.println(m.containsValue("Apple"));
		
		//return the keySet
		
		System.out.println(m.keySet());
		
		//return the entries
		System.out.println(m.entrySet());
		
		//get(key)
		
		System.out.println(m.get(0));
		
		
		
		
	}

}
