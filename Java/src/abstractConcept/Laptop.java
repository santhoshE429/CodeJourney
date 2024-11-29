package abstractConcept;

abstract class Keyboard{
	int price;
	Keyboard(int price)
	{
		this.price=price;
	}
	abstract public void enter();
	public void Qpress()
	{
		System.out.println("Q is selected..........");
	}
	public static void jpress()
	{
		System.out.println("J is pressed...............");
	}
}
class Image extends Keyboard{
	Image(){
		super(300);
	}
	@Override
	public void enter() {
		System.out.println("Image is selected............");
	}
	
}
class NotePad extends Keyboard
{
	public NotePad() {
		super(500);
	}
	
	public void enter() {
		System.out.println("NextLine is Selected.......");
	}
}
public class Laptop {

	public static void main(String[] args) {
		Keyboard k1=new Image();
		Keyboard k2=new NotePad();
		k1.enter();
		k1.Qpress();
		k2.enter();
		k2.jpress();

		
	}

}
