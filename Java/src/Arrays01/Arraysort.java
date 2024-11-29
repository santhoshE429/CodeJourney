package Arrays01;
import java.util.*;
public class Arraysort {

	public static void main(String[] args) {
		int[] arr= {1,9,5};
		//Arrays.sort(arr);
System.out.println("Before sorting "+ Arrays.toString(arr));
 //bubble sort 

             for(int i=0;i<arr.length-1;i++ ) {
            	 for(int j=0;j<arr.length-1-i;j++) 
            	 {
            		 if(arr[j]>=arr[j+1]) 
            		 {
            			 int temp=arr[j];
            			 arr[j]=arr[j+1];
            			 arr[j+1]=temp;
            		 }
            		 
            	 }
             }
             System.out.println("After sorting "+ Arrays.toString(arr));
	}

}
