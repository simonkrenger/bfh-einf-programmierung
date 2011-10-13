package ex01;
import java.awt.*;
import java.util.Scanner;

public class IntersectionPrinter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Read the properties of the first box from the user
		System.out.println("Please enter the X and Y coordinate of the first box (20x30): ");
		int box1XCoordinate = input.nextInt();
		int box1YCoordinate = input.nextInt();
		
		// Read the properties of the second box from the user
		System.out.println("Please enter the X and Y coordinate of the second box (50x50): ");
		int box2XCoordinate = input.nextInt();
		int box2YCoordinate = input.nextInt();
		
		// Create two instances of the class
		Rectangle box1 = new Rectangle(box1XCoordinate,box1YCoordinate,20,30);
		Rectangle box2 = new Rectangle(box2XCoordinate,box2YCoordinate,50,50);
		
		System.out.println("Our first box has the properties: " + box1.toString());
		System.out.println("Our second box has the properties: " + box2.toString());
		
		if(box1.intersects(box2))
		{
			System.out.println("The two boxes intersect!");
			Rectangle intersectBox = box1.intersection(box2);
			System.out.println("The intersections has the properties: " + intersectBox.toString());
		}
		else
		{
			System.out.println("The two boxes do not intersect!");
		}
	}

}
