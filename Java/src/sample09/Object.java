package sample09;



public class Object
{

	public static void main(String[] args) 
	{
		StringBuffer sb1,sb2;
		sb1=new StringBuffer("Hello");
		sb2=sb1;
		System.out.println(sb1);
		sb1.append("World");
		System.out.println(sb2);
		System.out.println(sb1);
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
		/*
		sb1=new String("Hello");
		sb2= new String("Hello");
		System.out.println(sb1);
		
		System.out.println(sb2);
		System.out.println(sb1);
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		
		
		*/

		
	}

	
	

}

