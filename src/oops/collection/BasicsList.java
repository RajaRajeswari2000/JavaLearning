package oops.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
//import java.util.Iterator;
import java.util.LinkedList;
public class BasicsList {
	
	public void evaluate() {
	List<String> words=List.of("list.of() inseated of new list<string> from java 9");//we cann't add /remove/replaced in list---we use ArrayList or LinkedList,etc
	System.out.println(words.size());//in a array we have to use length:
    List<Integer> numbers=List.of(12,43,23,12);
    System.out.println(numbers.get(1));
    System.out.println(numbers.contains(12));
    System.out.println(numbers.indexOf(12));
    List<Integer> addRemove=new ArrayList<Integer>(numbers);
    Collections.sort(addRemove);//sort the number
    System.out.println(addRemove);
    List<Integer> addRemove1=new LinkedList<Integer>(numbers);
    System.out.println(addRemove.addAll(addRemove1));
    System.out.println(addRemove);
    
    for(int i=0;i<numbers.size();++i) {//we have to use also ===enhanced for loop for(int number:number){ sysout(number)}
    	System.out.println(numbers.get(i));
    }
     //Iterator iterator =numbers.iterator();
     // 	while(iterator.hasNext()) {
      //		System.out.println(iterator.next());
     // 	}
    
	}

public static void main(String[] args) {
	
BasicsList evaluates=new BasicsList();

	evaluates.evaluate();
}}