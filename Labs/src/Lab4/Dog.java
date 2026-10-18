package Lab4;

public class Dog extends Pet {
    private double height;
    private double weight;

    public Dog(String N, String ON, int A, double h, double w) {
        super(N, ON, A);
        this.height = h;
        this.weight = w;
    }

    public String toString() {
        return super.toString() + ", Height: " + height + ", Weight: " + weight;
    }

    public double feedingAmt() {
        return weight * 100.0;
    }
}