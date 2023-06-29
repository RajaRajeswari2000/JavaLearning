package oops.conditional;
 import java.util.Scanner;
public class WeekDayRunner {
public static void main(String[] args) {
	 @SuppressWarnings("resource")
	Scanner scanner =new Scanner(System.in);
	 System.out.println("enter the number: ");
	 int number =scanner.nextInt();
	 WeekDay obj =new WeekDay(number);
	 obj.isWeekday();
  }
}
