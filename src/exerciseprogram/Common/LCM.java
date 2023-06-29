package exerciseprogram.Common;
import java.util.Scanner;
public class LCM {

	public static void main(String[] args) {
	 @SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
	 System.out.println("enter the two numbera: ");
	 int num1=scanner.nextInt();
	 int num2=scanner.nextInt();
		int lcm1=1;
		for(int i=1;i<=num1 && i<=num2; ++i) {
			if(num1%i==0 && num2%i==0) {
				lcm1=i;
			}
		}
		int n1=num1/lcm1;
		int n2=num2/lcm1;
		System.out.printf("LCM of two number is:%d ",+(n1*n2*lcm1)).println();
		System.out.printf("HCF of two number is:%d ",+lcm1);
	}

}
