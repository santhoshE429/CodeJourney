package wrapperClass;

public class CharToChar {

	public static void main(String[] args) {
		char ch='s';
		System.out.println("Before wrapping class :"+ch);
		Character result=Character.valueOf(ch);
		System.out.println("After Wrapping class: "+result);
	}

}
