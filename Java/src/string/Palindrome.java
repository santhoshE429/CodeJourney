package string;



public class Palindrome {

	public static void main(String[] args) {
			
	boolean p=isPalindrome("Madam");
	String res=(p)?"Given String is Palindrome":"Given String is  not a Palindrome";
	System.out.println(res);

	}
	public static boolean isPalindrome(String s)
	{
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		if(s.equalsIgnoreCase(rev))
		{
			return true;
		}
		else {
			return false;
		}
	}

}
