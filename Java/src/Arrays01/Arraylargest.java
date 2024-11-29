package Arrays01;



import java.util.Arrays;

public class Arraylargest {

	public static void main(String[] args) {
		 int[] arr= {1,2,3,4,5,6,7,8,55,46,99,23,1234};
//		 Arrays.sort(arr);
//		 System.out.println(arr[arr.length-3]);
		int nthlargest=0;
		 for(int k=0;k<4;k++) {
		int largest=arr[0];	 
			 
for(int i=0;i<arr.length;i++) {
		if(arr[i]<=largest && arr[i]!=1000 ) {
			largest=arr[i];
			nthlargest=largest;
			
	}

}
for(int i=0;i<arr.length;i++) {
	if(arr[i]==largest) {
		arr[i]=1000;
	}
}

		 }
		 System.out.println(nthlargest);
	}

}
