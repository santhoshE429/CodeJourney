package oops;

class Rectangle{
	public  void isNameIs() {
		System.out.println("Hi am Rectangle..");
	}
}
 class Square extends Rectangle {
@Override	
	 public  void isNameIs() {
			System.out.println("Hi am Square..");
		}
}
public class Circle extends Rectangle
{
@Override
	public  void isNameIs() {
		System.out.println("Hi am circle..");
	}
	public static void main(String[] args) {
		Rectangle ref =new Circle();
		ref.isNameIs();
	}
}