package UML4;

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
	
	public ScienceStudent(ScienceStudent s) {
		super(s);
		mathHours = s.mathHours;
	}
	public double graduationGift() {
		return gpa * 1000;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Math hours: " + mathHours);
		
	}
	public void displayShot() {
		System.out.println("SHOTS :" + SHOTS);
	}
	public boolean isImmune() {
		return SHOTS > 2;
	}

}