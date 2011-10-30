/**
 * 
 */
package ex05;

/**
 * @author simon
 *
 */
public class LineTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Line l1 = new Line(5, 5, 10, 10);
		Line l2 = new Line(1, 20);
		Line l3 = new Line(5, 10, 1);
		Line l4 = new Line(7.5D);
		
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println(l4);
		
		if(l1.equals(l2))
			System.out.println("l1 and l2 are equal");
		
		if(l1.intersects(l2))
			System.out.println("l1 and l2 intersect");
		else if(l2.isParallel(l2))
			System.out.println("l1 and l2 are parallel");
		
		if(l4.intersects(l2))
			System.out.println("Yay");

	}

}
