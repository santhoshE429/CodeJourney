package encapsulation;

import java.util.Scanner;

public class Aadhar {

	private String name;
	private long contact;
	private String address;
	private long aadhar;
	private static Scanner sc=new Scanner(System.in);
	static int person_index=0;
	 
	Aadhar()
	{}
	public Aadhar(String name,long contact,String address,long aadhar)
	{
		this.name=name;
		this.contact=contact;
		this.address=address;
		this.aadhar=aadhar;
	}
	public String getName()throws Exception
	{
		return name;
	}
	 public long getContact()throws Exception
	 {
		 return contact;
	 }
	 public String getAddress()throws Exception
	 {
		 return address;
	 }
	 public long  getAadhar()throws Exception
	 {
		 return aadhar;
	 }
	 public void setName(String name)throws Exception
	 
	 {
		 this.name=name;
		
	}
	 public void setContact(long contact)throws Exception
	 {
		 this.contact=contact;
	 }
	 public void setAddress(String address)throws Exception 
	 {
		 this.address=address;
	 }
	 public boolean doVerification()throws Exception {
		 System.out.print("Enter Your Registered Contact:");
		 long userContact=sc.nextLong();
		 if (userContact==contact) 
		 {
			 
			System.out.print("Enter The Otp:");
			Thread.sleep(3000);
			int sysOtp=(int)(Math.random()*9999+9999);
			System.out.println(sysOtp);
			int userOtp=sc.nextInt();
			if(sysOtp==userOtp)
				return true;
			
		}
		 return false;
		 
		
	}
	
}
	

