package Basics;
import java.util.*;

public class TypesOfDigit {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("\t\t\t Enter The Number");
		int num =sc.nextInt();
		int Z_count=0,E_count=0,O_count=0;
		
		while(num>0)
		{
			if(num%10==0)
				Z_count++;
			else if(num%2==0)
				E_count++;
			else
				O_count++;
				num/=10;
		}
		System.out.println("Total Zeros:"+Z_count);
		System.out.println("Total Even's:"+E_count);
		System.out.println("Total Odd's:"+O_count);
	}

}
