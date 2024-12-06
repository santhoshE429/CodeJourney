package ExcetionHandling;

public class UncheckedPropagation {

	public static void main(String[] args) {

		System.out.println("planned Start");
		System.out.println(1);
		try {
			m1();
		} catch (Exception e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
//			System.out.println("hello");
		}
	}

	public static void m1() {
		System.out.println("2");
		m2();
		System.out.println("3");
	}

	public static void m2() 
	{
	System.out.println(4);
	System.out.println(4/0);
	System.out.println(5);
	}
}
