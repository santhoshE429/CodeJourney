package encapsulation;

public class TrappedWater {

	public static void main(String[] args) {
		int b[]= {4,2,0,6,3,2,5};
		System.out.println("Trapped water level is:"+trappedWaterlevel(b));
	}
	public static int trappedWaterlevel(int []b)
	{
		int []lm=new int[b.length];
		lm[0]=b[0];
		for (int i = 1; i < b.length; i++) 
		{
			lm[i]=Math.max(b[i],lm[i-1]);
			
		}
		int rm[]=new int[b.length];
		rm[rm.length-1]=b[b.length-1];
		for (int i = b.length-2; i >= 0; i--)
		{
			rm[i]=Math.max(b[i],rm[i+1]);
			
		}
		for (int i = 0; i < rm.length; i++) {
			System.out.print(rm[i]);
		}
		for (int i = 0; i < lm.length; i++) {
			System.out.print(lm[i]);
		}
		int sum=0;
		for (int i = 0; i <b.length; i++)
		{
			int res=Math.min(lm[i],rm[i]);
			System.out.println(res);
			sum+=res-b[i];
			
			
		}
		return sum;
	}

}
