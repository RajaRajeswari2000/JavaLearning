package exerciseprogram.Common;

public class RecursionDemo {

	public static void main(String[] args) {

		RecursionDemo obj = new RecursionDemo();
		int output = obj.recursion(5);
		
		System.out.println(output);
		

		// 5 * 4 * 3 * 2 * 1
	}

	int recursion(int n) {
		if (n == 0) return 1;
		return n * recursion(n - 1); // (5 * 4 * 3 * 2 * 1)
	}

}
