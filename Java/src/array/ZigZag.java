package array;
import java.util.*;



public class ZigZag {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50,60};
		int []b= {1,2,3,4,5,6};
		int []res=new int[a.length+b.length];
		for(int i=0,m=0,n=0;i<res.length;i++)
		{
			if(i%2==0)
			{
				res[i]=a[m++];
			}
			else {
				res[i]=b[n++];
			}
		}
		System.out.println(Arrays.toString(res));
	}

}
