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
		System.err.println("\t\t\t\t Add an Element");
		
		System.out.println("\t\t\t\t add an element using object\n");
		System.out.println("Bag1:Element is added using object:"+bag1);
		System.out.println("Bag2:Element is added using object:"+bag2);
		System.out.println("Bag3::Element is added using objec:"+bag3+"\n");
		//add an element using collection
		bag2.addAll(bag1);
		bag3.addAll(bag2);
		System.out.println("\t\t\t\t add an element using collection\n");
		System.out.println("Bag2:Element is added using collection bag2<---bag1:"+bag2);
		System.out.println("Bag3:Element is added using collection bag3<---bag2:"+bag3+"\n");
		
		// add  an element using index
		System.out.println("\t\t\t\t add  an element using index\n");
		bag2.add(3,429 );
		System.out.println("bag2:add  an element using index-3:"+bag2+"\n");
		// add  an element using collection with help of index
		
		System.out.println("\t\t\t\tadd  an element using collection with help of index\n");
		bag1.addAll(3,bag1);
		System.out.println("bag1:add  an element using collection with help of index 3 <--bag1:"+bag1+"\n");
		
		System.err.println("\t\t\t\t Seaching an Element\n");
		
		System.out.println("Bag1:"+bag1);
		System.out.println("Bag2"+bag2);
		System.out.println("Bag3"+bag3);
		//search an Element using object
		System.out.println("\t\t\t\tsearch an Element using object\n");
		System.out.println("The element 20 is search in bag1:"+bag1.contains(20));
		
		//search an Element using collection
		System.out.println("\t\t\t\t search an Element using collection\n ");
		System.out.println("The element is bag1 is present or not: "+bag2.containsAll(bag1)+"\n");
		
		//search an Element using indexOf
		System.out.println("\t\t\t\tsearch an Element using indexOf");
		System.out.println("The element santhosh is present in bag3 :"+bag3.indexOf("Santhosh"));
		System.out.println("The element 20 is present in bag2: "+bag2.indexOf(20));
		System.out.println("The element true is present in bag1:  "+bag1.indexOf(true));
		
		
		System.err.println("\t\t\t\t Remove an Element\n");
		//remove an element using object
		System.out.println("\t\t\t\tremove an element using Index");
		bag1.remove(3);
		System.out.println("After removing an element 3 index: "+bag1);
		//remove an element using collection
		System.out.println("\t\t\t\tremove an element using collection");
		bag3.removeAll(bag1);
		System.out.println("After removing an bag1 element :"+bag3);
		
		// remove an element using collection.it act like intersection
		System.out.println("\t\t\t\tremoving the element using retainAll");
		bag2.retainAll(bag1);
		System.out.println("After removing an element "+bag2);
		//Empty the bag using clear method
		System.err.println("\t\t\t\t Empty the bag using clear method");
		bag2.clear();
		System.out.println(bag2);

	}

}
