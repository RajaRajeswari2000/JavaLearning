package exerciseprogram.Collection_Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class SmallestOnLeft {

	public static LinkedHashSet<Integer> smallestonleft(Set<Integer> number1) {

		LinkedHashSet<Integer> num = new LinkedHashSet<Integer>() ;

		for (int var : number1) {
			System.out.println(var);
			if (var >1&&var <=100) {
				num.add(var-1);
			} else if (var == 1) {
				num.add(-1);
			}
		}
		return num;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> number = Set.of(1, 2, 3, 5, 9, 6, 4, 7);
		//Set<Integer> number1 = new LinkedHashSet<Integer>(number);
		System.out.println(number);
		LinkedHashSet<Integer> numbers = smallestonleft(number);
		System.out.println(numbers);
	}

}
