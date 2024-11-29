package studentPortal;
import java.util.*;
public class HomePage {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)throws Exception {
		
		boolean flag=true;
		
		do
		{
			System.out.println("\t\t\t>>>>>>>Welcome To HomePage>>>>>>>");
			System.out.println("1.NumberProg\n2.Calculator\n3.Swiggy\n4.Exit");
			int input =sc.nextInt();
			switch (input) 
			{
			
			case 1: 
			{
				
				NumberProg.main(args);
				break;
			}
			case 2: 
			{
				Calculator.main(args);
				break;
			}
			case 3: 
			{
				Swiggy.main(args);
				
				break;
			}case 4: 
			{
				flag=false;
				
				
				break;
			}
			
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + input);
			}
		} while (flag);
		System.out.println("\t\t\t Redirection To Welcome page............");
		Thread.sleep(3000);
		
		
		
	}

}
