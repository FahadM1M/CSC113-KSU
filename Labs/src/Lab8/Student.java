package Lab8;

import java.util.Scanner;

public class Student extends Person {
	private int SID;
	private int level;

	public Student(String n, int nid, int a, int sid, int l) {
		super(n, nid, a);
		SID = sid;
		level = l;
	}

	public int getSID() {
		return SID;
	}

	public int getLevel() {
		return level;
	}

	public String toString() {
		return super.toString() + ", Student ID: " + SID + ", Level: " + level;
	}

	public double calculateGPA(String points, int hours) {
		double p = 0;
		Scanner reader = new Scanner(System.in);

		while (true) {
			try {
				p = Double.parseDouble(points);
				break;
			} catch (NumberFormatException e) {
				System.out.print("\nError: Incorrect points input.\nPlease enter the number of passed points: ");
				points = reader.next();
			}
		}

		return p / hours;
	}
}