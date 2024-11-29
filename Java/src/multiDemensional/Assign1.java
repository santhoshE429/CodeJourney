package multiDemensional;
import java.util.*;
public class Assign1 {

	public static void main(String[] args) {
		
		int[][]a= {{1,2,6,3,8,4,9},
					{4,5,7,11,3,8},
					{2,3,4,3,5,2,3},
					{4,9,0,1,6,78,8}};
		int res=sumOfEven(a[0]);
		System.out.println(res);
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[1]));
			{
				
				count++;
			}
			
		}
		
		System.out.println("Prime Number Count is:"+count);
		String res1=printDup(a[2]);
		System.out.println(res1);
		int []res2=removeDup(a[3]);
		System.out.println("Smallest Number is:"+res2[0]);
	
	}
	public static int sumOfEven(int []a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				{
					sum+=a[i];
				}
			
		}
		return sum;
	}
	public static boolean isPrime(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1||a[i]==0)
			{
					return false;
			}
			
		}
		for(int i=2;i<a.length;i++)
		{
				if(a[i]%i==0)
				{
					return false;
				}
			
		}
		return true;
	}
	public static String printDup(int a[])
	{
		int count =1;
		String res=" ";
		boolean flag=false;
		
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]&&a[i]!=Integer.MIN_VALUE)
				{
					count++;
					a[j]=Integer.MIN_VALUE;
				}
			}
			if(count>1)
			{
				flag=true;
				res+=a[i]+" ";
			}		
		}
		if(flag==false)
		{
			res="No Duplicate";
		}
		
		return res;
	}
	public static int[]removeDup(int a[])
	{
		int b[]=new int[a.length];
		Arrays.sort(a);
		int x=0;
		for(int i=0;i<a.length-1;i++)
		{
				if(a[i]!=a[i+1])
				{
					b[x++]=a[i];
				
				}
		}
		b[x++]=a[a.length-1];
		int res[]=new int[x];
		for(int i=0;i<res.length;i++)
		{
			res[i]=b[i];
		}
		return res;	
		
		
	}
}