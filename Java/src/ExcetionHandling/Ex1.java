package ExcetionHandling;

public class Ex1 {

	public static void main(String[] args) {
		int[]a= {1,3,4,4};
		System.out.println("Planned Start");
		try {
			System.out.println(a[10]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array inedx is not valid");
			// TODO: handle exception
		}
		catch (Exception e) {
			System.out.println("divide by zero is not possible");
		}
		
		System.out.println("Planned Stop");
		
		

	}

}
