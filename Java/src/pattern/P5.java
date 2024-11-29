package pattern;

public class P5 {

	public static void main(String[] args) {
		int n=5;
		
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0, m=5;j<n;j++,m--)
			{
				if(i==j)
				{
					System.out.print(ch++ +" ");
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
