package pattern;

public class P6 {

	public static void main(String[] args) {
		int n=5;
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0, m=5;j<n;j++,m--)
			{
				if(i==j)
				{
					System.out.print(" " +" ");
				}
				
				else
				{
					System.out.print(m +"  ");
				}
				
			}
			System.out.println();
		}
	}

}
