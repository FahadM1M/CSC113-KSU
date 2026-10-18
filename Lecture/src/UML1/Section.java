package UML1;

public class Section {
	public String courseName;
	public int size;
	public int nb;
	public Student[] list;

	public Section(String n, int s) {
		courseName = n;
		size = s;
		list = new Student[size];
	}

	public boolean isFull() {
		return nb == size;
	}

	public boolean addStudent(Student s) {
		if (isFull()) {
			System.out.println("The Section is full!");
			return false;
		} else {
			list[nb] = s;
			nb++;
			return true;
		}
	}

	public int search(int id) {

		for (int i = 0; i < nb; i++) {

			if (list[i].id == id)
				return i;

		}
		return -1;
	}

	public void removeStudent(int id) {
		int index = search(id);
		if (index == -1) {
			System.out.println("The student cannot be found.");
		} else{
			list[index] = list[nb - 1];
			nb--;

		}
	}

	public int countMoreThan(double g) {
		int count = 0;

		for (int i = 0; i < nb; i++) {
			if (list[i].gpa > g) {
				count++;
			}
		}
		return count;

	}

	public Student maxStudent() {
		Student max = list[0];
		for (int i = 0; i < nb; i++) {
			if (list[i].gpa > max.gpa) {
				max = list[i];
			}
		}
		System.out.println("Top student info: ");
		max.display();
		return max;
	}

	public void display() {
		System.out.println("Section: " + courseName);
		System.out.println("Size: " + size);
		System.out.println("Number of students: " + nb);
	}
}
