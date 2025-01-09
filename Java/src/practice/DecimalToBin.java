package practice;



public class DecimalToBin {

	public static void main(String[] args) {
		int sum=0,x=1;
		
		for(int num=13;num>0;sum+=num%2*x,num/=2,x*=10)
		{
			
		}
		System.out.println(sum);

	}

}
