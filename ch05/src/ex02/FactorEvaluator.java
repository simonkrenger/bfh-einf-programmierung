package ex02;

/**
 * Class to evaluate the prime factors for a number. Provides a single method to
 * print the factors of a number. Note that these implementations do not work
 * for n=1, so these solutions are not really complete.
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
		 * http://stackoverflow.com/questions
		 * /6223477/how-to-factor-a-number-java But I added some comments and
		 * simplified it a bit.
		 */

		for (int i = 2; i <= val; i++) {

			if (val % i == 0) {
				System.out.println(i);
				val /= i;

				// The factor can be found two times, so lets check it again in
				// the next iteration. But changing the running variable of the
				// "for" is generally a bad idea.
				i--;
			}
		}
	}

	/**
	 * Teachers solution for the problem. Prints the factors of a number in
	 * ascending order.
	 * 
	 * @param n
	 *            The number to be factored
	 */
	public static void printFactorsTeacher(int n) {
		int div = 2;
		do {
			if (n % div == 0) {
				System.out.println(div);
				n = n / div;
			} else {
				div++;
			}
		} while (div <= n);
	}
}
