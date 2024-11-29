package multiDemensional;

public class CopyEle {
	public static int[][] solve(int [][]a)
	{
		int res[][]=new int[a.length][];
		for(int i=0;i<a.length;i++)
		{
			res[i]=new int[a[i].length];
			for(int j=a[i].length-1,m=0;j>=0;j--,m++)
			{
				res[i][m]=a[i][j];
			}
		}
		
		return res;
	}

	public static void main(String[] args)
	{
		int a[][]= {{1,3,3,4,5},
					{3,5,6,8,7},
					{2,8,9,7}};
		int [][]res=solve(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*********************");
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				System.out.print(res[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		
	}

}
