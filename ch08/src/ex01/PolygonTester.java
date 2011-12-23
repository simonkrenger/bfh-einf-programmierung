package ex01;

import java.util.ArrayList;

/**
 * Class to test the first exercise, implementations of the Polygon interface.
 * Basically, we create a new ArrayList, fill it with some polygons and print
 * them to STDOUT.
 * 
 * @author simon
 * @since 23.12.2011
 * 
 */
public class PolygonTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Polygon> polyArray = new ArrayList<Polygon>();

		polyArray.add(new Circle(2.0));
		polyArray.add(new Circle(1.0));
		polyArray.add(new Square(7.0));
		polyArray.add(new Circle(3.0));
		polyArray.add(new Square(5.0));

		for (Polygon p : polyArray) {
			System.out.println("Polygon, class=\"" + p.getClass() + "\", area="
					+ p.getArea() + ", perimeter=" + p.getPerimeter());
		}

	}

}
