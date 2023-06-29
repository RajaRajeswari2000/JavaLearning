package oops.inheritance;

public class ShapesRunner {
	public static void main(String[] args) {
		Shapes shapes = new Shapes("bule");
		Circle circle=new Circle("red");
		//circle.calculateArea(5);
		circle.number=45;
		Circle.color="pink";
		Circle.number1=56;
		Rectangle rec=new Rectangle("orange",45,54);
		rec.calculateArea(5);
		System.out.println(shapes.number);
		System.out.println(circle.number);
	}

}
/*parent class-Shapes
static int a=39;
void method(){

}

subclass-Circle
void method(){

}


mainclass
Circle.a=89;
sysout(Circle.a)*/