package oops.collection;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MaxOfListRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		 List<Integer> list = new ArrayList<>();
	        System.out.println("Enter integers (separated by spaces): ");
	        String[] input = scanner.next().split(" ");
	        for (String s : input) {
	            list.add(Integer.parseInt(s));
	        }
	        List<MaxOfList> max=List.of(new MaxOfList (input));
		//MaxOfList max=new MaxOfList(input);
	
	}

}
