package Lab10;

import java.io.*;

public class SimpleCalc {
	public static void main(String[] args) {
		try (DataInputStream din = new DataInputStream(new FileInputStream("equations.dat"));
				PrintWriter pw = new PrintWriter(new FileOutputStream("Results"))) {

			while (true) {
				double op1 = din.readDouble();
				char operator = din.readChar();
				double op2 = din.readDouble();

				String result;
				switch (operator) {
				case '+':
					result = String.valueOf(op1 + op2);
					break;
				case '-':
					result = String.valueOf(op1 - op2);
					break;
				case '*':
					result = String.valueOf(op1 * op2);
					break;
				case '/':
					if (op2 == 0)
						result = "Error: division by zero";
					else
						result = String.valueOf(op1 / op2);
					break;
				default:
					result = "Error: invalid operator " + operator;
				}
				pw.println(result);
				System.out.println(result);
			}
		} catch (EOFException e) {
		} catch (FileNotFoundException e) {
			System.out.println("File not found: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("I/O error: " + e.getMessage());
		}
	}
}