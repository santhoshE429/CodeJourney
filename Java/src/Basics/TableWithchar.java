package Basics;
import java.util.*;
public class TableWithchar {
	static Scanner sc=new Scanner(System.in);	
	public static void main(String[] args) {
		System.out.println("Enter The Number...");
		int num=sc.nextInt();
		char ch='A';
		int j=1;
		while(j<=10)
		{
			if(j%2==0)
			{
				System.out.println(ch++ + " * " + ch++ + " = "+ch++);
				
			}
			else
			{
				System.out.println(num + " * " +j+" = " +(num*j));
			}
			j++;
			
		}
		
		

	}

}
