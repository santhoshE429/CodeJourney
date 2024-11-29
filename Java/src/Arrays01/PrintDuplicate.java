package Arrays01;

import java.util.Arrays;

public class PrintDuplicate {

	public static void main(String[] args) {
		int a[]= {2,3,2,4,5,3,2};
		System.out.println(Arrays.toString(a));
		String res =PrintDup(a);
		System.out.println(res);
		
	}
	public static String PrintDup(int []a)
	{
		int count =1;
		String res=" ";
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j]&& a[i]!=Integer.MAX_VALUE)
				{
					count++;
					a[j]=Integer.MAX_VALUE;
					
				}
			}
			if(count>1)
			{
				flag=true;
				res+=a[i]+" ";
			}
		}
		if(flag==false)
		{
			res="No Duplicate";
		}
		return res;
	}

}
