package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 class EmployeeDetails 
 {
	String ename;
	int  exp;
	public EmployeeDetails(String ename, int exp) {
		super();
		this.ename = ename;
		this.exp = exp;
	}
	@Override
	public String toString() {
		return ename+":"+exp;
	}

}
class SortExp implements Comparator
{
	@Override
	public int compare(Object o1,Object o2 )
	{
		EmployeeDetails e1=(EmployeeDetails)o1;
		EmployeeDetails e2=(EmployeeDetails)o2;
		
		if(e1.exp==e2.exp)
			return 0;
		else if(e1.exp>e2.exp)
			return 1;
		else
			return -1;
	}
}
public class Employees
{
	
	public static void main(String[] args) {
		List tcs=new ArrayList();
		tcs.add(new EmployeeDetails("sant", 1));
		tcs.add(new EmployeeDetails("JP", 3));
		tcs.add(new EmployeeDetails("Ravi", 9));
		tcs.add(new EmployeeDetails("Dhaya", 6));
		tcs.add(new EmployeeDetails("Datchan", 2));
		tcs.add(new EmployeeDetails("Vignesh", 5));
		tcs.add(new EmployeeDetails("Vignesh", 5));
		
		Comparator c=new SortExp();
		
		System.out.println(tcs);
		
	
		Collections.sort(tcs,c);
		System.out.println(tcs);
		
		
	}
	
}
