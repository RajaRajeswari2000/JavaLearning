package oops.array;

import java.util.Arrays;
import java.util.ArrayList;

public class Array {
	 private ArrayList<Integer> mark =new ArrayList<Integer>();
	
	Array(int...mark){//variable argumets.
		for(int marks:mark) {
			this.mark.add(marks);
		}
		System.out.println(this.mark);
	}
	static void printArray() {
	ArrayList<Integer> marks =new ArrayList<Integer>(); //add and remove the elements in array
	marks.add(34);
	marks.add(65);
	marks.remove(0);
	
	System.out.println(marks);
	int[] number= {2,3,5,7,4};
	int[] number1= {6,2,9,1,7};
	int[] number3=new int[5];
	Arrays.fill(number3,100); //fill the array contents
	System.out.println(Arrays.toString(number3));
	Arrays.sort(number1);//sort the array==2,5,3,1---1,2,3,5
	//to view the content of the array - Arrays.toString()
	System.out.println(Arrays.toString(number));
	System.out.println(Arrays.toString(number1));
	System.out.println(marks.size());
	System.out.println("length of Array: " + number.length +" " + number1.length);
	int sum=0;
	for (int i=0;i<number.length;++i) {
			System.out.print(number[i] + " ");
		sum +=number[i];	
	}
	System.out.println();
	System.out.println(sum);

	}

	public static void main(String[] args) {
		Array putvalues=new Array(6,4,7,2,8);
		Array.printArray();

	}

}

