package Arrays01;

import java.util.Arrays;

public class TargetSum {

	public static void main(String[] args) {
		int []a= {8,1,2,9,6,5,16,4};
		System.out.println(Arrays.toString(a));
		targetSum(a,10);
	}
	public static void targetSum(int []a ,int target)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println(a[i]+"-"+a[j]);
				}
			}
		}
	}

}
