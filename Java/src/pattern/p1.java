package pattern;

public class p1 {

	public static void main(String[] args) {
		int n=5;
		 char ch='A';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i%2==0)
				{
					System.out.print(j+1 +" ");
				
				}
				else
				{
					System.out.print(ch++ +" ");
				}
			}System.out.println();
			ch='A';
		}

	}

}
