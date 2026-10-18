package Lab2;

public class customer {
    public static void main(String[] args) {
        cart myCart = new cart(50);
        
        product p1 = new product(1, "bread", 4.0);
        product p2 = new product(2, "water", 2.0);
        product p3 = new product(3, "granola", 30.0);
        
        myCart.addProduct(p1);
        myCart.addProduct(p2);
        myCart.addProduct(p3);
        
        System.out.println("Total Bill: " + myCart.generateBill());
    }
}