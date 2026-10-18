package Lab3;

public class Order {
    private int id;
    private double price;

    public Order(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public String toString() {
        return "Order ID: " + id + ", Price: " + price;
    }
}
