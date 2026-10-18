package Lab5;

public abstract class Pet {
    protected String name;
    protected String ownerName;
    protected int age;

    public Pet(String n, String ON, int A) {
        this.name = n;
        this.ownerName = ON;
        this.age = A;
    }

    public final String toString() {
        return "Name: " + name + ", Owner Name: " + ownerName + ", Age: " + age;
    }
    
    public abstract double feedingAmt();
}