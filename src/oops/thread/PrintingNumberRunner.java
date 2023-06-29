package oops.thread;

public class PrintingNumberRunner {

	public static void main(String[] args) throws InterruptedException {
		PrintingEvenNumbers task1 = new PrintingEvenNumbers();
		PrintingOddNumbers task2 = new PrintingOddNumbers();
		Thread task2runner = new Thread(task2);
		task1.start();
		Thread.sleep(5000);
		task1.setPriority(10);
		task2runner.start();
		task2runner.setPriority(1);
		task1.join();
		task2runner.join();
		Thread.sleep(6000);
		System.out.println("main task started");
		for (int i = 0; i <= 10; ++i) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println("main task completed");
	}

}
