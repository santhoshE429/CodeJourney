package studentPortal;

import java.util.*;

public class Credential {
	 static boolean accountExit=true;
	 static int db_Uid,db_pswd,db_Age;
	 static long db_Contact;

	
	static Scanner sc=new Scanner(System.in);
	
	public static void create_Sigup()throws Exception
	{
	
		if(db_Uid!=0 ||db_pswd!=0)
		{
			System.err.print("\t\t\t Account is Already Created Pls Do Login....");
			
		}
		else
		{
			System.out.print("Enter Ther User Id:");
			db_Uid=sc.nextInt();
			System.out.print("Enter The Password:");
			db_pswd=sc.nextInt();
			System.out.print("Enter The Contact Number");
			db_Contact=sc.nextLong();
			System.out.print("Enter Your Age:");
			db_Age=sc.nextInt();
				
			
			System.out.println("\t\t\tAccount Created Successfull...");
		}
				
	}
	public static void login()throws Exception
	{
		
		if(db_Uid==0 ||db_pswd==0)
		{
			System.err.println("\t\t\t Please Go To Sigup");
			
		}
		else 
		{
			System.out.print("Enter The Your  User Id:");
			int ui_Id=sc.nextInt();
			System.out.print("Enter The  Yoour Password:");
			int pswd=sc.nextInt();
			if (db_Uid==ui_Id && db_pswd==pswd) 
			{
				Thread.sleep(3000);
				System.out.println("\t\t\t Login Successfully........ ");
				String[] args=null;
				HomePage.main(args);
				
				
			}
			else
			{
				System.err.print("\t\t\tInvalid Credential Please After Try SomeTime");
			}
			
		}
		
		
	}
	public static void  Forgottencredential()throws Exception
	{
		System.out.print("Enter valid Cantact Number:");
		long Cno=sc.nextLong();
		if(Cno==db_Contact)
		{
			System.out.print("Enter The Otp:");
			int sys_Otp=(int)(Math.random()*9999+9999);
			Thread.sleep(3000);
			System.out.println(sys_Otp);
			int user_Entered_Otp=sc.nextInt();
			if(sys_Otp==user_Entered_Otp)
			{
				System.out.print("Set New User Id");
				db_Uid=sc.nextInt();
				System.out.print("Set New Password");
				db_pswd=sc.nextInt();
				System.out.print("\t\t\t New User Id and Password created Successfully//////");
			}
			
		}
		else
		{
			System.err.print("\t\t\tInvalid Contact Number pls Enter The valid Contact Number ");
		}
			
		
	}
}

