package maps;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
	
		Map m=new TreeMap();
		//Adding the element to TreeMap
		m.put(4,"Sant");
		m.put(2, "Java");
		m.put(3,"SQL");
		m.put(1, "HTML");
		System.out.println(m);
		
		//remove the element
		
		m.remove(3);
		System.out.println(m);
		
		//return the key
		
		System.out.println(m.containsKey(3));
		
		//return the value
		
		System.out.println(m.containsValue(4));
		
		//return keySet
		
		System.out.println(m.keySet());
		
		//return value using get(key)
		
		System.out.println(m.get(2));
	}

}
