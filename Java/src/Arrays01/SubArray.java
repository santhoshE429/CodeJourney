package Arrays01;

import java.util.*;

public class SubArray {

	public static void main(String[] args) {
		int a[]= {1,-2,6,-1,3};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				for(int k=i;k<=j;k++)
				{
					System.out.print(a[k]+"-");
				}
				System.out.print("\t\t");
				
			}
			System.out.println();
		}

	}

}
