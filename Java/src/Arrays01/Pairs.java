package Arrays01;

public class Pairs {

	public static void main(String[] args) {
		int[]a= {8,6,2,10,14};
		pairs(a);
		

	}
	public static void pairs(int []a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				System.out.print(a[i]+"-"+a[j] +" ");
			}
			System.out.println();
		}
	}

}
