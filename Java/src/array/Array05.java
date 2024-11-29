package array;
import java.util.*;
public class Array05 {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		/* input={10,20,30,40,50
		 * n=3
		   output=40 50 10 20 30*/
		System.out.print("Enter size:");
		int size=sc.nextInt();
		int []a=new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter The Element:");
			a[i]=sc.nextInt();
		}
		 rotate(a);
		 System.out.println(Arrays.toString(a));
		 
	}
	public static void rotate (int []k)
	{
		
		System.out.print("Enter N:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			int first=k[0];
			for(int j=0;j<k.length-1;j++)
			{
				k[j]=k[j+1];
			}
			k[k.length-1]=first;
		}
		
		
	}
}
	