package interfaceComp;

interface Mobile{
	void call();
	void text();
	int a=10;
}
class Mi implements Mobile{
	public void call() {
		System.out.println("Calling......");
		System.out.println(a);
	}
	public void text() {
		System.out.println("Texting.....");
	}
}
public class EndUser {

	public static void main(String[] args) {
		Mobile m=new Mi();
		m.call();
		m.text();
		System.out.println(m.a);
		

	}

}
