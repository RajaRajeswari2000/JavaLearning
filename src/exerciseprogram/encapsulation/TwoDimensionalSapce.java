package exerciseprogram.encapsulation;

public class TwoDimensionalSapce {
	private int x;
	private int y;

	// Constructor for the Point class
	public TwoDimensionalSapce(int x, int y) {
		this.x = x; // Assigning x-coordinate of the point
		this.y = y; // Assigning y-coordinate of the point
	}

	// Method to get the x-coordinate of the point
	public int getX() {
		return x;
	}

	// Method to get the y-coordinate of the point
	public int getY() {
		return y;
	}

	// TODO: Implement the method to move the point by dx and dy in x and y
	// direction respectively
	public void move(int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}

	// TODO: Implement the method to calculate the distance from this point to
	// another point
	public double distanceTo(TwoDimensionalSapce point2) {
		int diff1 = this.x - point2.x;
		int diff2 = this.y - point2.y;
		return Math.sqrt(diff1 * diff1 + diff2 * diff2);
		// Your code here
	}

	public static void main(String[] args) {
		TwoDimensionalSapce point1 = new TwoDimensionalSapce(3, 4);
		point1.move(1, 1);
		System.out.println(point1.getX());
		System.out.println(point1.getY());
		TwoDimensionalSapce point2 = new TwoDimensionalSapce(6, 8);
		double distancePoint = point2.distanceTo(point2);
		System.out.println(distancePoint);

	}

}
