package oops.conditional;

public class Menu {
	int number1;
	int number2;
	int operation;
	Menu(int number1,int number2,int operation){
		this.number1=number1;
		this.number2=number2;
		this.operation=operation;
	}
	
	public void menuoperation() {
	if(operation ==1) {
		int add=number1+number2;
		System.out.println(add);
		
	}
	 else if(operation==2){
		int sub=number1-number2;
		System.out.println(sub);
	}
	else if(operation==3) {
		double num1=number1;//casting (widening)
		double num2=number2;
		double sub=num1/num2;
		int result=(int) sub;//narrowing casting
		System.out.println(result);
	}
	else {
		int multiply=number1*number2;
		System.out.println(multiply);
		
	}
	}


}
