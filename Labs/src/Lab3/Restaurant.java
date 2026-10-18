package Lab3;

public class Restaurant {
    private String name;
    private int numOfOrders;
    private Order[] orderList;

    public Restaurant(String name, int size) {
        this.name = name;
        this.numOfOrders = 0;
        this.orderList = new Order[size];
    }

    public Restaurant(Restaurant r) {
        this.name = r.name;
        this.numOfOrders = r.numOfOrders;
        this.orderList = new Order[r.orderList.length];
        
        for (int i = 0; i < r.numOfOrders; i++) {
            this.orderList[i] = r.orderList[i]; 
        }
    }

    public boolean addOrder(Order o) {
        if (numOfOrders < orderList.length) {
            orderList[numOfOrders] = o;
            numOfOrders++;
            return true;
        }
        return false;
    }

    public String toString() {
        String info = "Restaurant Name: " + name + "\n";
        info += "Total Orders: " + numOfOrders + "\n";
        
        for (int i = 0; i < numOfOrders; i++) {
            info += orderList[i].toString() + "\n";
        }
        
        return info;
    }
}
