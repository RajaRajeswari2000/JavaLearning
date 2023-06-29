package oops.conditional;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number1: ");
		int number1 = scanner.nextInt();
		System.out.println("enter the number2: ");
		int number2 = scanner.nextInt();
		System.out.println("your the choice \n 1-add \n 2-sub \n 3-divide \n 4-multiply \n choose the operation: ");
		int operation = scanner.nextInt();
		Menu obj = new Menu(number1, number2,operation);
		obj.menuoperation();

	}

}
