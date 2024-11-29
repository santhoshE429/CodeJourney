package array;
import java.util.*;

public class PrimeCountAndSum {
	public static boolean isPrime(int num)
	{
		if(num==1||num==0)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) 
	{
		int[]a= {4,5,7,1,11,3,8};
		System.out.println(Arrays.toString(a));
		int count =0,sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[i]))
			{
				count++;
				sum+=a[i];
			}
		}
		System.out.println(count);
		System.out.print("Sum Of Prime Numbers:"+sum);
		
	}

	
}

