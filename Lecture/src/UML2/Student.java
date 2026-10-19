package UML2;

public class Student {

	protected String name;
	protected int id;
	protected double gpa;

	public Student() {
		name = "NoName";
		id = 0;
		gpa = 0;

	}
	public Student(Student s) {
		name = s.name;
		id = s.id;
		gpa = s.gpa;
	}

	public Student(String n, int i, double g) {
		name = n;
		id = i;
		gpa = g;

	}
	

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("GPA: " + gpa);

	}
}
