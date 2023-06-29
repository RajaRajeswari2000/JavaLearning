package oops.conditional;

public class Menu1 {
	int number1;
	int number2;
	int operation;
	Menu1(int number1,int number2, int operation){
		this.number1=number1;
		this.number2=number2;
		this.operation=operation;
	}
	public void menuoperation() {
	switch(operation) {
	case 1:
		System.out.printf("%d+%d=%d" ,number1,number2,number1+number2);
	    break;
	case 2:
		System.out.printf("%d-%d=%d" ,number1,number2,number1-number2);
		break;
	case 3:
		System.out.printf("%d/%d=%d" ,number1,number2,number1/number2);
		break;
	case 4:
		System.out.printf("%d*%d=%d" ,number1,number2,number1*number2);
		break;
	}
	}
}
