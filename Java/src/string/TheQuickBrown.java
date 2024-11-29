package string;

public class TheQuickBrown {

	public static void main(String[] args) {
		
		String s="The Quick brown fox jumps over the lazy dog";
		s=s.toLowerCase();
		char []a=s.toCharArray();
		
		boolean []letters=new boolean[26];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=' ')
			{
				letters[a[i]-97]=true;
			}
				
		}
		String ans="Pangram";
		for(int i=0;i<letters.length;i++)
		{
			if(!letters[i])
			{
				ans="Not a Pangram";
				break;
			}
		}
		System.out.println(ans);
	}

}
