package multiDemensional;



public class AddMatrix {
	
	public static int[][] SumOfTwoMatrix(int[][]a,int [][]b)
	{
		int res[][]=new int [a.length][];
		for(int i=0;i<a.length;i++)
		{
			res[i]=new int[a[i].length];
			for(int j=0;j<a[i].length;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
			}
			
		}
		return res;
	}
	public static void main(String[] args)
	{
		int [][]a= {{1,2,3,4,5},
				    {3,6,7,9},
				    {2,7,9,2,9}
				   };
		int[][]b= { {2,6,7,8,8},
				    {3,4,5,7},
				    {4,5,7,8,8}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
		System.out.println("*********************************");
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*********************************");
		int res[][]=SumOfTwoMatrix(a, b);
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
