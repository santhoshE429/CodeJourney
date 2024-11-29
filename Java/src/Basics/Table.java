package Basics;
import java.util.*;
class Table {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter The Table Of Number");
		int num=sc.nextInt();
		System.out.println("Enter The Starting Of The Number ");
		int i=sc.nextInt();
		
		while(i<=10)
		{
			System.out.println(num+" * "+ i + " = " +(num*i));
			i++;
		}
	}

}
