package UML3;

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
	
	public Section(Section s) {
		courseName = s.courseName;
		size = s.size;
		list = new Student[s.size];
		
		for(int i = 0; i < s.nb ; i++) {
			addStudent(s.list[i]);
		}
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
		System.out.println(" Top student info: ");
		max.display();
		return max;
	}
	
	public Student secondMaxStudent() {
		Student max = list[0];
		for(int i = 0; i < nb; i++) {
			if(list[i].gpa > max.gpa) {
				max = list[i];
				
			}
		}
		Student secMax = list[0];
		
		if(secMax == max) {
			secMax = list[1];
		}
			
			for(int i = 0; i < nb ; i++) {
				if( list[i] != max && list[i].gpa  > secMax.gpa) {
					secMax = list[i];
				}
			}
			System.out.println("Second best student info: ");
			secMax.display();
			return secMax;
		}
	
	public double avgSection() {
		double sum = 0;
		
		for(int i = 0; i < nb; i++) {
			sum += list[i].gpa;
		}
		return sum/nb;
	}
	public void displayInReverse() {
		for(int i = nb -1; i >= 0 ; i--) {
			list[i].display();
		}
	}
	
	public int addStudents(Student[] list2) {
		int count = 0;
		for(int i =0 ; i< list2.length ; i++) {
			if(addStudent(list2[i])) {
				count++;
			}else {
				break;
			}
		}
		return count;
	}

	public void display() {
		System.out.println("Section: " + courseName);
		System.out.println("Size: " + size);
		System.out.println("Number of students: " + nb);
	}
	
	
	public double avgMedStudent() {
		double sum = 0;
		int count = 0;
		for(int i = 0; i < nb ; i++) {
			if( list[i] instanceof MedicalStudent) {
				MedicalStudent m = (MedicalStudent) list[i];
				count++;
				sum += m.gpa; 
			}
		}
		if(count == 0 ) 
			return 0;
		return sum/count;
	}
	public MedicalStudent maxMedWithGPA() {
	 MedicalStudent max = new MedicalStudent("noName", 1,-1,1);
	 for(int i = 0; i < nb ; i++) {
		 if(list[i] instanceof MedicalStudent) {
			 MedicalStudent m = (MedicalStudent) list[i];
			 if(max.gpa < m.gpa) {
				 max = m;
			 }
		 }
	 }return max;
	 
	}
	
	public MedicalStudent maxMedWithLab() {
		MedicalStudent max = new MedicalStudent("noName", 0 , 0 , -1);
		for( int i = 0 ; i < nb ; i++) {
			if(list[i] instanceof MedicalStudent) {
				MedicalStudent m = (MedicalStudent) list[i];
				if(max.getLabHours() < m.getLabHours()) {
					max = m;
				}
			}
		}return max;
		
	}
	
	public int countMedicalGrad() {
		int count = 0;
		for(int i = 0; i < nb; i++) {
			if(list[i] instanceof MedicalStudent) {
				MedicalStudent m = (MedicalStudent) list[i];
				if(m.canGraduate()) {
					count++;
				}
			}
		}return count;
		
	}
	
	public void splitAbove3Point5(Student list1[], Student list2[]){
		int above = 0;
		int below = 0;
		for(int i = 0; i < nb ; i++) {
			if(list[i].gpa > 3.5) {
				list1[above] = list[i];
				above++;
			}else {
				list2[below] = list[i];
				below++;
			}
		}
	}
	
	public void splitByMajor(MedicalStudent list1[], ScienceStudent list2[]) {
		int nbMed = 0;
		int nbSci = 0;
		for(int i = 0; i < nb ; i++) {
			if(list[i] instanceof MedicalStudent) {
				list1[nbMed] = (MedicalStudent) list[i];
				nbMed++;
			}if(list[i] instanceof ScienceStudent) {
				list2[nbSci] = (ScienceStudent) list[i];
				nbSci++;
			}
		}
	}
	
	public boolean isLarger(Section sec) {
		return this.nb > sec.nb;
	}
	
	public Student maxBetween(Section sec) {
		if(this.maxStudent().gpa > sec.maxStudent().gpa) {
			return this.maxStudent();
		}else {
			return sec.maxStudent();
		}
	}
	
	
}
