package has_a_rel;

public class Car {
	
	String cname;
	String color;
	double price;
	Engine e=new Engine();
	public Car(String cname,String color,double price) 
	{
		this.cname=cname;
		this.color=color;
		this.price=price;
	}	
	public void detailOfCar()
	{
		System.out.println("Car Name is:"+cname);
		System.out.println("Car Color is:"+color);
		System.out.println("Car Price is:"+cname);
	}
	public static void main(String[] args) {
		
		Car c1=new Car("BMW","Red", 400000);
		Car c2=new Car("Benz","Blue", 500000);
		c1.detailOfCar();
		c1.e.detailOfEngine();
		c2.detailOfCar();
		c2.e.detailOfEngine();
		
		
	}

}
