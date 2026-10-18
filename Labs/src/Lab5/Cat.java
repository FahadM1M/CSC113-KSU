package Lab5;

public class Cat extends Pet {
    private double length;

    public Cat(String n, String ON, int a, double L) {
        super(n, ON, a);
        this.length = L;
    }

    public void display() {
        System.out.println(toString() + ", Length: " + length);
    }

    public double feedingAmt() {
        return 1000.0 + (10.0 * age);
    }
}