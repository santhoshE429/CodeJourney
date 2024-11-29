package has_a_rel;

public class Department {

	String dname;
	 int dno;
	 String hod;
	public Department(String dname,int dno,String hod) 
	{
		this.dname=dname;
		this.dno=dno;
		this.hod=hod;
	}
	
	
	public void detailsOfDepartment() 
	{
		System.out.println("Department Name is:"+dname);
		System.out.println("Department Dno is:"+dno);
		System.out.println("Hod Name:"+hod);
		System.out.println("*******************************");
	}

}
