package Lab8;

public class Person {
	private String name;
	private int NID;
	private int age;

	public Person(String n, int nid, int a) {
		name = n;
		NID = nid;
		age = a;
	}

	public String getName() {
		return name;
	}

	public int getNID() {
		return NID;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "Name: " + name + ", National ID: " + NID + ", Age: " + age;
	}
}