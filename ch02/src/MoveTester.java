import java.awt.*;
public class MoveTester {
	public static void main (String[] args) {
		Rectangle box = new Rectangle(5,10,20,30);
		box.setLocation(10, 10);
		// move method is deprecated!
		
		box.translate(5,10);
		
		// Print information about the moved rectangle
		System.out.print("x: ");
		System.out.println(box.getX());
		System.out.println("Expected: 15.0");
		System.out.print("y: ");
		System.out.println(box.getY());
		System.out.println("Expected: 20.0");
	}
}