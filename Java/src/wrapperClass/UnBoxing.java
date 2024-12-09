package wrapperClass;

public class UnBoxing {

	public static void main(String[] args) {
		int a=19;
		Integer s=Integer.valueOf(a);//boxing
		System.out.println("data Stored as an object:"+s);
		int res=s.intValue();
		System.out.println("Pdt:"+res);
		
	}

}
