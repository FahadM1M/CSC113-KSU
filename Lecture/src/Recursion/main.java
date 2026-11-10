package Recursion;

public class main {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int c[] = {1, 2 , 3, 2, 3,};
		int arr[] = { 1, 2, 4, 3, 5};

		System.out.println("--- Inverse Order ---");
		printArrayInverse(a, 0, a.length - 1);

		System.out.println("--- Normal Order ---");
		printArray(a, 0, a.length - 1);

		System.out.println("--- Sum Array ---");
		System.out.println(sumArray(a, 0, a.length - 1));

		System.out.println("--- Factorial ---");
		System.out.println(" = " + fac(10));

		System.out.println("--- Summation ---");
		System.out.println(" = " + sum(10));

		System.out.println("--- Power ---");
		System.out.println(" = " + power(5, 3));

		System.out.println("--- Search ---");
		System.out.println(search(a, 2, 0, a.length - 1));

		System.out.println("--- Search Counter ---");
		System.out.println(searchCount(c, 2, 0, c.length - 1));

		System.out.println("--- Binary Search ---");
		System.out.println(binarysearch(a, 2, 0, a.length - 1));
		
		System.out.println("--- Sort Check ---");
		System.out.println(sortCheck(arr, 0,arr.length));
		
		System.out.println("--- Searching Max ---");
		System.out.println(searchMax(a, 0,a.length));
	}

	private static void printArrayInverse(int[] a, int start, int end) {
		if (start <= end) {
			printArrayInverse(a, start + 1, end);
			System.out.println(a[start]);
		}
	}

	public static void printArray(int a[], int start, int end) {
		if (start <= end) {
			System.out.println(a[start]);
			printArray(a, start + 1, end);
		}
	}

	public static int sumArray(int a[], int start, int end) {
		if (start < end)
			return a[start] + sumArray(a, start + 1, end);
		return a[start];
	}

	public static int fac(int n) {
		if (n == 1) {
			return 1;
		} else {
			System.out.println(n + " * " + (n - 1));
			return n * fac(n - 1);
		}
	}

	public static int sum(int n) {
		if (n > 0) {
			System.out.println(n + " + " + (n - 1));
			return n + sum(n - 1);
		} else {
			return 0;
		}
	}

	public static int power(int x, int n) {
		if (n == 0) {
			return 1;
		} else {
			System.out.println(x + " * " + x);
			return x * power(x, n - 1);
		}
	}

	public static boolean binarysearch(int data[], int target, int low, int high) {
		if (low > high) {
			return false;
		} else {
			int mid = (low + high) / 2;
			if (target == data[mid]) {
				return true;
			} else if (target < data[mid]) {
				return binarysearch(data, target, low, mid - 1);
			} else {
				return binarysearch(data, target, mid + 1, high);
			}
		}
	}

	public static boolean search(int a[], int target, int start, int end) {
		if (start == end) {
			return false;
		} else if (target == start) {
			return true;
		} else {
			return search(a, target, start + 1, end);
		}
	}

	public static int searchCount(int a[], int target, int start, int end) {
		if (start == end) {
			return 0;
		}
		if (a[start] == target) {
			return 1 + searchCount(a, target, start + 1, end);
		} else {
			return 0 + searchCount(a, target, start + 1, end);
		}
	}
	public static boolean sortCheck(int a[], int start, int end) {
		if(start == end -1) {
			return true;
		}
		System.out.println(a[start] + " , " + a[start + 1]);
		if( a[start] > a[start + 1]) {
			return false;
		}else {
			return sortCheck(a, start + 1, end);
		}
	}
	
	public static int searchMax(int a[], int start, int end) {
		if(start == end -1) {
			return a[start];
		}else {
			int next = searchMax(a, start + 1, end);
			if(a[start] > next) {
				return a[start];
			}else {
				return next;
			}
		}
	}
}