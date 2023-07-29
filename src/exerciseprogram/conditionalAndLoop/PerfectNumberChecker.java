package exerciseprogram.conditionalAndLoop;

public class PerfectNumberChecker {
	public boolean isPerfectNumber(int number) {
	      int sumOfNumber=0;
	        if(number>0){
	            for(int i=1;i<number;i++){
	                if(number%i==0){
	                    sumOfNumber +=i;
	                }
	            }
	          if(sumOfNumber==number) {
	        	  return true;
	          }
	        }
	        return false;
	    }

	public static void main(String[] args) {
		PerfectNumberChecker checker=new PerfectNumberChecker();
		boolean result=checker.isPerfectNumber(28);
		System.out.println(result);

	}

}
