package oops.inheritance;

public class Circle extends Shapes {

	
	public Circle(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	public  void calculateArea() {
		super.calculateArea(number);
		System.out.println("area");
	
	}
	

	/*int radius;

	public Circle(String color,int radius) {
		super(color);
		// TODO Auto-generated constructor stub
		this.radius=radius;
	}

	@Override
	public void calculateArea() {
		// TODO Auto-generated method stub
		
	}*/
	
}
