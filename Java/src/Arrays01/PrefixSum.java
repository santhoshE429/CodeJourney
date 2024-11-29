package Arrays01;

public class PrefixSum {

	public static void main(String[] args) {
		int a[]= {1,-2,6,-1,3};
		int pre[]=new int [a.length];
		pre[0]=a[0];
		for(int i=1;i<a.length;i++)
		{
			pre[i]=pre[i-1]+a[i];
		}
		int max=Integer.MIN_VALUE;
		for(int i=0;i<pre.length;i++)
		{
			int cs=0;
			for(int j=i;j<a.length;j++)
			{
				 cs=(i==0)?pre[j]:pre[j]-pre[i-1];
			}
			if(cs>max)
			{
				max=cs;
				
			}
		}
		System.out.println(max);

	}

}
