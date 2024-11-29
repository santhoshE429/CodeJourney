package string;

public class AAABBAAAC {

	public static void main(String[] args) {
		String s="aaabbaac";
		solve(s);
	}
	public static void solve(String s)
	{
		int count=1;
		String ans="";
		char []a=s.toCharArray();
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
			{
				count ++;
			}
			else {
				ans+=a[i]+"-"+count+"\n";
				count=1;
			}
		}
		System.out.println(ans);
		
	}
}
