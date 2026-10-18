package UML1;

public class Student {

	String name;
	int id;
	double gpa;

	public Student() {
		name = "NoName";
		id = 0;
		gpa = 0;

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
