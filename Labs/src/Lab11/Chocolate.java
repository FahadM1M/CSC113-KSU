package Lab11;

import java.io.Serializable;

public class Chocolate implements Serializable {
	private String type;
	private int quantity;

	public Chocolate(String t, int q) {
		this.type = t;
		this.quantity = q;
	}

	public String getType() {
		return type;
	}

	public int getQuantity() {
		return quantity;
	}
}