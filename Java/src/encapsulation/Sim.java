package encapsulation;

public class Sim {
	String operatorName;
	String bandwidth;
	double price;
	
	public Sim(String operatorName,String bandwidth,double price) 
	{
		this.operatorName=operatorName;
		this.bandwidth=bandwidth;
		this.price=price;
		
	}
	public void detailOfSim()
	{
		System.out.println("Sim name;"+operatorName);
		System.out.println("Sim bandwith;"+bandwidth);
		System.out.println("Sim price;"+price);
		System.out.println("************************************");
	}
	
	

}
