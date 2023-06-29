package exerciseprogram.Common;
import java.util.Scanner;

public class FanRunner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the detais: \nmakes\nradis\ncolors\nspeed");
		String make=scanner.next();
		double radius=scanner.nextDouble();
		String color=scanner.next();
		int speed=scanner.nextInt();
		Fan runthefan=new Fan(make,radius,color,speed);
		runthefan.stateOfFan(true);
		System.out.println("enter the changing speed");
		int changeSpeedFromCustomer=scanner.nextInt();
    	runthefan.changeSpeed(changeSpeedFromCustomer);
	}

}
