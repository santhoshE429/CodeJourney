package Arrays01;
import java.util.*;
public class Array01 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// static way

		//int[] b;
		//b= {1,2,3,4,5};
		// dynamic way
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[] ref=new int[size];
		
		for(int i=0;i<ref.length;i++) {
			System.out.print("enter the "+i+"   element  : ");
			ref[i]=sc.nextInt();
		}
		//System.out.println(Arrays.toString(ref));
		for(int i=0;i<ref.length;i++) {
			System.out.print(ref[i]+"  ");
		}
		
	}

}
