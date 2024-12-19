package collection;

import java.util.ArrayList;
import java.util.Collections;

 class Laptop implements Comparable
{
	int id;
	String name;
	double price;
	public Laptop(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o)
	{
		Laptop l=(Laptop)o;
		if (this.price==l.price) 
		{
			return 0;
			
		}
		else if (this.price>l.price) 
		{
			
			return 1;
		}
		else {
			
			return -1;
		}
////		if(this.name.equals(l.name))
////		{
////			return 0;
////		}
////		else if(this.name.compareTo(l.name) > l.name.compareTo(this.name))
////		{
////			return 1;	
////		}
////		else
////		{
////			return -1;
////		}
//		return this.name.compareTo(l.name);
//		
	}
	
}

public class Amazon{
	public static void main(String[] args) {
		
		ArrayList <Laptop> products=new ArrayList<Laptop>();
		products.add(new Laptop(1, "Hp",10000));
		products.add(new Laptop(2, "Hcl", 25999));
		products.add(new Laptop(3, "Lenovo", 129999));
		products.add(new Laptop(8, "Apple", 23199));
		products.add(new Laptop(9, "Apple", 23199));
		

		
		System.out.println("Before Sorting:"+products);
		
		Collections.sort(products);
		System.out.println("After Sorting :"+products);
	}
}
