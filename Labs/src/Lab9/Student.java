package Lab9;

public class Student extends Person {
	private int SID;
	private int level;

	public Student(String n, int nid, int a, int sid, int l) throws NegativeNumberException {
		super(n, nid, a);
		this.SID = sid;
		this.level = l;
	}

	public int getSID() {
		return SID;
	}

	public void setSID(int SID) {
		this.SID = SID;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double calculateGPA(String points, int hours) {
		return Double.parseDouble(points) / hours;
	}

	public String toString() {
		return super.toString() + ", SID: " + SID + ", Level: " + level;
	}
}