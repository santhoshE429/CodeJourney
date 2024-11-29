package sample09;


public class RevString {

	public static void main(String[] args) {
		String s="Hi How Are You?";
		String ans =""; 
		String res[]=s.split(" ");
		//System.out.println(Arrays.toString(res));
		for(int i=res.length-1;i>=0;i--)
		{
			ans+=rev(res[i] +" ");
		}
		System.out.println(ans);
	
	}
	public static String rev(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		return rev;
	}

}
