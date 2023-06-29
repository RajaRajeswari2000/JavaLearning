package oops.collection;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
public class BasicQueue {
		class stringComparable implements Comparator<String>{///doubt
			 @Override
			 public int compare(String value1, String value2) {
			 	// TODO Auto-generated method stub
			 	return Integer.compare(value1.length(), value2.length());
	
			 }}
	public static void main(String[] args) {
			 
		Queue<String> words=new PriorityQueue<>();
		System.out.println(words.offer("queue"));
		System.out.println(words.addAll(List.of("treeset","linkedset","hastset")));
		
		System.out.println(words.poll());
		System.out.println(words.poll());
	

}


}