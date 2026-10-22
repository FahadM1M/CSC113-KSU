package UML4;

public class Department {
	
	public String depName;
	public Section[] sections;
	int nbSection;
	final int size = 50;

	public Department(String n) {
		depName = n;
		sections = new Section[50];
		nbSection = 0;
		
	}
	
	public boolean addSection(Section s) {
		if(nbSection < size) {
		sections[nbSection] = new Section(s);
		nbSection++ ;
		return true;}else
			
		return false;
		
	}
	
	public void printMaxStudentEachSection() {
		for(int i = 0; i < nbSection; i++) {
			System.out.print("sections[i] name: " + sections[i].courseName);
			sections[i].maxStudent();
			
		}
		
	}
	
	public void display() {
		System.out.println("Department name: " + depName);
		for(int i = 0; i < nbSection; i++) {
			sections[i].display();
		}
		
		
	}
}
