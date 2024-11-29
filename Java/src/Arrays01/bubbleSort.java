package Arrays01;
import java.util.Arrays;
public class bubbleSort {

	public static void main(String[] args) {
		int[] a= new int [] {24,2,0,209,6,};
		int temp;
		System.out.println("Before sorting "+ Arrays.toString(a));
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=0;j<a.length;j++)
			 {
				 if(a[j]>a[j+1])
						 {
							 temp=a[j];
							 a[j]=a[j+1];
							 a[j+1]=temp;
						 }
			 }
		 }
		 System.out.println("After sorting "+ Arrays.toString(a));
		}

	}


