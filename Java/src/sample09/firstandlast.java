package sample09;
import java.util.*;


class first {
 
	
	public static void main(String[] args) {
		
		//System.out.println("Enter The Number");
		int num=5776;
		int lastdigit =num%100;
		lastdigit *=lastdigit;
   String str =(num==lastdigit)?"automorphic ":"not a automorpphic";
   System.out.println(str);
		
		
		
	}

}


public class firstandlast {
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


