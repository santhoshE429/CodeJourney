package methods;
import java.util.Scanner;

public class NumberProg {
	
	static Scanner sc=new Scanner(System.in);
	public static boolean isPalindrome(int num)
	{
		int temp=num,rev=0;
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		return rev==temp;
		
	}
	public static int Factorial(int num)
	{
		int fact =1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public static boolean isPrime(int num)
	{
		boolean flag=true;
		if(num==0||num==1)
			flag=false;
		for(int i=2;i<num;)
		{
			if(num%i==0)
				flag=false;
				break;
		}
	
		return flag;
	}
	public static boolean isOddOrEven(int num)
	{
		
		return (num%2==0);
		
	}
	public static int Fibonacci(int Series)

	{
		int n1=0,n2=1,n3=0;
		System.out.print(n1 +" " +n2+ "  ");
		for(int i =1;i<=Series-2;i++)
		{
			n3=n1+n2;
			System.out.print(n3 +" ");
			n1=n2;
			n2=n3;
			
		}
		return 0 ;
	}
	public static boolean Armstrong(int num)
	{
		int temp=num,ans=1,sum=0,count=0;
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
		return sum==temp;
	}
	public static boolean SpyNumber(int num) {
		int sum=0;
		int product=1;
		while(num>0)
		{
			sum+=num%10;
			product*=num%10;
			num/=10;
		
			
		}
		return sum==product;
	}
	public static boolean NeonNumber(int num)
	{
		int sum=0;
		int square=num*num;
		
		while(square>0)
		{
			int lastdigit=square%10;
			sum+=lastdigit;
			square/=10;
		}
		return sum==num; 
	}
	public static void main(String[] args) {
		boolean flag=true;
		do
		{
			
			System.out.println("\t\t\tWelcome To Numbers Program:");
			System.out.println("Select The Program");
			System.out.println("1.Palindrome\n2.Factorial\n3.PrimeNumber\n4.OddOrEven\n5.FibonacciSeries\n6.Armstrong\n7.SpyNumber\n8.NeonNUmber\n9.Exit");
			int Input=sc.nextInt();
			switch(Input)
			{
				case 1:
				{
					System.out.println("\t\t\tTo Check The Given Number Is Palindrome Or Not.....");
					System.out.print("Enter The Number:");
					int num =sc.nextInt();
					if(isPalindrome(num))
					{
						System.out.println(num +" Is Palindrome");
					}
					else
					{
						System.out.println(num +" Is Not a Palindrome");
					}
					
					break;
				}
				case 2:
				{
					System.out.println("\t\t\t To Print Factorial Numbers....");
					System.out.print("Enter The Number:");
					int num =sc.nextInt();
					System.out.println("The Factoial " +num+ "  Is :" +Factorial(num));
					
					break;
				}
				case 3:
				{
					System.out.println("t\t\tTo Check The Given Number Is Prime Or Not..");
					System.out.print("Enter The Number:");
					int num=sc.nextInt();
					if(isPrime(num))
						System.out.println("The number  " +num+ "  Is Prime" );
					else
						System.out.println("The number  " +num+ " Is  Not a Prime" );
						
					break;
				}
				case 4:
				{
					System.out.println("\t\t\tTo Check The Given Number Is Odd Or Even..");
					System.out.print("Enter The Number:");
					int num=sc.nextInt();
					if(isOddOrEven(num))
						System.out.println("The number  " +num+ "  Is   Even" );
					else
						System.out.println("The number  " +num+ " Is Odd" );
					break;
				}
				case 5:
				{
					System.out.println("\tt\t\tTo Prinr The FibonacciSeries..");
					System.out.print("Enter The   Number:");
					int Series =sc.nextInt();
					Fibonacci(Series);
					
					break;
				}
				case 6:
				{
					System.out.println("\t\t\tTo Check The Given Number Is Armstrong Or Not.");
					System.out.print("Enter The Number:");
					int num=sc.nextInt();
					if(Armstrong(num))
						System.out.println("The number  " +num+ "  Is  Armstrong" );
					else
						System.out.println("The number  " +num+ " Is  Not a Armstrong" );
					
					break;
				}
				case 7:
				{
					System.out.println("\t\t\tTo Check The Given Number Is SpyNumber Or Not.");
					System.out.print("Enter The Number:");
					int num=sc.nextInt();
					if(SpyNumber(num))
						System.out.println("The number  " +num+ "  Is SpyNumber" );
					else
						System.out.println("The number  " +num+ " Is  Not a SpyNumber" );
						
				
					
					break;
				}
				case 8:
				{
					System.out.println("\t\t\tTo Check The Given Number Is NeonNumber Or Not.");
					System.out.print("Enter The Number:");
					int num=sc.nextInt();
					if(NeonNumber(num))
						System.out.println("The number  " +num+ "  Is NeonNumber" );
					else
						System.out.println("The number  " +num+ " Is  Not a NeonNumber" );
						
				
					
					break;
				}
				case 9:
				{
					flag=false;
				}
				default:
				{
			
					System.out.print( Input +"Invalid Number is Selected");
				}
			}
			
		
		}while(flag);
		
		System.out.println("\t\t\tThank You For Visiting The Numbers Program....");
		System.out.println("\t\t\tRedircting TO Home Page....");
		
		

	}

}
