package multiDemensional;

import java.util.Arrays;

public class Spiral {

	public static void main(String[] args) {
		int a[][]= {{10,20,30,40,50},
				{70,60,80,90,20},
				{10,45,62,67,89},
				{12,34,56,78,64},
				{13,56,78,90,12}};
		System.out.println(Arrays.toString(a));
		int left=0,n=5,rigtht=n-1,top=0,bottom=a.length-1;
		while(left<=rigtht &&top<=bottom)
		{
			for(int i=left;i<=rigtht;i++)
			{
				System.out.print(a[top][i]+" ");
				
			}
			top++;
			System.out.println();
			for(int i=top;i<=bottom;i++)
			{
				System.out.print(a[i][rigtht] +" ");
			}
			rigtht--;
			System.out.println();
			
			for(int i=rigtht;i>=left;i--)
			{
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			System.out.println();
			
			for(int i=bottom;i>=top;i--)
			{
				System.out.print(a[i][left] +" ");
			}
			left++;
			System.out.println();
		}

		
	}
	

}
