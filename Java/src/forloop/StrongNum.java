package forloop;

public class StrongNum {

	public static void main(String[] args) {
		int num=145;
		int temp=num;
		int fact=1;
		int sum=0;
		while(num>0)
		{
			int last=num%10;
			
			for(int i=last;i>=2;i--)
			{
				fact*=i;
			}
			sum+=fact;
			num/=10;
			fact=1;
		}
		String res=(sum==temp)?"Given number is Strong Number":"Not a Strong Number";
		
		System.out.println(res);

	}

}
