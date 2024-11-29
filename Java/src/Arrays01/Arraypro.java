package Arrays01;
import java.util.Arrays;
public class Arraypro {

	public static void main(String[] args) {
		int[] arr= {1,0,1,2,3,0,4,0};
		int[] movezeros=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				movezeros[k++]=arr[i];
			}}
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					movezeros[k++]=arr[i];
				}
				
			
		}
		System.out.println(Arrays.toString(movezeros));

	}

}
