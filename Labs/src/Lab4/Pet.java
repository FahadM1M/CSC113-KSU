package Lab4;

public class Pet {
    protected String name;
    protected String ownerName;
    protected int age;

    public Pet(String n, String ON, int A) {
        this.name = n;
        this.ownerName = ON;
        this.age = A;
    }

    public String toString() {
        return "Name: " + name + ", Owner Name: " + ownerName + ", Age: " + age;
    }
}