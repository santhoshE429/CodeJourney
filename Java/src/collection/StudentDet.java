package collection;
import java.util.*;

class Students{
	
	int id;
	double marks;
	String name;
	public Students(int id, double marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	
}
public class StudentDet {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Students(1,34,"Dinga"));
		ls.add(new Students(2,99,"Dingi"));
		ls.add(new Students(3,45,"Sangi"));
		ls.add(new Students(4,22,"Santhiya"));
		ls.add(new Students(5,42,"Santhi"));
		ls.add(new Students(6,12,"Sangavi"));
		
		for (int i = 0; i <ls.size(); i++) {
			Object o=ls.get(i);
			
			Students s=(Students)o;
			if(s.marks>=35) {
				System.out.println("Passed Student Name is:"+s.name);
			}
			
		}
		

	}

}
