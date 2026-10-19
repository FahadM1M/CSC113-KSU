package UML2;

public class ScienceStudent extends Student {
	
	private int mathHours;

	public ScienceStudent() {
		super();
		mathHours = 0;

	}
	
	public int getMathHours() {
		return mathHours;
	}

	public ScienceStudent(String n, int i, double g, int math) {
		super(n, i , g);
		mathHours = math;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Math hours: " + mathHours);
		
	}

}