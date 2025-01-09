package practice;

public class PrimeNum {

	public static void primeNum() {
		int num=1;
		boolean flag=true;
		if(num==0||num==1)
		{
			flag=false;
		}
		else {
			for(int i=2;i<num;i++)
			{
				if(num%2==0)
				{
					flag=false;
					break;
				}
			}
		}
		if(flag)
		{
			System.out.println("given number is prime");
		}
		else {
			System.out.println("Not a prime");
		}
	}
	public static void main(String[] args) {
		primeNum();

	}

}
