package Basics;
import java.util.*;

public class XylemOrPhloem {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the Number:");
		int num=sc.nextInt();
		int lastdigit=num%10;
		num=num/10;
		int sum=0;
		while(num>9)
		{
			sum=sum+num%10;
			num=num/10;
		}
		int num1=lastdigit+num;
		String str=(sum==num1)?"The given number is xylem":"The given Number is Pholem";
		System.out.println(str);
		
		
	}

}
