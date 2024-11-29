package multiDemensional;

import java.util.Scanner;

public class SumOfTwoMultiDem
{
	 static int a[][]=new int[3][3];
	 static int b[][]=new int[3][3];
	 static int sum=0;
	 static Scanner sc =new Scanner(System.in);
	 public static void PrintToA()throws Exception
	 {
		 for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.print(a[i][j]+"   " );
					Thread.sleep(100);
					
				}
				System.out.println();	
			} 
		 System.out.println();
	 }
	 public static void PrintToB()throws Exception
	 {
		 for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					System.out.print(b[i][j]+"   " );
					Thread.sleep(100);
					
				}
				System.out.println();	
			} 
		 System.out.println();
	 }
	 public static void SumOfAndB()throws Exception
	 {
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a[i].length;j++)
			 {
				 sum= a[i][j]+b[i][j];
				 System.out.print(sum +"   ");
				 Thread.sleep(100);
			 }
			 System.out.println();
		 }
	 }
	public static void main(String[] args)throws Exception
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enter The Element "+i+" "+j+":");
				a[i][j]=sc.nextInt();
			}
			System.out.println();	
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print("Enter The Element "+i+" "+j+":");
				b[i][j]=sc.nextInt();
				
			}
			System.out.println();
		}
		PrintToA();
		PrintToB();
		SumOfAndB();
		
	}
}
