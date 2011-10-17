package ex02;

/**
 * A tester class for our Pair class.
 * 
 * @author simon
 * @since 17.10.2011
 * 
 */
public class PairTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create new object from class Pair
		Pair pair1 = new Pair(-2, 11);
		System.out.println(pair1.toString());
		
		// Call all methods and check
		System.out.println("sum=" + pair1.getSum() + ", expected=9");
		System.out.println("difference=" + pair1.getDifference() + ", expected=-13");
		System.out.println("product=" + pair1.getProduct() + ", expected=-22");
		System.out.println("average=" + pair1.getAverage() + ", expected=4.5");
		System.out.println("distance=" + pair1.getDistance() + ", expected=13");
		System.out.println("max=" + pair1.getMaximum() + ", expected=11");
		System.out.println("min=" + pair1.getMinimum() + ", expected=-2");
	}
}
