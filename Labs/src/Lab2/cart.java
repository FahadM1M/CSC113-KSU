package Lab2;

public class cart {
    private product[] productList;
    private int numOfProducts;

    public cart(int size) {
        productList = new product[size];
        numOfProducts = 0; 
    }

    public void addProduct(product p) {
        if (numOfProducts < productList.length) {
            productList[numOfProducts] = p;
            numOfProducts++;
        }
    }

    public double generateBill() {
        double total = 0;
        for (int i = 0; i < numOfProducts; i++) {
            total += productList[i].getPrice();
        }
        return total;
    }
}