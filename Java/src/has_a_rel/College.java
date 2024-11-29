package has_a_rel;

public class College {
	String cname;
	String loc;
	long contact;
	Department []departments;
	Teacher [] teachers;

	public College(String cname,String loc,long contact,Department[] departments,Teacher[]teachers) 
	{
		this.cname=cname;
		this.loc=loc;
		this.contact=contact;
		this.departments=departments;
		this.teachers=teachers;
	}
	public int  noOfDepartments() 
	{
		return departments.length;
	}
	public void detailOfCollege() 
	{
		System.out.println("College Name is:"+cname);
		System.out.println("College loc is:"+loc);
		System.out.println("College contact is:"+contact);
		System.out.println("*******************************");
	
	}

}
