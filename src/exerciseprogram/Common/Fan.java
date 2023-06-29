package exerciseprogram.Common;

public class Fan {
	String make;
	double radius;
    String color;
	boolean isOn;
	int speed;
	Fan(String make,double radius,String color,int speed){
		this.color=color;
		this.make=make;
		this.radius=radius;
		this.speed=speed;
	}
	public void stateOfFan(boolean isOn) {
		this.isOn=isOn;
		if(this.isOn==true) {
			System.out.println(speed     +"\nswitchOn");
		}
		else {
			System.out.println("speed=0 \nswitchoff");
		}
		
		
	}
	public void changeSpeed(int changeSpeedFrom) {
		// timer
		// TODO Auto-generated method stub
		System.out.println(changeSpeedFrom);
		
	}
    
}
