package Basics;

public class A1 {
	private String name;
	private long contact;
	private long aadhar_no;
		
	A1()
	{}
	public A1(String name,long contact,long aadhar_no)
	{
		this.name=name;
		this.contact=contact;
		this.aadhar_no=aadhar_no;
	}
	public String getname()
	{
		return name;
		
	}
	public long getcontact()
	{
		return contact;
		
	}
	public long getaadhar_no()
	{
		return aadhar_no;
		
	}

	public static void main(String[] args) {
		
		A1 r1=new A1("santhosh",9786099,1234);
		System.out.println(r1.getname());

	}

}
