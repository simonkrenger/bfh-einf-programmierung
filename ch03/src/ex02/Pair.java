package ex02;

/**
 * Represents a pair of two integer numbers.
 * There are additional methods for performing certain calculations.
 * 
 * @author simon
 * @since 17.10.2011
 *
 */
public class Pair {

	private int number1;
	private int number2;
	
	/**
	 * Constructor for Pair class, takes two numbers to perform calculations.
	 * 
	 * @param number1 First number
	 * @param number2 Second number
	 */
	public Pair(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pair [number1=" + number1 + ", number2=" + number2 + "]";
	}
	
	/**
	 * @return The first number (number1)
	 */
	public int getFirstNumber() {
		return number1;
	}

	/**
	 * @param number1 Sets the first number
	 */
	public void setFirstNumber(int number1) {
		this.number1 = number1;
	}

	/**
	 * @return The second number (number2)
	 */
	public int getSecondNumber() {
		return number2;
	}

	/**
	 * @param number2 Sets the second number
	 */
	public void setSecondNumber(int number2) {
		this.number2 = number2;
	}

	/**
	 * Calculates the sum of the two numbers.
	 * @return The sum of the two numbers
	 */
	public int getSum() {
		return number1 + number2;
	}
	
	/**
	 * Calculates the difference of the two numbers.
	 * The calculation subtracts the second number from the first number.
	 * @return The difference between the two numbers
	 */
	public int getDifference() {
		return number1 - number2;
	}
	
	/**
	 * Calculates the product of the two numbers.
	 * @return The product of the two numbers.
	 */
	public int getProduct() {
		return number1 * number2;
	}
	
	/**
	 * Calculates the average of the two numbers.
	 * @return The average of the two numbers as a double
	 */
	public double getAverage() {
		return ((double) getSum()) / 2;
	}
	
	/**
	 * Calculates the absolute value of the difference of the two numbers.
	 * @return The absolute value of the difference.
	 */
	public int getDistance() {
		return Math.abs(getDifference());
	}
	
	/**
	 * Gets the larger of the two numbers.
	 * @return The larger number of the two
	 */
	public int getMaximum() {
		return Math.max(number1, number2);
	}
	
	/**
	 * Gets the smaller of the two numbers.
	 * @return The smaller number of the two
	 */
	public int getMinimum() {
		return Math.min(number1, number2);
	}
}
