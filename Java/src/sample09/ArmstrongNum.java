package sample09;

public class ArmstrongNum {

	public static void main(String[] args) {
		int num=153;
		int t1=num;
		int t2=num;
		int count=0,sum=0,last=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		while(t1>0)
		{
			last=t1%10;
			sum+=Math.pow(last,count);
			t1=t1/10;
		}
		String str1=(t2==sum)?"The given number is Armstrong":"The given Number is not a Armstrong";
		System.out.println(str1);

	}

}
