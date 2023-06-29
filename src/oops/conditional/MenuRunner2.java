package oops.conditional;

import java.util.Scanner;

public class MenuRunner2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number1: ");
		int number1 = scanner.nextInt();
		System.out.println("enter the number2: ");
		int number2 = scanner.nextInt();
		System.out.println("your the choice \n 1-add \n 2-sub \n 3-divide \n 4-multiply \n choose the operation: ");
		int operation = scanner.nextInt();
		Menu2 obj = new Menu2(number1, number2, operation);
		obj.menuoperation();
	}

}
