package ex02;

/**
 * A tester class for our Pair class.
 * 
 * @author simon
 *
 */
public class PairTester {

	private final static int TEST_START_VALUE = -2;
	private final static int TEST_END_VALUE = 8;
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = TEST_START_VALUE; i <= TEST_END_VALUE; i++) {
			Pair pair1 = new Pair(7, i);
			System.out.println(pair1.toString());
			System.out.println("sum=" + pair1.getSum());
			System.out.println("difference=" + pair1.getDifference());
			System.out.println("product=" + pair1.getProduct());
			System.out.println("average=" + pair1.getAverage());
			System.out.println("distance=" + pair1.getDistance());
			System.out.println("max=" + pair1.getMaximum());
			System.out.println("min=" + pair1.getMinimum());
		}
	}

}
