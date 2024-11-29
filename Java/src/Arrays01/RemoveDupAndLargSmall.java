package Arrays01;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDupAndLargSmall {
	static Scanner scanner=new Scanner(System.in);

	public static void main(String[] args) {
		int[]a= {8,4,3,1,7,8,1};
		System.out.println(Arrays.toString(a));
		int[]res=removeDup(a);
		System.out.println(Arrays.toString(res));
		System.out.println("/t/t/t/Enter The Input:");
		System.out.println("1.Nth largest\n2.Nth Smallest\3.Exit");
		int input=scanner.nextInt();
		if(input==1)
		{
			System.out.print("Enter N:");
			int n=scanner.nextInt();
			if(n<res.length)
			{
				System.out.println(n+"th largest:"+res[res.length-n]);
			}
			else 
			{
				System.out.println("Invalid");
			}
		}
		if(input==2)
		{
			System.out.print("Enter N:");
			int n=scanner.nextInt();
			if(n<res.length)
			{
				System.out.println(n+"th largest:"+res[n-1]);
			}
			else 
			{
				System.out.println("Invalid");
			}
		}
	}
		public static int[] removeDup(int []a)
		{
			int []b=new int [a.length];
			Arrays.sort(a);
			int x=0;
			for (int i=0;i<a.length-1;i++)
			{
				if(a[i]!=a[i+1])
				{
					b[x++]=a[i];
				}
			}
			b[x++]=a[a.length-1];
			int[]res=new int[x];
			for(int i=0;i<res.length;i++)
			{
				res[i]=b[i];
			}
			return res;

	}

}
