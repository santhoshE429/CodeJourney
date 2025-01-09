package Arrays01;

import java.util.Arrays;

public class BubbleSort1 {

	public static void main(String[] args) {
		
		int a[]= {3,5,1,6,2};
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++)
		{
			int j=0;
			boolean swapped=false;
			while(j<a.length-1-i)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					swapped=true;
				}
				j++;
			
			}
			if(!swapped)
			{
				break;
			}
		
		}
		System.out.println(Arrays.toString(a));
	}

}
