package wrapperClass;

public class Parsing {

	public static void main(String[] args) {
		System.out.println("Hi...........");
		String str = "10";
//		String str="sant";
		try {
			int res = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println("Handled..");	
		}
		System.out.println("bye");
//		System.out.println(parseByte(str));

	}
//	public static int parseByte(String s)throws NumberFormatException
//	{
//		return new Integer(s);
//	}
}
