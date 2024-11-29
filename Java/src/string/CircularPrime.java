package string;

import java.util.Scanner;

public class CircularPrime {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter The Numbe:");
		String s=sc.next();
		char[]a=s.toCharArray();
		int n=a.length-1;
		
		boolean b=isCircularPrime(n, a);
		String res=(b)?"Circular Prime":"Not a Circular Prime";
		System.out.println(res);
		
	}
	public static boolean isCircularPrime(int n,char[]a)
	{
		for(int i=0;i<=n;i++)
		{
			char first=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			
			a[a.length-1]=first;
			String s=new String(a);
			int num=Integer.parseInt(s);
			if(!(isPrime(num)))
					return false;
		}
		
		return true;
		
	}
	public static boolean isPrime(int n)
	{
		if(n==1||n==0)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	
}
