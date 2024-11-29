package Arrays01;

import java.util.Arrays;

public class Arrayrev {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6};
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+"   ");
//		
//for(int i=0;i<arr.length;i++) {
	//for(int j=i+1;j<arr.length;j++) {
		int i=0;
		int j=arr.length-1;
		while(j>i)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i=i+1;
			j=j-1;
		
		}
		System.out.print(Arrays.toString(arr));
	}
}

