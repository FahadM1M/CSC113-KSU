package Lab2;

public class product {
	private int productID;
	private String name;
	private double price;
	

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public product(int productID, String name, double price) {
		
		this.productID = productID;
		this.name = name;
		this.price = price;
		
	}
	
	public String toString() {
		
		return "ProductID: " + productID + "Name: " + name + "Price: ";
		
		
	}
}

