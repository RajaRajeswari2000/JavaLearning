package oops.collection;


import java.util.List;

import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;

public class BasicSet {
	public static void main(String[] args) {
		List<Character> letter=List.of('A','Z','A','B','Z','F');
		
		Set<Character> unique=new TreeSet<Character>(letter);
		System.out.println(unique);
		
		Set<Character> unique1=new LinkedHashSet<Character>(letter);
		System.out.println(unique1);
		Set<Integer> numbers=Set.of(13,89,45,26,75,40);
	
		Set<Integer> diffMethodComAnotherSet=new TreeSet<Integer>(numbers);
		for(int num:diffMethodComAnotherSet) {
			System.out.println(num);
		}
		System.out.println(diffMethodComAnotherSet);
		 System.out.println(((NavigableSet<Integer>) diffMethodComAnotherSet).lower(89));//floor=less than equals to  lower=less than
		 System.out.println(( (TreeSet<Integer>) diffMethodComAnotherSet).higher(45));//ceiling 
		 System.out.println(((TreeSet<Integer>) diffMethodComAnotherSet).subSet(26,false,75, false));
		 //headSet(40)=13,26  tailSet(40)=45,75,89
		 
	}
}
