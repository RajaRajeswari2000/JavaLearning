package oops.abstractclass;

public abstract class Shape {
	abstract void calculateArea();
	abstract void calculatePerimeter();
	
	public void execute() {
		calculateArea();
		calculatePerimeter();
	}

}
