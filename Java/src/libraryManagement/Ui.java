package libraryManagement;

import java.util.Scanner;

public class Ui {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		 Books b=new Books();
		System.out.println("\t\t\t Welcome To Library Management");
		boolean flag=true;
		do {
			System.out.println("1.AddBook\n2.RemoveBook\n3.SearchBook\n4.SortBook\n5.DisplayBook\n6.Exit");
			int input=sc.nextInt();
			switch (input) {
			case 1:
			{	
				b.addBooks();
				break;
			}
			case 2:
			{
				if(b.removeBook())
				{
					System.out.println("\t\t\tBook is Removed");
				}
				else {
					System.out.println("\t\t\tBooks is Removed");
				}
				break;
			}
			case 3:
			{
				if(b.searchBook())
				{
					System.out.println("\t\t\tBook is Present");
				}
				else {
					System.err.println("\t\t\tBook is not present");
				}
				break;
			}
			case 4:
			{ 	b.sortBook();
				break;
			}
			case 5:
			{	b.display();
				break;
			}
			case 6:
			{
				flag=false;
				break;
			}
				

			default:
				break;
			}
			} while (flag);
		System.out.println("\t\t\t Thank You for Using My App");
		

	}

}
