package pattern;

public class P9 {

	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j<=n-1)
				{
					System.out.print(ch++ +" ");
				}
			}
			ch='A';
			System.out.println();
					
		}

	}

}
