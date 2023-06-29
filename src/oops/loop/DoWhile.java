package oops.loop;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		int number = 0;
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("enter the number: ");
			number = scanner.nextInt();

			System.out.println("cube is: " + (number * number * number));

		} while (number >= 0);
	}

}
