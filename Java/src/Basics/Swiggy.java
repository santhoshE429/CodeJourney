package Basics;
import java.util.Scanner;
public class Swiggy {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args)throws Exception
	{
		System.out.println("\t\\t\tWelcome To Swiggy");
		
		System.out.println("Select The Hotel");
		System.out.println("-----------------------------------");
		System.out.println("1.Buhari\n2.A2B\n3.Amma Canteen\n4.Appa Canteen");
		int Hotel=sc.nextInt();
		switch(Hotel)
		{
		
			case 1:
			{
				System.out.println("\t\t\t Greeting From Buhari....");
				System.out.println("Select Your Fav Food");
				System.out.println("1.Mutton Briyani\n2.Chicken Briyani\n3.Chicken-65");
				int Food=sc.nextInt();
				switch(Food)
				{
					case 1:
					{
						System.out.println("Enter The Quantity.......");
						int Qty=sc.nextInt();
						double Price=380;
						double Total_Bill=Qty*Price;
						System.out.println("\t\t\t\tProcessing......");
						Thread.sleep(1000);
						System.out.println("Your Total Bill Amount :"+Total_Bill);
						
						System.out.println("Select The Payment Mode....");
						System.out.println("1.Google-Pay\n2.Phone-Pay");
						int Payment=sc.nextInt();
						if(Payment==1)
						{
							System.out.println("Enter The Total Bill Amount:"+Total_Bill);
							double User_Bill=sc.nextInt();
							if(User_Bill==Total_Bill)
							{
								double res=Math.random()*9999+9999;
								int Sys_Otp=(int)res;
								System.out.println("Please Enter The Otp.... ");
								Thread.sleep(1000);
								System.out.println(Sys_Otp);
								int User_Otp=sc.nextInt();
								if(Sys_Otp==User_Otp)
								{
									System.out.println("Order placed......");
								}
							}
						}
						else if(Payment==2)
						{
							System.out.println("Enter The Total Bill Amount:"+Total_Bill);
							double User_Bill=sc.nextInt();
							if(User_Bill==Total_Bill)
							{
								double res=Math.random()*9999+9999;
								int Sys_Otp=(int)res;
								System.out.println("Please Enter The Otp.... ");
								Thread.sleep(1000);
								System.out.println(Sys_Otp);
								int User_Otp=sc.nextInt();
								if(Sys_Otp==User_Otp)
								{
									System.out.println("Order placed......");
								}
							}
						}
						
						
				
					break;
					}
					case 2:
					{
						System.out.println("Enter The Quantity.......");
						int Qty=sc.nextInt();
						double Price=380;
						double Total_Bill=Qty*Price;
						System.out.println("\t\t\t\tProcessing......");
						Thread.sleep(1000);
						System.out.println("Your Total Bill Amount :"+Total_Bill);
						
						System.out.println("Select The Payment Mode....");
						System.out.println("1.Google-Pay\n2.Phone-Pay");
						int Payment=sc.nextInt();
						if(Payment==1)
						{
							System.out.println("Enter The Total Bill Amount:"+Total_Bill);
							double User_Bill=sc.nextInt();
							if(User_Bill==Total_Bill)
							{
								double res=Math.random()*9999+9999;
								int Sys_Otp=(int)res;
								System.out.println("Please Enter The Otp.... ");
								Thread.sleep(1000);
								System.out.println(Sys_Otp);
								int User_Otp=sc.nextInt();
								if(Sys_Otp==User_Otp)
								{
									System.out.println("Order placed......");
								}
							}
						}
						else if(Payment==1)
						{
							System.out.println("Enter The Total Bill Amount:"+Total_Bill);
							double User_Bill=sc.nextInt();
							if(User_Bill==Total_Bill)
							{
								double res=Math.random()*9999+9999;
								int Sys_Otp=(int)res;
								System.out.println("Please Enter The Otp.... ");
								Thread.sleep(1000);
								System.out.println(Sys_Otp);
								int User_Otp=sc.nextInt();
								if(Sys_Otp==User_Otp)
								{
									System.out.println("Order placed......");
								}
							}
						}
						
						
				
					break;
					}
					case 3:
					{
						System.out.println("Enter The Quantity.......");
						int Qty=sc.nextInt();
						double Price=380;
						double Total_Bill=Qty*Price;
						System.out.println("\t\t\t\tProcessing......");
						Thread.sleep(1000);
						System.out.println("Your Total Bill Amount :"+Total_Bill);
						
						System.out.println("Select The Payment Mode....");
						System.out.println("1.Google-Pay\n2.Phone-Pay");
						int Payment=sc.nextInt();
						if(Payment==1)
						{
							System.out.println("Enter The Total Bill Amount:"+Total_Bill);
							double User_Bill=sc.nextInt();
							if(User_Bill==Total_Bill)
							{
								double res=Math.random()*9999+9999;
								int Sys_Otp=(int)res;
								System.out.println("Please Enter The Otp.... ");
								Thread.sleep(1000);
								System.out.println(Sys_Otp);
								int User_Otp=sc.nextInt();
								if(Sys_Otp==User_Otp)
								{
									System.out.println("Order placed......");
								}
							}
						}
						else if(Payment==2)
						{
							System.out.println("Enter The Total Bill Amount:"+Total_Bill);
							double User_Bill=sc.nextInt();
							if(User_Bill==Total_Bill)
							{
								double res=Math.random()*9999+9999;
								int Sys_Otp=(int)res;
								System.out.println("Please Enter The Otp.... ");
								Thread.sleep(1000);
								System.out.println(Sys_Otp);
								int User_Otp=sc.nextInt();
								if(Sys_Otp==User_Otp)
								{
									System.out.println("Order placed......");
								}
							}
						}
						
				
					break;
					}
				}
			break;
			}
			case 2:
			{
				System.out.println("\t\t\t Greeting From A2B....");
				System.out.println("Select Your Fav Food");
				System.out.println("1.Mutton Briyani\n2.Chicken Briyani\n3.Chicken-65");
				int Food=sc.nextInt();
				switch(Food)
				{
					case 1:
					{
						System.out.println("Enter The Quantity.......");
						int Qty=sc.nextInt();
						double Price=380;
						double Total_Bill=Qty*Price;
						System.out.println("\t\t\t\tProcessing......");
						Thread.sleep(1000);
						System.out.println("Your Total Bill Amount :"+Total_Bill);
						
						System.out.println("Select The Payment Mode....");
						System.out.println("1.Google-Pay\n2.Phone-Pay");
						int Payment=sc.nextInt();
						if(Payment==1)
						{
							System.out.println("Enter The Total Bill Amount:"+Total_Bill);
							double User_Bill=sc.nextInt();
							if(User_Bill==Total_Bill)
							{
								double res=Math.random()*9999+9999;
								int Sys_Otp=(int)res;
								System.out.println("Please Enter The Otp.... ");
								Thread.sleep(1000);
								System.out.println(Sys_Otp);
								int User_Otp=sc.nextInt();
								if(Sys_Otp==User_Otp)
								{
									System.out.println("Order placed......");
								}
							}
						}
						if(Payment==1)
						{
							System.out.println("Enter The Total Bill Amount:"+Total_Bill);
							double User_Bill=sc.nextInt();
							if(User_Bill==Total_Bill)
							{
								double res=Math.random()*9999+9999;
								int Sys_Otp=(int)res;
								System.out.println("Please Enter The Otp.... ");
								Thread.sleep(1000);
								System.out.println(Sys_Otp);
								int User_Otp=sc.nextInt();
								if(Sys_Otp==User_Otp)
								{
									System.out.println("Order placed......");
								}
							}
						}
						
						
				
					break;
					}
				}
			break;
			}
		}

	}

}
