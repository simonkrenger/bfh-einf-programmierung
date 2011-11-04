/**
 * 
 */
package ex01;

/**
 * @author simon
 *
 */
public class PiCalculatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PiCalculator pc = new PiCalculator();
		
		// Calculate PI for 7 places after the decimal point
		System.out.println(pc.calcPi(7));
		System.out.println("It took " + pc.getLastRunIterations() + " iterations.");

	}

}
