package oops;

class Downcast {

	int  a=12;
}
class B extends Downcast
{
	int b=14;
}
class C extends B
{
	int c=15;
	public static void main(String[] args) {
		 Downcast ref1=new B();//<-----upcasting
		 System.out.println(ref1.a);
		 B ref2=(B)ref1;
		 System.out.println(ref2.b);
		 B ref3 =new C();
		 C ref4 =(C)ref3;
		 System.out.println(ref4.c);
	}
}
