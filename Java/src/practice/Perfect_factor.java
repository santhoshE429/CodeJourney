package practice;

public class Perfect_factor {

	public static void factor()
	{
		int num=10;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args)
	{
		factor();

	}

}
