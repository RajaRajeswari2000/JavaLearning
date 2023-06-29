package oops.array;

import java.util.Scanner;

public class StudentRunner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter how many students: ");
		int students = scanner.nextInt();
		for (int k = 1; k <= students; ++k) {
			System.out.println("enter the name: ");
			String name = scanner.next();
			/*
			 * int[] marks=new int[5]; System.out.println("enter your marks: "); for(int
			 * i=0;i<5;++i) { marks[i]=scanner.nextInt(); }
			 * 
			 * for(int i=0;i<5;++i) { System.out.println(marks[i]); }
			 */
			Student student = new Student(name, 48,98,78,90);
			int number = student.getNumOfMarks();
			System.out.println(number);
			int sum = student.getSumOfMarks();
			System.out.println(sum);
			int max = student.getMaxMarks();
			System.out.println(max);
			int min = student.getMinMarks(max);
			System.out.println(min);
		}
	}
}
