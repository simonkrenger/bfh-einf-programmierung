package ex01;

/**
 * Class to represent a square, implements the Polygon interface.
 * 
 * @author simon
 * @since 23.12.2011
 * 
 */
public class Square implements Polygon {

	/**
	 * Private method to hold the length of one side
	 */
	private double side = 0;

	/**
	 * Constructor for the class, takes the length of one side as an argument
	 * 
	 * @param sideLen
	 *            Length of one side
	 */
	public Square(double sideLen) {
		this.side = sideLen;
	}

	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

}
