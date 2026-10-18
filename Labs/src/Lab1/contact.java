package Lab1;

public class contact {
	private String name;
	private int mobileNum;
	private String email;
	private String address;
	int counter = 0;
	
	public contact(String n, int mNum, String e, String a) {
		name = n;
		mobileNum = mNum;
		email = e;
		address = a;
		
		counter++;
		
	}
	
	public void setEmail(String e) {
		email = e;
		
	}
	public int getMobile() {
		return mobileNum;
		
	}
	
	public void display() {
		System.out.println(" Name : " + name + " || " + "Mobile Number: " + mobileNum + " || " + "Email: " + email + " || " + "Address: " + address);
		
	}

}

