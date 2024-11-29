package encapsulation;

import java.util.Scanner;


public class User {
	
	static Scanner sc=new Scanner(System.in);
	static Aadhar card1=new Aadhar("Hartik",9786011613l,"cheyyar",9786);
	static Aadhar card2=new Aadhar("Rohit",123l,"chennai",321);
	static Aadhar card3=new Aadhar("Surya",456l,"vadapalani",654);
	static Aadhar card4=new Aadhar("Bumrah",789l,"koyembeddu",987);
	static Aadhar[]app= {card1,card2,card3,card4};
	
	 int person_index;
	

	public  void home()throws Exception
		{
			boolean person_select=true;
			do {
				
				System.out.println("\t\t\t***Welcome To Your Aadhar Portal***");
				System.out.println("Select The Person");
				System.out.println("1.Hartik\n2.Rohit\n3.Surys\n4.Bumrah\n5.Exit");
				int person=sc.nextInt();
				switch(person)
				{
					case 1:
					{
						person_index=0;
						getterSetter();
						break;
					}
					case 2:
					{
						person_index=1;
						getterSetter();
						break;
					}
					case 3:
					{
						person_index=2;
						getterSetter();
						break;
					}
					case 4:
					{
						person_index=3;
						getterSetter();
						break;
					}
					case 5:
					{	
						person_select=false;
						break;
					}
				}
				
			} while (person_select);
			System.out.println("\t\t\tThank You For Visiting The Portal...");
		}
	
	
	public void  getterSetter()throws Exception
	
	{
		boolean info=true;
		do {
			
			System.out.println("\t\t\tSelect The Information.....");
			System.out.println("1.GetInfo\n2.SetInfo\n3.Exit");
			int input=sc.nextInt();
			switch (input)
			{
				case 1:
				{
				
					getter(person_index);
					break;
				}
				case 2:
				{
					setter(person_index);
					break;
				}
				case 3:
				{
					info=false;
					break;
				}
			}
		} while (info);
		System.out.println("<<<<<<Redirecting The Previous page");
		Thread.sleep(3000);
	}
	public void getter(int person_index)throws Exception
	
	{	
		System.out.println("Yor Name is:"+app[person_index].getName());
		System.out.println("Yor Contact is:"+app[person_index].getContact());
		System.out.println("Yor Address is:"+app[person_index].getAddress());
		System.out.println("Yor Aadhar_no is:"+app[person_index].getAadhar());	
	}
	public void setter(int person_index)throws Exception
	{
		boolean modi=true;
		do {
			System.out.println("SelectThe Option:");
			System.out.println("1.Name\n2.Contact\n3.Address\n4.Exit");
			int opt=sc.nextInt();
			switch (opt)
			{
				case 1:
				{
					if(app[person_index].doVerification())
					{
						System.out.print("Enter The Modification Name:");
					
						String userName=sc.next();
						app[person_index].setName(userName);
						System.out.println("\t\t\t****Succesfully Modified Your Name..****");
					}
					else {
						System.out.println("\t\t\tCan't Modified Your  Name....Because You Entered  invlalid Data..");
					
					}
					break;
				}
				case 2:
				{
					if(app[person_index].doVerification())
					{
						System.out.print("Enter The Modification Contact:");
						long userContact=sc.nextLong();
						app[person_index].setContact(userContact);
						System.out.println("\t\t\t****Succesfully Modified Your contact..****");
					}
					else {
						System.out.println("\t\t\tCan't Modified Your  Contact ....Because You Entered  invlalid Data..");
					}
					break;
				}
				case 3:
				{
					if(app[person_index].doVerification())
					{
						System.out.print("Enter The Modification Address:");
						String userAddress=sc.next();
						app[person_index].setAddress(userAddress);
						System.out.println("\t\t\t****Succesfully Modified Your Address..****");
					}
					else {
						System.out.println("\t\t\tCan't Modified Your  Address ....Because You Entered  invlalid Data..");
					}
					break;
				}
				case 4:
				{
					modi=false;
					break;
				}
			}
		} while (modi);
		System.out.println("\t\t\t<<<<<Redirecting The Previeos page ");
		Thread.sleep(3000);
		
	}
	public static void main(String[] args)throws Exception
	{
		User u1=new User();
		u1.home();
		
	}
}
	


