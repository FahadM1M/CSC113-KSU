package Recursion;

public class main {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};

		System.out.println("--- Inverse Order ---");
		printArrayInverse(a, 0 , a.length -1);
		
		System.out.println("--- Normal Order ---");
		printArray(a, 0 , a.length -1);

		System.out.println("--- Sum Array ---");
		System.out.println(sumArray(a, 0 , a.length -1));
	}
	
	
	private static void printArrayInverse(int[] a, int start, int end) {
		if(start <= end) {
			printArrayInverse(a, start + 1, end);
			System.out.println(a[start]);
		}
	}
	public static void printArray(int a[], int start, int end) {
		if(start <= end) {
			System.out.println(a[start]);
			printArray(a, start +1, end);
		}
	}
	
	public static int sumArray(int a[], int start, int end) {
		if(start < end)
			return a[start] + sumArray(a, start + 1, end);
		return a[start];
	}
}