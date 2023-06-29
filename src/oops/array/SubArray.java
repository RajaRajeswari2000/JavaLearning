package oops.array;

import java.util.ArrayList;

public class SubArray {
	static void subarray() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		int subarray = 5;
		for (int i = 0; i <= numbers.size(); ++i) {
			int sum = 0;
			sum += i;
		
		if (sum == subarray) {
		 sum=subarray;
		} else {
			 sum = 0;
		}
		System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		subarray();
		
		
	}

}
