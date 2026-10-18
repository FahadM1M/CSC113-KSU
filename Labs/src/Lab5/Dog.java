package Lab5;

public class Dog extends Pet {
    private double height;
    private double weight;

    public Dog(String N, String ON, int A, double h, double w) {
        super(N, ON, A);
        this.height = h;
        this.weight = w;
    }

    public void display() {
        System.out.println(toString() + ", Height: " + height + ", Weight: " + weight);
    }

    public double feedingAmt() {
        return weight * 100.0;
    }
}