package oops.functionalprogramming;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class FunctionalRunner {
	public static class evenNumber implements Predicate<Integer>{
		public boolean test(Integer number) {
			
			return number%2==0;//return the function from method 
		}
	}
	public static class outputCus implements Consumer<Integer>{

		@Override
		public void accept(Integer number) {
			// TODO Auto-generated method stub
			System.out.println(number);
		}
		
	}
	public static void main(String[] args) {
           List<String> words=List.of("apple","bat","cat","dog","eat");
           looping(words);
           List<Integer> number=List.of(14,7,7,645,43,16);
           loopingnumber(number);
           sumOfNumbers(number);
           findFirstInteger();
           lengthOfWords(words);
           lowerCaseOfWords(words);
           intermediate(number);
           terminal(number);           
           }
	public static void looping(List<String> words) {
		Predicate<? super String> endOfWords = elements -> elements.endsWith("at");//storing function in variable
		List<String> list=words.stream().filter(endOfWords).collect(Collectors.toList());
		System.out.println(list);
	}//Stream<T> filter(Predicate<? super T> predicate);
	//public interface Predicate<T> {
	public static void loopingnumber(List<Integer> number) {
		number.stream().filter(new evenNumber()).forEach(new outputCus());//void forEach(Consumer<? super T> action)
	} 
		public static void sumOfNumbers(List<Integer> number) {
		int sum=0;
		sum=number.stream().filter(elements -> elements%2==0/*passing function to method */).reduce(0,(number1,number2) -> number1+number2);
		System.out.println(sum);
	}
	public static void findFirstInteger() {
		
	List<Integer> list=IntStream.range(1,10).map(elements -> elements*elements).boxed().collect(Collectors.toList());
	System.out.println(list);	
	}
	public static void lowerCaseOfWords(List<String> words) {
		words.stream().map(elements -> elements.toLowerCase()).forEach(elements -> System.out.println(elements));
	}
	public static void lengthOfWords(List<String> words) {
		words.stream().map(elements -> elements.length()).forEach(elements -> System.out.println(elements));
	}
	public static void intermediate(List<Integer> number) {
		number.stream().distinct().forEach(new outputCus());
	}
	public static void terminal(List<Integer> number) {
		number.stream().filter(elements -> elements%2==0).max((number1,number2) -> Integer.compare(number1, number2)).get();
	}//min
    //method references
}
