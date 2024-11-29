package array;
import java.util.*;

public class Array01 {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		
		System.out.print("Enter The Size:");
		
		int []a=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Enter The " +i+"th element:"  );
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
