package oops.thread;

public class ExecutorServiceDemo implements Runnable{
	private int number;
	public ExecutorServiceDemo(int number) {
	this.number = number;
	}

	@Override
	public void run() {
		System.out.println("Task " + number + " Started");
		for(int i=number*100; i<=number*100+99; i++) {
		System.out.print(i + " ");
		}
		System.out.println("\nTask " + number +" Done");
		
	}

}
