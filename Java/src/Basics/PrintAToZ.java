package Basics;
import java.util.*;
public class PrintAToZ {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("1.Print A-Z\n2.Print a-z\n3.Print 100-1");
		int n=sc.nextInt();
		switch(n)
		{
		case 1:
		{
			char ch='A';
			while(ch<='z')
			{
				System.out.print(ch++ +" ");
			}
		break;	
		}
		case 2:
		{
			char ch='a';
			while(ch<='z')
			{
				System.out.print(ch++ +" ");
			}
		break;	
		}
		case 3:
		{
			int start=100,End=1;
			while(start>=End)
			{
				System.out.println(start);
				start--;
			}
			break;
		}
		
		default :
		{
			System.out.println("invalid Input:");
		}
		
		}
	}

}
