package array;
import java.util.*;

public class BinarySearch {
		
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int[]b= {1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(b));
		System.out.print("Enter The Key Element:");
		int key=sc.nextInt();
		String res="Not Present";
		int left=0;
		int right=b.length-1;
		
		while(left<=right)
		{
			int m=left+(right-left)/2;
			if(key==b[m])
			{
				res="present";
				break;
			}
			else if(key<b[m])
			{
				right=m-1;
			}
			else if(key>b[m])
			{
				left=m+1;
			}
		}
		System.out.println(res);
	}

}
