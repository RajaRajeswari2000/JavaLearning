package oops.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemoRunner {
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(2);//newSingleThreadExecutor()--one by one completed
		executorService.execute(new ExecutorServiceDemo(1));
		executorService.execute(new ExecutorServiceDemo(2));
		executorService.execute(new ExecutorServiceDemo(3));
		executorService.shutdown();
	}

}
