package array;
import java.util.*;

public class LinearSearch {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[]a= {2,5,7,4,9,1,8};
		String res="Not Present";
		System.out.println(Arrays.toString(a));
		System.out.print("Enter The Key Element:");
		int key=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				res="Present";
				break;
				
			}
		}
		System.out.println(res);

	}

}
