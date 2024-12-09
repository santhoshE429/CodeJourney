package ExcetionHandling;
import java.util.*;
class HaveAPatientException extends Exception{
	public HaveAPatientException() {
		super("you are not eligible to marry");
	}
	
}
class OutOfServiceException extends Exception{
	public OutOfServiceException() {
		super("Better luck next life");
	}
}

public class Matrimony{
	

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Welcome to Matrimony");
			System.out.print("Enter Your Age:");
			int age=sc.nextInt();
			if(age<21) {
				try {
					throw new HaveAPatientException();
				} catch (HaveAPatientException e) {
					System.out.println(e);
					
				}
				
			}
			else if(age>60)
			{ 
				try {
					throw new OutOfServiceException();
				} catch (OutOfServiceException e) {
					System.out.println(e);
				}
			}
			else
			{
				System.out.println("Congrats");
			}
		}

	}

}
