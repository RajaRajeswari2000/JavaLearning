package oops.loop;

import java.util.stream.IntStream;

public class SumUptoN {
	public int sumOfDivisor(int num) {
		int divisor=0;
		for(int i=2;i<=num-1;++i) {
			if(num%i==0) {
				divisor=divisor+i;
			}
		}
		return divisor;
	}
	static void printTriangle(int num1) {
		for(int i=1;i<=num1;++i) {
			for(int j=1;j<=i;++j) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum2=sumUpTo();
		System.out.println(sum2);
	
	int number=5;
	//sum=n+(n-1)+(n-2)+n-3+n-4+n-5
	int sum=0;
	for (int i=1; i<=number;++i) {/* 1+0=1;1+2=3  */
		sum=sum+i;
	}
	System.out.println("sumupto:" +sum);
    SumUptoN obj=new SumUptoN();
    int sum1= obj.sumOfDivisor(20);
    System.out.println(sum1);
    SumUptoN.printTriangle(10);
    

	}
	public static int sumUpTo() {
		int sum=IntStream.range(0, 5).reduce(0,(number1,number2) -> number1+number2);
		return sum;	
		}

}

