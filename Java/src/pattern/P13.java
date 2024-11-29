package pattern;

public class P13 {

	public static void main(String[] args) {
		int n=5;
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j>=i;j++)
			{
				System.out.print(++k +" ");
			}
			System.out.println();
		}
		

	}

}
