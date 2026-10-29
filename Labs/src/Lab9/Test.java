package Lab9;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Person[] pList = new Person[3];

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter details for Student " + (i + 1) + ":");
			System.out.print("Name: ");
			String name = input.next();
			System.out.print("NID: ");
			int nid = input.nextInt();
			System.out.print("SID: ");
			int sid = input.nextInt();
			System.out.print("Level: ");
			int level = input.nextInt();

			boolean validAge = false;
			while (!validAge) {
				System.out.print("Age: ");
				int age = input.nextInt();
				try {
					Student s = new Student(name, nid, age, sid, level);
					pList[i] = s;
					validAge = true;
				} catch (NegativeNumberException e) {
					System.out.println(e.getMessage());
				}
			}
		}

		System.out.println("\nStudents Information:");
		for (int i = 0; i < 2; i++) {
			System.out.println(pList[i]);
		}

		input.close();
	}
}