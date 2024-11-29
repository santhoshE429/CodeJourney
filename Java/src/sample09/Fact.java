package sample09;
 class Strong {

	public static void main(String[] args) {
		int sum=0;
		int num=154;
		int temp=num;
		while(num>0)
		{
			int last=0;
			last=num%10;
			int fact=1;
			for(int i=1;i<=last;i++)
			{
				fact=fact*i;
			}
			sum+=fact;
			num=num/10;
		}
	String str=(sum==temp)?"Strong number":"not a strong number";
		System.out.println(str);
		

	}

}
public class Fact{
	
}