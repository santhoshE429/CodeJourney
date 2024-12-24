package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap();
		
		//Adding the element to HashMap
		m.put(1,"Sant");
		m.put(89, "ap");
		m.put(2,"Jp");
		m.put(3, "ABC");
		m.put(4,"DEF");
		System.out.println(m);
		
		Map m1=new HashMap();
		
		//Coping the map from another map
		m1.putAll(m);
		System.out.println("Map is copy from another Map:"+m1);
		
		//Search the key from hashMap
		System.out.println("key is present:"+m.containsKey(89));
		
		//Search the value from hashMap
		System.out.println("Value is present:"+m.containsValue("ap"));
		
		//Remove the key from HashMap
		
		System.out.println("Removed key "+m.remove(1));
		System.out.println(m);
		
		//clear the map
		
		m1.clear();
		System.out.println(m1);
		
		//It's return only keys in map in the form of set
		Set s=m.keySet();
		System.out.println(s);
		
		//It's return entries in the form of set
		Set s1=m.entrySet();
		System.out.println(s1);
		
		//Using get(key) method getting the value 
		System.out.println(m.get(4));

	}

}
