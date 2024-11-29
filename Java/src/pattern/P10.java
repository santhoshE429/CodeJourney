package pattern;

public class P10 {

	public static void main(String[] args) {
		int n=5;
		int m=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=j)
				{
					System.out.print(j +" ");
				}
				else
				{
					System.out.print("  " );
				}
			}
			System.out.println();
		}

	}

}
