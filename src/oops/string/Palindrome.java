package oops.string;

public class Palindrome {
	public static int isPalindrome() {
		int result = 0;
		String name = "madam";
		String reverse = "";
		for (int i = name.length() - 1; i >= 0; --i) {
			reverse += name.charAt(i);
		}
		System.out.println(reverse);
		if (name.equals(reverse)) {
			result = 1;
		} else {
			result = 0;
		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int output = isPalindrome();
		System.out.println(output);
	}

}
