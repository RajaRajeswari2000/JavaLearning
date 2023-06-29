package oops.string;

import java.util.Arrays;

public class IsAnagram {
	public static boolean anagram() {
		String name1 = "raji";
		String name2 = "raje";
		boolean result = false;
		if (name1.length() == name2.length()) {
			char[] nam1 = name1.toCharArray();
			char[] nam2 = name2.toCharArray();
			Arrays.sort(nam1);
			Arrays.sort(nam2);
			if (Arrays.equals(nam1, nam2)) {
				result = true;
			} else {
				// System.out.println("False");
				result = false;
			}

		}
		return result;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean res=anagram();
		System.out.println(res);
	}

}
