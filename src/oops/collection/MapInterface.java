package oops.collection;

import java.util.Map;
import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Comparator;
class order implements Comparator<Character>{

	@Override
	public int compare(Character value1, Character value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value2.compareTo(value1), value1.compareTo(value2));
	}//doubt

	
	
}

public class MapInterface {

	public static void main(String[] args) {
		Map<String,Integer> list=Map.of("hashmap",4,"linkedhashmap",3);
		System.out.println(list.isEmpty());
		System.out.println(list.keySet());
		System.out.println(list.containsValue(5));
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your text:\n");
	    String line=scanner.nextLine();
	    Map<Character,Integer> occurences=new TreeMap<>();
	    char[] characters=line.toCharArray();
	    for(char character:characters) {
	    	Integer integer=occurences.get(character);
	    	if(integer==null) {
	    		occurences.put(character, 1);
	    	}else {
	    		occurences.put(character, integer+1);
	    	}
	    }
	    
	    System.out.println(occurences);
	    Map<String,Integer> stringOccurences=new LinkedHashMap<>();
	    String[] words=line.split(" ");
	    for(String word:words) {
	    	Integer integer=stringOccurences.get(word);
	    	if(integer==null) {
	    		stringOccurences.put(word, 1);
	    	}else {
	    		stringOccurences.put(word, integer+1);
	    	}
	    }
	    
	    System.out.println(stringOccurences);
		

	}

}
