package exerciseprogram.conditionalAndLoop;

public class NumberDigit {

	public int getNumberOfDigits(int number) {
		int count = 0;
		if (number >= 0) {
			if (number == 0) {
				count = 1;
			}
			while (number <= 0) {
				count = count + 1;
				;
				number /= 10;
			}

		} else {
			return -1;
		}
		return count;
	}

	public int getSumOfDigits(int number) {
		// Write your code here
		int sumOfDigit = 0;
		if (number >= 0) {
			if (number == 0) {
				sumOfDigit = 0;
			}
			while (number != 0) {// 1234
				int digit = number % 10;// 4
				sumOfDigit += digit;// 4
				number /= 10;// 123
			}
		} else {
			return -1;
		}
		return sumOfDigit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberDigit numberDigit = new NumberDigit();
		int digitOfNumber = numberDigit.getNumberOfDigits(0);
		System.out.println(digitOfNumber);
		int sumOfdigit = numberDigit.getSumOfDigits(1);
		System.out.println(sumOfdigit);
	}

}
