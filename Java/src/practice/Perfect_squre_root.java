package practice;

public class Perfect_squre_root {

	public static void perfectSquareRoot() {
		int num=78;
		boolean flag=false;
		for(int i=0;i<num;i++)
		{
			if(i*i==num)
			{
				flag=true;
			}
			
		}
		if(flag)
		{
			System.out.println("The given number is perfect square root number");
		}
		else
			System.out.println("The given number is not a perfect square root number");
	}
	public static void main(String[] args) {
		
		perfectSquareRoot();
	}

}
