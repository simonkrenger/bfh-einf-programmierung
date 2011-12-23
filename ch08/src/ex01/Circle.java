package ex01;

/**
 * Class to represent a simple circle, implements the Polygon interface.
 * Features methods to get the radius, the area and the perimeter of the circle.
 * 
 * @author simon
 * @since 23.12.2011
 * 
 */
public class Circle implements Polygon {

	/**
	 * Private variable to hold the radius of the circle
	 */
	private double radius = 0;

	/**
	 * Constructor for the class, takes the radius of the circle as an argument
	 * 
	 * @param radius
	 *            Radius of the circle
	 */
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// PI * radius^2
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

}
