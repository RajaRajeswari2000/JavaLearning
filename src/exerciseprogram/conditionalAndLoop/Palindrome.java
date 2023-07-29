package exerciseprogram.conditionalAndLoop;

public class Palindrome {

	int num = 127871;

	public boolean isPalindromeString() {

		String name = "madam";
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; --i) {
			reverse += name.charAt(i);
		}
		System.out.println(reverse);
		if (name.equals(reverse)) {
			return true;
		}
		return false;
	}

	public boolean isPalindromeInteger() {
		int num1 = num;
		int reverse = 0;

		while (num1 != 0) {
			int digit = num1 % 10;
			reverse = reverse * 10 + digit;
			num1 /= 10;
		}
		System.out.println(reverse);
		if (num == reverse) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome check = new Palindrome();
		boolean resultOfString = check.isPalindromeString();
		System.out.println(resultOfString);
		boolean resultOfInteger = check.isPalindromeInteger();
		System.out.println(resultOfInteger);
	}

}
