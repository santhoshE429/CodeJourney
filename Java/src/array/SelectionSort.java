package array;
import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[]a= {28,5,4,8,27};
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			int smallest=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[smallest])
				{
					smallest=j;
				}
			}
			int temp=a[i];
			a[i]=a[smallest];
			a[smallest]=temp;
		}
		System.out.println(Arrays.toString(a));

	}

}
