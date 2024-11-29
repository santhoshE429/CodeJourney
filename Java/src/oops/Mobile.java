package oops;

class MobileObjGen {

	//states
	String name;
	double price;
	String ram;
	String  color;
	static String owner="Sant";
	//behavior
	public void text()
	{
		System.out.println("Texting");
	}
	public void call() {
		
		System.out.println("Calling");
	}
	
}
public class Mobile
{
	public static void main(String[] args) {
		
		MobileObjGen m1=new MobileObjGen();
		System.out.println(m1.name);
	}
}