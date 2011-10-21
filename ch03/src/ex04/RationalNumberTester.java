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
		// 1/2 + 1/3 = 5/6
		RationalNumber n1 = new RationalNumber(1, 2);
		RationalNumber n2 = new RationalNumber(1, 3);
		n1 = n1.add(n2);
		System.out.println(n1);
		
		// 8/9 + 1/9 = 1/1
		n1 = new RationalNumber(8, 9);
		n2 = new RationalNumber(1, 9);
		n1 = n1.add(n2);
		System.out.println(n1);
		
		// 1/200000 + 1/300000 = 1/120000
		n1 = new RationalNumber(1, 200000);
		n2 = new RationalNumber(1, 300000);
		n1 = n1.add(n2);
		System.out.println(n1);
		
		// 1/2 - 1/4 = 1/4
		n1 = new RationalNumber(1, 2);
		n2 = new RationalNumber(1, 4);
		n1 = n1.subtract(n2);
		System.out.println(n1);
		
		// 4/17 * 17/4 = 1/1
		n1 = new RationalNumber(4, 17);
		n2 = new RationalNumber(17, 4);
		n1 = n1.multiply(n2);
		System.out.println(n1);

		// 1/2 / 1/4 = 2/1
		n1 = new RationalNumber(1, 2);
		n2 = new RationalNumber(1, 4);
		n1 = n1.divide(n2);
		System.out.println(n1);
	}

}
