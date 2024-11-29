package Basics;
import java.util.Scanner;

public class Hotel {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		
		boolean  Hotel=true;
		do
		{
			System.out.println("\t\t\tSelect The Hotel");
			System.out.println("\t\t\t1.Buhari\n\t\t\t2.Exit");
			int Input=sc.nextInt();
			switch(Input)
			{
				case 1:
				{
					System.out.println("\t\t\tRedirecting The Hotel Pages");
					Thread.sleep(3000);
					
					boolean Menu=true;
					do
					{
						System.out.println("\t\t\tSelect The Buhari Food");
						System.out.println("\t\t\t1.Mutton-Briyani\n\t\t\t2.Chicken_Briyani\n\t\t\t3.Exit");
						int Food=sc.nextInt();
						switch(Food)
						{
							case 1:
							{
								System.out.println("Mutton-Briyani:380");
								Menu=false;
								break;
							}
							case 2:
							{
								System.out.println("Chicken-Brian:450");
								Menu=false;
								break;
							}
							case 3:
							{
								Menu=false;
								break;
							}
						}
				
			
						
					}while(Menu);
					System.out.println("\t\t\tRedirecting The Home page");
					Thread.sleep(2000);
					break;
				}
				case 2:
				{
					Hotel=false;
					break;
				}
			}
		}while(Hotel);
		
		System.out.println("\t\t\tThank You For Visiting The Hotel");

	}

}
