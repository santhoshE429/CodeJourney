package Arrays01;
import java.util.*;

public class SumArraySum {

	public static void main(String[] args) {
		int[]a= {1,-2,6,-1,3};
		System.out.println(Arrays.toString(a));
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				int sum=0;
				for(int k=i;k<=j;k++)
				{
					sum+=a[k];
					
				}
				System.out.print(sum+" ");
				
				if(sum>max)
				{
					max=sum;
				}
			}
			System.out.println();
			
			
		}
		System.out.println("Max num is :"+max);
	}

}
