package oops.exceptionhandling;

public class execption {

	public static void main(String[] args) throws InterruptedException {
		useExecHandling();
		useUncheckedExcep();
		System.out.println("throw exception in the method");
	}

	private static void  useUncheckedExcep() throws RuntimeException {
		// TODO Auto-generated method stub
		
	}

	private static void useExecHandling() throws InterruptedException {
		String[] word= {"exception","handling"};
		int get=word.length;
		Thread.sleep(5000);
		try {
			int a=2;
			int b=0;
			int c=a/b;
			System.out.println(c);
			}catch(Exception e) {
				e.printStackTrace();	
		}finally {
			System.out.println(get);
			System.out.println("after exception");
			
			
		}
		
	}

}
	

