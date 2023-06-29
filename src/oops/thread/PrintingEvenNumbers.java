package oops.thread;

public class PrintingEvenNumbers extends Thread {
	public void run() {
		System.out.println("task1 started");
		for (int i = 1; i <= 100; ++i) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("task1 completed");
	}

}
