package Lab3;
import java.util.Scanner;

public class TestR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Restaurant herfy = new Restaurant("Herfy", 10);

        for (int i = 0; i < 2; i++) {
            System.out.print("Enter Order ID: ");
            int id = input.nextInt();
            
            System.out.print("Enter Order Price: ");
            double price = input.nextDouble();
            
            Order newOrder = new Order(id, price);
            herfy.addOrder(newOrder);
        }

        System.out.println("\n--- Herfy Info ---");
        System.out.println(herfy.toString());
        
    }
}
