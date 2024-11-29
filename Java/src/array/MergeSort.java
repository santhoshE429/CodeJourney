package array;
import java.util.*;

public class MergeSort {

	public static void main(String[] args)
	{
		int []a= {8,5,3,2,1,9};
		int left=0;
		int right=a.length-1;
		System.out.println(Arrays.toString(a));
		

		divide(a,left,right);
		System.out.println(Arrays.toString(a));
	}
	public static void divide(int[]a,int l,int h)
	{
		
		if(l==h)
		{
			return;
		}
		int m=(l+h)/2;
		
		divide(a, l, m);//divide left
		divide(a, m+1, h);// divide right
		Merge(a,l,m,h);
	}
	public static void Merge(int a[],int l,int m,int h)
	{
		int left =l;
		int mid=m;
		int right=h;
		int []b=new int[a.length];
		int x=0;
		
		while(left<=right && m+1<=right)
		{
			if(a[left]<a[right])
			{
				b[x++]=a[left++];
			}
			else 
			{
				b[x++]=a[right++];
			}
		}
		while(a[right]<=a[mid+1])
		{	
			b[x++]=a[right];
			right++;
			
		}
		while(a[mid+1]<=a[right])
		{
			b[x++]=a[left];
			left++;
		}
		for(int i=l,k=0;i<b.length;i++,k++)
		{
			a[i]=b[k];
		}
	}

}
