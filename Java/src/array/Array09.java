package array;

public class Array09 {

	public static void main(String[] args) {
		int[]a= {2,4,5,7,9,};
		int sum=0;
			for(int i=0;i<a.length;i++)
			{
				if(i%2==0)
				{
					sum+=a[i];
				}
			}
			System.out.println(sum);
		
	}

}
