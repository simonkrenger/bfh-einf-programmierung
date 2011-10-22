package ex01;

/**
 * A class for a quadratic equations.
 * Can calculate all the real solutions of a quadratic equation.
 * @author simon
 * @since 21.10.2011
 * 
 */
public class QuadraticEquation {

	/**
	 * Holds the coefficient a
	 */
	private double a;
	
	/**
	 * Holds the coefficient b
	 */
	private double b;
	
	/**
	 * Holds the coefficient c
	 */
	private double c;

	/**
	 * If applicable, holds the first solution
	 */
	private double solution1 = 0;
	
	/**
	 * If applicable, holds the second solution
	 */
	private double solution2 = 0;

	/**
	 * Constructs a QuadraticEquation object with the three coefficients a, b and c
	 * @param a The first coefficient (a*x^2)
	 * @param b The second coefficient (b*x)
	 * @param c The third coefficient (c)
	 */
	public QuadraticEquation(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;

		this.compute();
	}

	/**
	 * Constructs a QuadraticEquation object with the three coefficients a, b and c
	 * @param a The first coefficient (a*x^2)
	 * @param b The second coefficient (b*x)
	 * @param c The third coefficient (c)
	 */
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;

		this.compute();
	}

	/**
	 * Internal method for computing the results of the quadratic equation.
	 * The private variables "solution1" and "solution2" will be calculated.
	 * Solutions are saved 
	 */
	private void compute() {
		
		// First, check if there are any solutions at all
		if (this.hasSolution()) {
			double disc = b*b - 4*a*c;
			double x1 = (-b + Math.sqrt(disc)) / (2 * a);
			double x2 = (-b - Math.sqrt(disc)) / (2 * a);
			if (disc == 0) {
				// One solution
				this.solution2 = 0D;
				this.solution1 = x1;
			} else if (disc > 0) {
				// Two solutions
				if (x1 > x2) {
					this.solution1 = x1;
					this.solution2 = x2;
				} else {
					this.solution1 = x2;
					this.solution2 = x1;
				}
			}
		} else {
			// No solutions
			this.solution1 = 0D;
			this.solution2 = 0D;
		}
	}

	/**
	 * Checks if there are solutions to the provided quadratic equation.
	 * Prints an error if there are no solutions.
	 * @return TRUE if there is at least one solution, FALSE if there are no solutions.
	 */
	public boolean hasSolution() {
		// Check if (b^2-4ac) is >= 0
		if ((b * b - 4 * a * c) >= 0)
			return true;
		System.err.println("This equation has no solution!");
		return false;
	}

	/**
	 * Retrieves the first solution (x1) from the quadratic equation.
	 * Returns the smaller of the two solutions if applicable
	 * @return The first solution
	 */
	public double getSolution1() {
		return this.solution1;
	}

	/**
	 * Retrieves the second solution (x2) from the quadratic equation.
	 * Returns the larger of the two solutions if applicable
	 * @return The second solution
	 */
	public double getSolution2() {
		return this.solution2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuadraticEquation [a=" + a + ", b=" + b + ", c=" + c
				+ ", solution1=" + solution1 + ", solution2=" + solution2
				+ ", hasSolution()=" + hasSolution() + "]";
	}
}
