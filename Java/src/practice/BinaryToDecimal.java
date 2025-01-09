package practice;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		int sum=0,x=1;
		for(int num=1101;num>0;sum+=num%10*x,num/=10,x*=2)
		{}
		System.out.println(sum);
	}

}
