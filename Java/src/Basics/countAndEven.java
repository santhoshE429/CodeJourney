package Basics;
import java.util.Scanner;
public class countAndEven {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter The Number:");
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
			
		}
		System.out.println("The number of digit: " +count);
		if(count%2==0)
		{
			char ch='Z';
			while(ch>='A')
			{
				System.out.print(ch-- +" ");
				
			}
		}
		else
		{
			int j=10;
			while(j>=1)
			{
				if(j%2==1)
				{
					System.out.println(j);
				}
				j--;
			}
			
		}
	}

}
