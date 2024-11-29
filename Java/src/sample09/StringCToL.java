package sample09;

public class StringCToL
{
	public static void main(String[] args) 
	{
		String s ="Sant";
		String ans="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				ans+=(char)(s.charAt(i)+32);
				
			}
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
				ans+=(char)(s.charAt(i)-32);
			}
		}
			System.out.println(s);
			System.out.println(ans);
	}
}
