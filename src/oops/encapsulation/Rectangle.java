package oops.encapsulation;

public class Rectangle {
	private int length;
	private int breath;
	
	Rectangle(int length, int breath){
		this.length=length;
		this.breath=breath;
		System.out.println(length);
		System.out.println(breath);
	}
	
	void setlength(int length) {
		this.length=length;
	}
	void setbreath(int breath) {
		this.breath=breath;
	}
	int getlength() {
		return length;
	}
	int getbreath() {
		return breath;
	}
	
	

}
