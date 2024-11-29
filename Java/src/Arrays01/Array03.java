package Arrays01;

public class Array03 {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		// Linear search
		//int key=6;
		//for(int i=0;i<arr.length;i++) {
		//	if(arr[i]==key) {
			//	System.out.println(key +"   element present in index "+i);
			//}

		//}
		
		
		// binary search
		int key=5;
		int start=0;
		int end =arr.length-1;
		int mid=(start+end)/2;
		while(start<end)
		{
			if(arr[mid]==key) {
				System.out.println(key+"  element present in the indox of "+ mid);
			break;}
			else if(arr[mid]<key){
				start=mid+1;
				}
			else if(arr[mid]>key) {

			end=mid-1;
			}
			mid=(start+end)/2;
		}

	}

}
