package Arrays01;

public class Arraydup {

	public static void main(String[] args) {
		int[] arr= {1,2,1,1,3,4,4,4,5,6,7,4,4,8};
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j] )
				{
					count++;
					arr[j]=-1;
					
				}
			}
			if(count>1 && arr[i]!=-1 )
			{
				System.out.println(arr[i]+"  "+count);
			}
		}

	}

}
