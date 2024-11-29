package string;

public class Conversion {

	public static void main(String[] args) {

		char []a= {'a','b','c','d','e'};
		//char to String  Approach -1
		String res=charToString(a);		System.out.println(res);
		//char to String  Approach -1
		String res1=charToStringApproach2(a);
		System.out.println(res1);
		// String to char  Approach -1
		char []res3=stringtochar(res1);
		System.out.println(res3);
		// String to char  Approach -1
		char []res4=stringtoCharApproach2(res);
		System.out.println(res4);
		//String to int 
		String b="10";
		int res5=stringToint(b);
		System.out.println(res5);
		

	}
	//char to String  Approach -1
	public static String charToString(char[] a)
	{
		String s=new String(a);
		return s;
	}
	//char to String  Approach -1
	public static String charToStringApproach2(char []a)
	{
		String rev="";
		for(int i=0;i<a.length;i++)
		{
			rev+=a[i];
		}
		return rev;
	}
	// String to char  Approach -1
	public static char[] stringtochar(String s)
	{
		char[] ch=new char [s.length()];
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		return ch;
	}
	// String to char  Approach -1
	public static char[] stringtoCharApproach2(String s)
	{
		 char ch[]=s.toCharArray();
		 return ch; 
	}
	// String to int 
	public static int stringToint(String s)
	{
		int res1=Integer.parseInt(s);
		return res1;
	}
	
}
