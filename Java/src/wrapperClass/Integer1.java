package wrapperClass;

public class Integer1 extends Object {
	int a;
	public Integer1(int a) {
		this.a=a;
		
	}
	//boxing
	public static Integer valInteger(int a) {
		return new Integer(a);
	}
	//unboxing
	public int intValue() {
		return a;
		
	}
	public String toString() {
		return  " "+a; 
	}

	public static void main(String[] args) {
		int a=90;
		//boxing
		Integer ref=Integer.valueOf(a);
		System.out.println(ref);
		//unboxing
		int res=ref.intValue();
		System.out.println(res);
		Integer1 ref1=new Integer1(a);
		System.out.println(ref.toString());
		
		

	}

}
