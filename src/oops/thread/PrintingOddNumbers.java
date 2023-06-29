package oops.thread;

public class PrintingOddNumbers implements Runnable {
	public void run() {
		System.out.println("task2 started");
		for (int i = 1; i <= 100; ++i) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println("task2 completed");
	}
}
