package oops.generics;


public class SwapRunner {

	public static void main(String[] args) {
		 Swap<Integer> number=new Swap<>();
      number.add(12);
      number.add(34);
      number.add(44);
      number.add(41);
      number.add(14);
      System.out.println(number.toString());
      number.swapping();
      Swap<String> words=new Swap<>();
      words.add("AadhiraVaishu");
      words.add("raji");
      words.add("indra");
      words.add("selvamani");
      words.add("panneer");
      System.out.println(words.toString());
      words.swapping();
      
      
	}

}
