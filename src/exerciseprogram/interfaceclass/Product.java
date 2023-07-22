package exerciseprogram.interfaceclass;

public interface Product {
	
	int create();
   default void read() {
	   System.out.println("default method");
   }
}
