package exerciseprogram.Common;

import java.util.Scanner;

public class CustomerAddressRunner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the name: ");
		String name = scanner.next();
		System.out.println("enter the line1:");
		String line1 = scanner.next();
		System.out.println("enter the city:");
		String city = scanner.next();
		System.out.print("enter the zip:");
		String zip = scanner.next();
		Address address = new Address(line1, city, zip);
		CustomerAddress customer = new CustomerAddress();//create the memory for customeraddress
	    customer.setName(name);
	    System.out.println(customer.getName());
		customer.setAddress(address);
		System.out.println(customer.getAddress());

	}

}
