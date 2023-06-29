package exerciseprogram.Common;
import java.util.Scanner;
public class StringArray {
	public void ArrayChallenge(String[] elements) {
		
		for(int i=0;i<elements.length;i++) {
			for (int j=0; j<elements.length;i++) {
			System.out.println(elements[i]);
			System.out.println(elements[j]);
		}}
	}
	

	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	String[] elements=new String[2];
	
	for(int i=0;i<elements.length;i++) {
		System.out.println("enter the elements:");
		elements[i]=scanner.nextLine();
		
	}
	for(int i=0;i<elements.length;i++) {
		System.out.println(elements[i]);
		
	}
	StringArray balance=new  StringArray();
	balance.ArrayChallenge(elements);

	}

}
/*
stringarray 
two elements =5,9  1,2,3
5 +6=11         9+2=11

1,2,6,7
output 2,6
*/