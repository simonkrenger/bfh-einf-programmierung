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
		
		System.out.println(pc.calcPi(6));
		System.out.println(pc.getLastRunIterations());

	}

}
