package maps;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTable1 {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new Hashtable();
		
		//Adding the element to Hashtable
		m.put(33,"hardik");
		m.put(45,"rohit");
		m.put(18,"Virat");
		m.put(20, "Sant");
		System.out.println(m);
		
		//Removing the element to HashTable
		m.remove(20);
		System.out.println(m);
		
		//Search the key to HashTable
		System.out.println(m.containsKey(20));
		
		//Search The value to HashTable
		System.out.println(m.containsValue("Sant"));
		
		//it return the keySet
		Set s=m.keySet();
		System.out.println(s);
		
		//It return entries
		Set s1=m.entrySet();
		System.out.println(s1);
		
		//Using get(key) we will get the value
		System.out.println(m.get(33));
		
		
		
		

	}

}
