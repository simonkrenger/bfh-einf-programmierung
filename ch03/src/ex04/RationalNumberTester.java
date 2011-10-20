/**
 * 
 */
package ex04;

/**
 * @author simon
 *
 */
public class RationalNumberTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RationalNumber n1 = new RationalNumber(1, 2);
		RationalNumber n2 = new RationalNumber(2, 1);
		n1 = n1.multiply(n2);
		System.out.println(n1.toString());

	}

}
