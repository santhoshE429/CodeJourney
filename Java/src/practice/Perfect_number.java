package practice;

public class Perfect_number {
	
	public static void perfectNum() {
		int num=496;
		int sum=0;
		for (int i = 1; i < num; i++) 
		{
			if(num%i==0)
			{
				sum+=i;
			}
			
		}
		if(sum==num)
		{
			System.out.println("given number is perfect number");
		}
		else
			System.out.println("given number is  not a perfect number");
	}
	public static void main(String[] args) {
		perfectNum();
	}

}
