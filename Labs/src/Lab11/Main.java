package Lab11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.EOFException;

public class Main {
	public static void main(String[] args) {
		Chocolate c1 = new Chocolate("Dark", 60);
		Chocolate c2 = new Chocolate("white", 30);
		Chocolate c3 = new Chocolate("Milk", 28);

		try {
			FileOutputStream fos = new FileOutputStream("Chocolates.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.writeObject(c3);

			oos.close();
			fos.close();
		} catch (Exception e) {

		}

		try {
			FileInputStream fis = new FileInputStream("Chocolates.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);

			FileOutputStream fosText = new FileOutputStream("Report.txt");
			PrintWriter pw = new PrintWriter(fosText);

			while (true) {
				try {
					Chocolate c = (Chocolate) ois.readObject();
					if (c.getQuantity() < 40) {
						pw.println(c.getType());
					}
				} catch (EOFException eof) {
					break;
				}
			}

			pw.close();
			fosText.close();
			ois.close();
			fis.close();
		} catch (Exception e) {

		}
	}
}