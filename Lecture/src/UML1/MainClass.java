package UML1;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student("A", 777, 4);
		Student s2 = new Student("B", 67, 5);
		Student s3 = new Student("C", 88, 2);
		Section sec1 = new Section("CSC113", 20);
		sec1.addStudent(s1);
		sec1.addStudent(s2);
		sec1.addStudent(s3);

		System.out.println("--- Section Info ---");
		sec1.display();

		System.out.println("\n--- Testing Other Methods ---");
		System.out.println("Students with GPA > 3.0: \n " + sec1.countMoreThan(3.0));
		sec1.maxStudent();
		System.out.println("Removing student 67...");
		sec1.removeStudent(67);

		System.out.println("\n--- Section Info After Removal ---");
		sec1.display();

	}

}
