/**
 * 
 */
package ex04;


/**
 * Class for positive rational numbers.
 * Internal implementation with long variables for added precision.
 * 
 * @author simon
 * @since 20.10.2011
 * 
 */
public class RationalNumber {

	/**
	 * Holds the value of the numerator
	 */
	private long numerator;
	
	/**
	 * Holds the value of the denominator
	 */
	private long denominator;
	
	/**
	 * Constructor for the class with just an integer value.
	 * Instantiates a RationalNumber with the value of "value"
	 * @param value The integer value to be represented as RationalNumber
	 */
	public RationalNumber(int value) {
		this.numerator = value;
		this.denominator = 1;
	}

	/**
	 * Constructor for the class that takes two long values as the numerator and the denominator.
	 * @param numerator The numerator of the value
	 * @param denominator The denominator of the value
	 */
	public RationalNumber(long numerator, long denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	/**
	 * Constructor for the class that takes two integer values as the numerator and the denominator
	 * @param numerator The numerator of the value to be represented as a RationalNumber
	 * @param denominator The denominator of the value to be represented as a RationalNumber
	 */
	public RationalNumber(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}

	/**
	 * Helper function provided by the teacher to search the greatest common denominator.
	 * @param m First number
	 * @param n Second number
	 * @return The greatest common denominator
	 */
	private long gcd(long m, long n) {
		if (n == 0)
			return m;
		else
			return gcd(n, m % n);
	}
	
	/**
	 * Retreives the numerator of the rational number
	 * @return The numerator
	 */
	public long getNominator() {
		return this.numerator;
	}
	
	/**
	 * Retrieves the denominator of the rational number
	 * @return The denominator
	 */
	public long getDenominator() {
		return this.denominator;
	}
	
	/**
	 * Method used to reduce the rational number.
	 * @return The same rational number, but reduced
	 */
	public RationalNumber reduce() {
		long gcd = gcd(this.numerator, this.denominator);
		return new RationalNumber(this.numerator/gcd, this.denominator/gcd);
	}
	
	/**
	 * Method for performing an addition with another rational number
	 * @param number The number that is added to this rational number
	 * @return The result of the addition
	 */
	public RationalNumber add(RationalNumber number) {
		long multipliedDenominator = this.denominator * number.getDenominator();
		long firstNumerator = this.numerator * number.getDenominator();
		long secondNumerator = number.getNominator() * this.denominator;
		return new RationalNumber(firstNumerator + secondNumerator, multipliedDenominator).reduce();
	}
	
	/**
	 * Method for performing a subtraction with another rational number
	 * @param number The number that is subtracted from this rational number
	 * @return THe result of the subtraction.
	 */
	RationalNumber subtract(RationalNumber number) {
		long multipliedDenominator = this.denominator * number.getDenominator();
		long firstNumerator = this.numerator * number.getDenominator();
		long secondNumerator = number.getNominator() * this.denominator;
		return new RationalNumber(firstNumerator - secondNumerator, multipliedDenominator).reduce();
	}
	
	/**
	 * Method to perform a multiplication with another rational number
	 * @param x Number that is multiplied with this rational number
	 * @return The result of the multiplication
	 */
	RationalNumber multiply(RationalNumber x) {
		return new RationalNumber(this.numerator * x.getNominator(), this.denominator * x.getDenominator()).reduce();
	}
	
	/**
	 * Method to perform a divison with another rational number
	 * @param x The divisor
	 * @return The result of the division.
	 */
	RationalNumber divide(RationalNumber x) {
		return new RationalNumber(this.numerator * x.getDenominator(), this.denominator * x.getNominator()).reduce();
	}
	
	/**
	 * Computes the number as a Double.
	 * @return The rational number as a Double
	 */
	public double toDouble() {
		return (double) (numerator) / denominator;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RationalNumber [numerator=" + numerator + ", denominator="
				+ denominator + ", toDouble()=" + toDouble() + "]";
	}
}
