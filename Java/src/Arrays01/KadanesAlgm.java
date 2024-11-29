package Arrays01;

public class KadanesAlgm {

	public static void main(String[] args) {
		int []a= {1,-2,6,-1,3};
		int max=Integer.MIN_VALUE;
		int cs=0;
		for(int i=0;i<a.length;i++)
		{
			cs=cs+a[i];
			if(cs==0)
			{
				cs=0;
			}
			if(cs>max)
			{
				max=cs;
			}
		}
		System.out.println(max);

	}

}
