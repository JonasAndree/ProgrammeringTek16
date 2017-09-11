package classes.lesson;

public class Circle {
	private double r = 1.0;
	private String color = "blue";
	
	
	/**
	 *  Constructor 
	 */
	public Circle(String startColor) {
		color = startColor;
		System.out.println(r + " " + color);
	}
	
	
	
	public double getR() {
		return r;
	}
	
	public void setR(double newR) {
		r = newR;
	}
}
