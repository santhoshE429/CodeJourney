package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student {
	int id;
	double marks;
	String name;
	public Student(int id, double marks, String name) {
		super();
		this.id = id;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, marks, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}
	
	
}
class Employee{
	int empid;
	double sal;
	String name;
	public Employee(int empid, double sal, String name) {
		super();
		this.empid = empid;
		this.sal = sal;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", sal=" + sal + ", name=" + name + "]";
	}
	
}

public class AL1 {

	public static void main(String[] args) {
		List bag1=new ArrayList();
		bag1.add(new Student(20,99,"Sant"));
		bag1.add(new Student(22,100,"Jp"));
		
		List bag2=new ArrayList();
		bag2.add(new Employee(1, 100000, "Santhosh"));
		bag2.add(new Employee(2, 200000, "Jp"));
		bag2.add(new Employee(22,100,"Jp"));
		System.out.println(bag1);
		System.out.println(bag2);
		System.out.println(bag1.hashCode());
		System.out.println(bag2.hashCode());
		System.out.println(bag1.equals(bag2));
	}

}
