package Lab6;

public class Biotin extends FoodSupplement implements Vitamin {
    public Biotin(int str, int use, int expDate) {
        super(str, use, expDate);
    }

    public double calculateDose(int weight, int num) {
        return (double) (strength * usage * num) / weight;
    }

    public boolean isExpired(int today) {
        return today > expirationDate;
    }

    public void display() {
        super.display();
    }
}