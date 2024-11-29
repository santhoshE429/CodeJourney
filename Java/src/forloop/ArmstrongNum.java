package forloop;
import java.util.*;

public class ArmstrongNum {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter The number");
		int num=sc.nextInt();
		int temp=num;
		int count=0;
		int sum=0;
		int ans=1;
		while(num>0)
		{
			num/=10;
			count++;
		}
		for(int i=temp;i>0;i/=10)
		{
			int last=i%10;
			for(int j=1;j<=count;j++)
			{
				ans*=last;
			}
			sum+=ans;
			ans=1;
			
		}
		String res=(sum==temp)?"The Given number is Armstrong":"The Given number is not a Armstrong";
		System.out.println(res);

}

}
