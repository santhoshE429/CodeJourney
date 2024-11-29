package has_a_rel;

import java.util.*;

public class Student {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		Department d1=new Department("CSE", 01, "Sukkrivan");	
		Department d2=new Department("IT", 02, "Sharmila");	
		
		Department[]d= {d1,d2};
		
		Teacher t1=new Teacher("Pavai","CD");
		Teacher t2=new Teacher("Narayanan","IP");
		
		Teacher[]t= {t1,t2};
		College c=new College("APCE", "Ranipet",978011613l,d,t);
		
		boolean my_feature=true;
		do {
			System.out.println("Select the feature");
			System.out.println("1.DetailsOfCollege\n2.DetailOfDepartment\n3.DetailOfTeacher\n4.noOfDepartment\n5/Exit");
			int input=sc.nextInt();
			switch (input) 
			{
				case 1:
				{
					c.detailOfCollege();
					break;
				}
				case 2:
				{
					for (int i= 0; i < d.length; i++) 
					{
						d[i].detailsOfDepartment();
					}
					break;
				}
				case 3:
				{
					for (int i = 0; i < t.length; i++) 
					{
						t[i].detailOfTeacher();
					}
					break;
				}
				case 4:
				{
					int res=c.noOfDepartments();
					System.out.println(res);
				
					break;
				}
				case 5:
				{
					my_feature=false;
					break;
				}
				default:
				throw new IllegalArgumentException("Unexpected value: " + input);
			}
			
		} while (my_feature);
		System.out.println("\t\t\t****Thank you visiting*****");
		
		
	}

}
