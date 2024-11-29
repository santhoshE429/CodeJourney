package encapsulation;

public class Mobile {
	
	String mname;
	String ram,storage;
	double price;
	Sim slot;

	public Mobile(String mname,String ram,String storage,double price)
	{
		this.mname=mname;
		this.ram=ram;
		this.storage=storage;
		this.price=price;
		
	}
	
	public void insertedSim(Sim s)
	{
		if(slot==null) 
		{
			slot=s;
			System.out.println("\t\t\t***Sim is added***");
		}
		else {
			
			System.out.println("\t\t\t***Sim is already Exits***");
		}
	}
	public void removeSim()
	{
		if(slot!=null)
		{
			slot=null;
			System.out.println("\t\t\t*** Sim is removed*** ");
		}
		else {
			System.out.println("\t\t\t*** Sim is need to insert***");
		}
	}
	public boolean isSimpresent()
	{
		return slot!=null;
	}
	public void detailOfMobile() 
	{
		System.out.println("Mobile Name is: "+mname);
		System.out.println("Mobile Ram is: "+ram);
		System.out.println("Mobile Strorage is: "+storage);
		System.out.println("Mobile Price is: "+price);
		System.out.println("Sim Exits: "+(isSimpresent()?"yes":"no"));
		System.out.println("****************************************");
	}
}
