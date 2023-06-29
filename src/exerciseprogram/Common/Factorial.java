package exerciseprogram.Common;

public class Factorial {
	int factorial=1;
    public void factorialcal(int num) {
      for(int i=1;i<=num;++i) {
    	  //n!=n*(n-1)*(n-2)....*1
    	 int n=factorial*=i;
    	 System.out.println(n);
      }
      
    }
}
