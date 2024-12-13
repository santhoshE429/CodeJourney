package collection;
import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		List bag1=new  ArrayList();
		List bag2=new  ArrayList();
		List bag3=new ArrayList();
		//add an element using object
		bag1.add(20);
		bag1.add("Santhosh");
		bag1.add(true);
		bag2.add(40);
		bag3.add("java_developer");
		//add an element using collection
		bag2.addAll(bag1);
		bag3.addAll(bag2);
		// add  an element using index
		bag2.add(3,429 );
		// add  an element using collection
		bag1.addAll(3,bag1);
		bag3.addAll(3,bag1);
		System.out.println(bag1);
		System.out.println(bag2);
		System.out.println(bag3);
		
		//search an Element using object
		System.out.println("The element is "+bag1.contains(20));
		//search an Element using collection
		System.out.println("The element is "+bag2.containsAll(bag1));
		//search an Element using indexOf
		System.out.println("The element is "+bag3.indexOf("Santhosh"));
		System.out.println("The element is "+bag3.indexOf(true));
		System.out.println("The element is "+bag1.indexOf(true));
		
		//remove an element using obeject
		bag1.remove(3);
		System.out.println("After removing an element "+bag1);
		//remove an element using collection
		bag3.removeAll(bag1);
		System.out.println("After removing an element "+bag3);
		// retrieving an element using collection
		bag2.retainAll(bag1);
		System.out.println("After removing an element "+bag2);
		//Empty the bag using clear method
		bag2.clear();
		System.out.println(bag2);

	}

}
