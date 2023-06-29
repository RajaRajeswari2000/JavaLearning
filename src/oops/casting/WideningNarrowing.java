package oops.casting;

public class WideningNarrowing {
	int number=31;
	double number2=91.55;
	public void widening() {
		double number1=number;
		System.out.println(number1);
	}
	public void narrowing() {
		int myInt=(int)number2;
		System.out.println(myInt);
	}

	public static void main(String[] args) {
		WideningNarrowing casting =new WideningNarrowing();
		casting.widening();
		casting.narrowing();
		
	}

}
