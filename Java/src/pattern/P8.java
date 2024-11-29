package pattern;

public class P8 {

	public static void main(String[] args) {
		int n=5;
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j>=n-1)
				{
					System.out.print(k++ +" ");
				}
				else
				{
					System.out.print("  ");
				}
					
			}
			k=1;
			System.out.println();
		}

	}

}
