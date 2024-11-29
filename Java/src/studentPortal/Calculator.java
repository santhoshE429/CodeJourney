package studentPortal;
import java.util.*;
public class Calculator {
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static int div(int a,int b)
	{
		return a/b;
	}
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		boolean flag=true;
		do
		{
			System.out.println("\t\t\tWelcome To Calculator:");
			System.out.println("1.Addition\n2.Substration\n3.Multipilication\n4.Division\n5.Exit");
			int input=sc.nextInt();
			switch(input)
			{
			case 1:{
				System.out.println("\t\t\t Welcome To Addition...... ");
				System.out.println("Enter a:");
				int a=sc.nextInt();
				System.out.println("Enter b :");
				int b=sc.nextInt();
				System.out.println("\t\t\tAddition Of Two Numbers: "+add(a,b));
				break;
			}
			case 2:{
				System.out.println("\t\t\t Welcome To Substration...... ");
				System.out.println("Enter a:");
				int a=sc.nextInt();
				System.out.println("Enter b :");
				int b=sc.nextInt();
				System.out.println("\t\t\tSubstration Of Two Numbers: "+sub(a,b));
				break;
			}
			case 3:
			{
			System.out.println("\t\t\t Welcome To Multiplication...... ");
			System.out.println("Enter a:");
			int a=sc.nextInt();
			System.out.println("Enter b :");
			int b=sc.nextInt();
			System.out.println("\t\t\tMultiplication Of Two Numbers: "+mul(a,b));
			break;
			}
			case 4:
			{
			System.out.println("\t\t\t Welcome To Division...... ");
			System.out.println("Enter a:");
			int a=sc.nextInt();
			System.out.println("Enter b :");
			int b=sc.nextInt();
			System.out.println("\t\t\t Division Of Two Numbers: "+div(a,b));
			break;
			}
			case 5:
			{
				
				flag=false;
				break;
			}
			
			}
		}while(flag);
	
		
		System.out.println("\t\t\tThank You For Using Calculator.... ");

}
}