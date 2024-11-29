package array;
import java.util.*;
public class Array04 {
	static Scanner sc=new Scanner(System.in);
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
		 findMissing(a);
	}
	public static void findMissing(int[]k)
	{
		for(int i=0,j=1;i<k.length;i++,j++)
		{
			if(k[i]!=j)
			{
				System.out.print(j +"");
			}
		}

	}

}
