package string;

public class StringMethods {

	public static void main(String[] args) {
		String s1=" Hello ";
		String s2="Hi";
		String s3=new String("Bye");
		String s4 =" Welcome to Java Program ";
		
		//charAt() Method is used to extract from the string
		System.out.println(s1.charAt(3));
		//toUppercase() is used to convert UpperCase
		System.out.println(s2.toUpperCase());
		//toLowerCase() is used to convert LowerCase
		System.out.println(s3.toLowerCase());
		//trim() is used to remove the space from first and last of the string
		System.out.println(s4.trim());
		//concat() is used to join the two String ,to perform the (+)operation
		System.out.println(s1.concat(s4));
		//contains()is used to check if the given  sequence if char is present or not,it return boolean value
		System.out.println(s3.contains("e"));
		//length() is used to known the length of the string
		System.out.println(s1.length());
		
		

	}

}
