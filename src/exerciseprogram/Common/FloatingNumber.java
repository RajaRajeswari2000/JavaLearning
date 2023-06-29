package exerciseprogram.Common;

public class FloatingNumber {
	static void floatingAfterDecimal(float a, float b, int digit) {
		float c = a + b;
		String format = String.format("%%.%df", digit);
		String format1 = String.format(format, c);
		System.out.println(format1);

	}

	public static void main(String[] args) {
		floatingAfterDecimal(5.8976f, 4.9876f, 3);
	}

}
