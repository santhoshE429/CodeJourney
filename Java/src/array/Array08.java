package array;

public class Array08 {

	public static void main(String[] args) {
		int[]a= {2,4,5,3,2,7};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum+=a[i];
			}
		}
		System.out.println(sum);

	}

}
