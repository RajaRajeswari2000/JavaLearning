package exerciseprogram.Common;
 import java.util.Scanner;
public class LeapYearRunner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the year: ");
		int year=scanner.nextInt();
		LeapYear.leapYearcalucluation(year);

	}

}
