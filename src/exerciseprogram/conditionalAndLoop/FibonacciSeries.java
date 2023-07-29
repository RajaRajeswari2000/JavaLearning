package exerciseprogram.conditionalAndLoop;

public class FibonacciSeries {

	public void foundFibonacciSeries(int n) {

		/*
		 * int num = 1; for (int i = 0; i <= n;) { //01123 System.out.print(i +
		 * ",");//0112358 int next=i+num;//12358 i=num;//1123 num=next;//1235 }
		 */
		
		int n1 = 0, n2 = 1, n3 = 0;
		
		for(int i = 0; i < n; i++) {
			
			System.out.print(n1 + ","); // 0, 1, 1, 2, 3, 5, 8, 13, 21
			
			n3 = n1 + n2; // 1, 2, 3, 5, 8, 13, 21, 34
			n1 = n2; // 1, 1, 2, 3, 5, 8, 13, 21, 
			n2 = n3; // 1, 2, 3, 5, 8, 13, 21, 34
			
			 
		}

	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.foundFibonacciSeries(10);

	}

}
//output==0,1,1,2,3,5