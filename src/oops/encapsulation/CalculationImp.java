package oops.encapsulation;

public class CalculationImp implements Calculation {

	@Override
	public void area(Rectangle rectangle) {
		int result=rectangle.getlength()*rectangle.getbreath();
		System.out.println(result);
		
	}

}
