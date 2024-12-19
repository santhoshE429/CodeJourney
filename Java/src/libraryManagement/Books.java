package libraryManagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Books implements Comparable {
	String bname;
	int bid;
	double price;
	static Scanner sc = new Scanner(System.in);

	List <Books> book = new ArrayList();

	public Books() {

	}

	public Books(String bname, int bid, double price) {
		super();
		this.bname = bname;
		this.bid = bid;
		this.price = price;
	}

	@Override
	public String toString() {
		return bid + ":" + bname + ":" + price;
	}

	@Override
	public int compareTo(Object o) {

		Books b = (Books) o;
		if (this.price == b.price) {
			return 0;
		} else if (this.price > b.price) {
			return 1;
		} else {
			return -1;
		}
	}
	
	

	public void addBooks() {
		System.out.print("Enter The Book Id:");
		bid = sc.nextInt();
		System.out.print("Enter The Book Price:");
		price = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter The Book Name:");
		bname = sc.nextLine();

		if (!book.contains(bname)) {
			book.add(new Books(bname, bid, price));
			System.out.println("\t\t\tBook is added");
		} else {
			System.err.println("\t\t\tBook is already presenet");
		}

	}

	


	public boolean removeBook() {
		
		
		  System.out.print("\t\t\t Enter the Book Name:"); 
           String name=sc.nextLine();
           for (Books b : book)
           {
        	 
        	   if (b.bname.equals(name)) 
        	   { 
			  
        		   book.remove(b);
        		   	return true;
        		}
		  
		  } return false;

	}

	public boolean searchBook()
	{
		System.out.print("\t\t\tEnter The Book Name:");
		String name=sc.nextLine();
		 boolean flag;
		for (Books o :book) 
		{
			if(o.bname.equals(name))
			{
				return true;
			}
		}
		return false;
			
				
			
	}

	public void sortBook() {
		if (book.size() > 0) {
			Collections.sort(book);
			for(Books b:book)
			{
				System.out.println("\t\t\t "+b);
			}
		}
	}

	public void display() {
		for(Books b:book)
		{
			System.out.println("\t\t\t"+b);
		}
		
	}
}