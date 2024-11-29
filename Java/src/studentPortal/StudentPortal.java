package studentPortal;
import java.util.*;
public class StudentPortal {
	
	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		boolean flag= true;
		do {
			System.out.println("\t\t\tWelcome To Student Portal");
			System.out.println("Select The Feature:");
			System.out.println("1.Sign Up \n2.Login\n3.FogottenCredential\n4.Exit");
			int input=sc.nextInt();
			switch(input)
			{
				case 1:	
				{
					Credential.create_Sigup();
					break;
				}
				case 2:
				{
					Credential.login();
					break;
				}
				case 3:
				{
					Credential.Forgottencredential();
					break;
				}
				case 4:
				{	
					flag=false;
					break;
				}	
				default :
				{
					System.err.println("\t\t\tInvalid  Feature is Selected  ");
				}
			}
			
		} while (flag);
		Thread.sleep(3000);
		System.out.println("\t\t\t  Thank you For Using Application");

	}

}
