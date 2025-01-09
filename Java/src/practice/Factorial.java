package practice;

public class Factorial {
	
	public static void perfect() {
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println("factorial number of "+num +"is"+fact);
	}
	public static void main(String[] args) {
		perfect();

	}

}
