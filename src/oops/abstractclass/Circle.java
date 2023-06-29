package oops.abstractclass;

public class Circle extends Shape {

	@Override
	void calculateArea() {
		double area;
		area= 3.14159*3*3;
		System.out.println(area);
		
	}

	@Override
	void calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter;
		perimeter=2* 3.14159*3;
		System.out.println(perimeter);
	}

}
