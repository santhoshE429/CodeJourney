package array;
import java.util.*;
public class Array06 {

	public static void main(String[] args) {
		
	int[]b= {0,1,1,0,1,0,1,1,0,1,1};
		
	solve(b);
		
		System.out.println(Arrays.toString(b));
		
	}
		public static void solve(int[]a)
		{
			System.out.println(Arrays.toString(a));
			int left=0;
			int right=a.length-1;
			while(left<=right)
			{
				if(a[left]==1&&a[right]==0)
				{
					int temp=a[left];
					a[left]=a[right];
					a[right]=temp;
					left++;
					right--;
				
				}
				if(a[left]==0)
				{
					left++;
				}
				if(a[right]==1)
				{
				
					right--;
				}
			}
		}
		
	}


