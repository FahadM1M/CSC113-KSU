package Lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions_I_Monday {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Person[] pList = new Person[3];

		for (int i = 0; i < 2; i++) {
			System.out.println("Please enter student number " + (i + 1) + " information:_");

			System.out.println("Name: ");
			String n = reader.next();

			System.out.println("National ID: ");
			int nid = reader.nextInt();

			int a = 0;
			while (true) {
				try {
					System.out.println("Age: ");
					a = reader.nextInt();
					break;
				} catch (InputMismatchException e) {
					System.out.println("Error: Incorrect age value. Please enter an integer.");
					reader.next(); // Clear invalid input
				}
			}

			System.out.println("Student ID: ");
			int sid = reader.nextInt();

			System.out.println("Level: ");
			int l = reader.nextInt();

			pList[i] = new Student(n, nid, a, sid, l);
		}

		for (int i = 0; i < 2; i++) {
			System.out.print(pList[i].toString());
			System.out.println(", GPA: " + ((Student) pList[i]).calculateGPA("90k", 20));
		}
	}
}