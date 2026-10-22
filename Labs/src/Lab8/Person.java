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

	public String toString() {
		return "Name: " + name + ", National ID: " + NID + ", Age: " + age;
	}
}
