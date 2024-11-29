package string;

public class BalancedPra {

	public static void main(String[] args) {
		String s="[({})]";
		System.out.println(s);
		String res=isStringBalanced(s);
		System.out.println(res);

	}
	public static String isStringBalanced(String s)
	{
		String open="",closed="";
		char[]a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]=='('||a[i]=='{'||a[i]=='[')
				open+=a[i];
			else if (a[i]==')'||a[i]=='}'||a[i]==']')
			{
				closed+=a[i];
			}
		}
		char[]ch1=open.toCharArray();
		char []ch2=closed.toCharArray();
		if(ch1.length!=ch2.length)
			return "Not a Balanced" ;
		for(int i=0,j=ch2.length-1;i<ch1.length;i++,j--)
		{
			if(!(ch1[i]=='['&& ch2[j]==']'||
				ch1[i]=='('&& ch2[j]==')'||
				ch1[i]=='{'&& ch2[j]=='}'))
				return "Not Balanced ";
		}
		return " Balanced";
		
	}

}
