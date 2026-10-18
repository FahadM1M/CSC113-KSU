package UML1;

public class MainClass {

	public static void main(String[] args) {
		Student s1 = new Student("A", 777, 4);
		Student s2 = new Student("B", 67, 5);
		Student s3 = new Student("C", 88, 2);
		Student s4 = new Student("D", 111, 5);
		Section sec1 = new Section("CSC113", 20);
		Section sec2 = new Section("CSC111", 20);
		Department dep1 = new Department("CS");

		sec1.addStudent(s1);
		sec1.addStudent(s2);
		sec2.addStudent(s3);
		sec2.addStudent(s4);
		dep1.addSection(sec1);
		dep1.addSection(sec2);

		System.out.println("--- Section Info ---");
		sec1.display();

		System.out.println("--- Department Info ---");
		dep1.display();

		System.out.println("\n--- Testing Other Methods ---");
		
		System.out.println("Students with GPA > 3.0: \n " + sec1.countMoreThan(3.0));
		sec1.maxStudent();
		
		System.out.println("Removing student 67...");
		sec1.removeStudent(67);
		
		System.out.println("Top student in each section: ");
		dep1.printMaxStudentEachSection();

		System.out.println("\n--- Section Info After Removal ---");
		sec1.display();

	}

}
