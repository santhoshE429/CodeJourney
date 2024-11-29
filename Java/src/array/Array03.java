package array;

import java.util.*;

public class Array03 {
	 static Scanner sc= new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.print("Enter size:");
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter The Element:");
			a[i]=sc.nextInt();
		}
		int res=findSmallest(a);
		System.out.println(res);
	}
	public  static int findSmallest(int[]k)
	{
		int smallest=k[0];
		for(int i=0;i<k.length;i++)
		{
			if(k[i]<smallest)
			{
				smallest=k[i];
			}
		}
		return smallest;
		
	}


}