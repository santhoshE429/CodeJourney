package array;

import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
		int[]a= {2,3,45,67,77};
		int []b= {5,6,78,89,7};
		int[]res=new int[a.length+b.length];
		for(int i=0,m=0,n=b.length-1;i<res.length;i++)
		{
			if(m<a.length)
			{
				res[i]=a[m++];
				
			}
			else if(n>=0)
			{
				res[i]=b[n--];
				
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
