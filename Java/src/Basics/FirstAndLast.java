package Basics;
import java.util.*;
public class FirstAndLast {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter The Number: ");
		int num=sc.nextInt();
		if(num>=0 && num<=9)
		{
			System.out.println("Invlaid Number Don't Enter Single Value");
		}
		else
		{
			int last=num%10;
			while(num>9)
			{
				num=num/10;
			}
			int sum=last+num;
			System.out.println("First and Last Digit Sum:"+sum);
		}


	}

}
