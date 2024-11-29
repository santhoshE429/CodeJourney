package pattern;

public class P17 {

	public static void main(String[] args) {
		int n=5;
		int k=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print((n-1)-(i-j) +" ");
			}
			System.out.println();
		}
		

	}

}
