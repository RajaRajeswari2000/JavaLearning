package oops.inheritance;

public class Rectangle extends Shapes {
int length;
int breadth;
	public Rectangle(String color, int length, int breadth) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}
	@Override
	public void calculateArea(int num) {
		super.calculateArea(num);
		int area=length*breadth;
		System.out.println(area);
	}

}
