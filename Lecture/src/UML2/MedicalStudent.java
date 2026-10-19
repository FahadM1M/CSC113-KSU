package UML2;

public class MedicalStudent extends Student {

	private int labHours;

	public MedicalStudent() {
		super();
		labHours = 0;
	}

	public MedicalStudent(String n, int i, double g, int lab) {
		super(n , i , g);
		labHours = lab;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Lab hours: " + labHours);
		
	}

}