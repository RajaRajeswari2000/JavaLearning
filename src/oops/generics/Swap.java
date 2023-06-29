package oops.generics;
import java.util.ArrayList;
import java.util.Collections;

public class Swap<T> {//T extends number===we couldn't use string,char,etc===bounded type of generics.
	ArrayList<T> list=new ArrayList<>();

public void add(T elements) {
	 list.add(elements);
 }
public String toString() {
	return list.toString();
}
@SuppressWarnings("hiding")
public <T> void swapping(){//14,41,44,34,12
	Collections.swap(list, 0, 4);
	Collections.swap(list, 1, 3);
	//Collections.swap(list, 2, 3);
	//Collections.swap(list, 3, 4);
	//Collections.swap(list, 4, 0);
	System.out.println(list);
}
 }

//upper and lower bound wildcards==doubt;