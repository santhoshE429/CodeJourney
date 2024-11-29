package Basics;
import java.util.*;

public class CountNum {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		System.out.println("Total digits are:"+count);
	}

}
