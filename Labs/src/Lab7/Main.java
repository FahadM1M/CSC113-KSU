package Lab7;

public class Main {

	public static void Reverse(int[ ] list, int n) {
		if(n == 0)
			
		return;
		
		System.out.print(list[n - 1] + ",");
		
		Reverse(list, n - 1);
		}
	
		public static void main(String[] args) {
			
		int[] myArray = {1, 2, 3, 4, 5};
		
		Reverse(myArray, myArray.length);

 }
}