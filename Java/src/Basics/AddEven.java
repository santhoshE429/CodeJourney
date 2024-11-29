package Basics;
import java.util.Scanner;
public class AddEven {
	
	static Scanner sc=new Scanner(System.in); 
	public static void main(String[] args) {
		System.out.println("Enter The Number");
		int num=sc.nextInt();
		int sum=0;
		while(num>0)
		{	
			int lastdigit=num%10;
			if(lastdigit%2==0)
			{
				 sum += lastdigit%10;
			}
			num/=10;
		}
		System.out.println(sum);
		

	}

}
