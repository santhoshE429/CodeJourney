package ExcetionHandling;

class Santhosh extends Exception
{
	static {
		System.out.println("Welcome to vote");
	}
}
public class Ex2 {
	
	public static void main(String[] args) {
		int age =10;
		if(age<18)
		try {
			
			throw new Santhosh();
		} catch (Santhosh e) {
			System.out.println("Hi santhosh ... You are not eligle for vote");
		}

	}

}
