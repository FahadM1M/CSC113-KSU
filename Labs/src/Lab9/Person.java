package Lab9;

class NegativeNumberException extends Exception {
	public NegativeNumberException(String message) {
		super(message);
	}
}

public class Person {
	private String name;
	private int NID;
	private int age;

	public Person(String n, int nid, int a) throws NegativeNumberException {
		if (a < 0) {
			throw new NegativeNumberException("Age cannot be a negative number.");
		}
		this.name = n;
		this.NID = nid;
		this.age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNID() {
		return NID;
	}

	public void setNID(int NID) {
		this.NID = NID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws NegativeNumberException {
		if (age < 0) {
			throw new NegativeNumberException("Age cannot be a negative number.");
		}
		this.age = age;
	}

	public String toString() {
		return "Name: " + name + ", NID: " + NID + ", Age: " + age;
	}
}