package sample09;

 class CharToSring1 {

	public static void main(String[] args)
	{
		char[]ch= {'s','a','n','t'};
		String string=new String(ch);
		System.out.println(string);
		

	}

}

public class CharToSring {

	public static void main(String[] args)
	{
		char[]ch= {'s','a','n','t'};
		String res=ConvertToString(ch);
		System.out.println(res);
		

	}
	public static String ConvertToString(char ch[])
	{
		String res=" ";
		for(int i=0;i<ch.length;i++)
		{
			res+=ch[i];
		}
		return res;
	}
}
