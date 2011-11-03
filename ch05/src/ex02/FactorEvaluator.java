package ex02;

/**
 * Class to evaluate factors for a number. Provides a single method to print the
 * factors of a number.
 * 
 * @author simon
 * 
 */
public class FactorEvaluator {

	/**
	 * Prints the factors of a number in ascending order.
	 * 
	 * @param val
	 *            The number to be factored
	 */
	public static void printFactors(int val) {

		/*
		 * Ok, I admit it, I was lazy this time:
		 * http://stackoverflow.com/questions/6223477/how-to-factor-a-number-java
		 * But I added some comments and simplified it a bit.
		 */

		int end = val / 2;
		for (int i = 2; i <= end; i++) {

			if (val % i == 0) {
				System.out.println(i);
				val /= i;

				// The factor can be found two times, so lets check it again in
				// the next iteration
				i -= 1;
			}
		}
	}
}
