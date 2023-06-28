package oops.encapsulation;

public class RectangleRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Rectangle area=new Rectangle(4,5);
    Rectangle area1=new Rectangle(3,9);//initialize the value
    area1.setlength(19);
    area.setlength(20);
    area.setbreath(10);
    System.out.println(area.getlength());
    System.out.println(area.getbreath());
    System.out.println(area1.getlength());
    area.area();
    area1.area();
	}

}
