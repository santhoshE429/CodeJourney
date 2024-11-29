package array;
import java.util.*;
public class Array10 {

	public static void main(String[] args) {
		int[]a= {10,4,56,7,8};
		int[]b=new int[a.length];
		System.out.println(Arrays.toString(a));
		for(int i=0,m=a.length-1;i<b.length;i++,m--)
		{
			b[i]=a[m];
		}
		System.out.println(Arrays.toString(b));
	}

}
