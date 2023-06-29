package oops.string;

public class ReverseString {
	String name = "Raja Rajeswari";
	int num = 1234;

	public void reverseString() {
		String rev = "";
		for (int i = name.length() - 1; i >= 0; --i) {
			rev += name.charAt(i);
		}
		System.out.println(rev);
	}

	public void reversenumber() {
		int rev = 0;
		for (; num != 0; num /= 10) {
			int dig = num % 10;
			rev = rev * 10 + dig;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString reverseString = new ReverseString();
		reverseString.reverseString();
		reverseString.reversenumber();

	}

}
