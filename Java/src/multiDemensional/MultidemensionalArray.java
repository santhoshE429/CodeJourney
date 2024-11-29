package multiDemensional;

import java.util.Scanner;

public class MultidemensionalArray {
	
	static Scanner sc=new Scanner(System.in);
	static int a[][]=new int[4][4];
	
	public static void ToptoBottomLeftToRight()throws Exception
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				Thread.sleep(1000);
				
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void ToptoBottomRightToLeft()throws Exception
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
				Thread.sleep(1000);
				
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void BottomToTopRightToLeft()throws Exception
	{
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
				Thread.sleep(1000);
				
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void  BottomToTopLeftToRight()throws Exception
	{
		for(int i=a.length-1;i>=0;i--)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
				Thread.sleep(1000);
				
				
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args)throws Exception
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print("Enter The Element:");
				a[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		ToptoBottomLeftToRight();
		ToptoBottomRightToLeft();
		BottomToTopLeftToRight();
		BottomToTopRightToLeft();
		

	}

}
