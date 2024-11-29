package has_a_rel;

public class Teacher {
	
	String name;
	String sub;

	public Teacher(String name,String sub) {
		this.name=name;
		this.sub=sub;
		
	}
	public void detailOfTeacher() {
		
		System.out.println("Teacher name:"+name);
		System.out.println("Subject name:"+sub);
		System.out.println("*******************************");
	}

}
