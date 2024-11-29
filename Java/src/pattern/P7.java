package pattern;

public class P7 {

	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0,m=5;j<n;j++,m--)
			{
				if(i+j==n-1)
				{
					System.out.print(m +"  ");
				}
	
				else 
				{
					System.out.print(ch++ +"   ");
				}
				
			}
			ch='A';
			System.out.println();
			
		}

	}

}
