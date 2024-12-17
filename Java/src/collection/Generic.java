package collection;

import java.util.ArrayList;
import java.util.List;

class Student2
{
	int sid;
	String sname;
	public Student2(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "Id-"+sid+":Sname-"+sname;
	}
}
public class Generic {

	public static void main(String[] args) {
		List <Student2> ls=new ArrayList();
		ls.add(new Student2(1,"Sant"));
		ls.add(new Student2(2,"xyz"));
		ls.add(new Student2(3,"Abc"));
		ls.add(null);
		ls.add(1, new Student2(8, "Tabrez"));
		
		System.out.println(ls);
		
		List<Integer>i1=new ArrayList<Integer>();
		i1.add(1);
		i1.add(5);
		i1.add(90);
		System.out.println(i1);

	}

}
