package ExcetionHandling;

import java.io.FileNotFoundException;

public class CheckedPropagation {

	public static void main(String[] args) {
		System.out.println("Planned Start");
		try {
			m1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static void m1()throws Exception
	{
		System.out.println("Hello");
		m2();
		
	}
	public static void m2()throws Exception {
		System.out.println("Hi");
		throw new FileNotFoundException("This is Santhosh");
	}
}
