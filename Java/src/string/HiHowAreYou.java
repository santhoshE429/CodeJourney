package string;

public class HiHowAreYou {

	public static void main(String[] args) {
		String s="Hi how are you? ";
		String[]a=s.split(" ");
		String ans ="";
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
			{
				ans+=a[i]+" ";
			}
			else {
				ans+=reverse(a[i])+" ";
			}
		}
		System.out.println(ans);
		

	}
	public static String reverse(String s)
	{
		String ans="";
		for(int i=s.length()-1;i>=0;i--)
		{
			ans+=s.charAt(i);
		}
		return ans;
	}

}
