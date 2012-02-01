package ch.bfh.krens1.exam02.ex02;

/**
 * Calculator class to perform simple sum calculations
 * 
 * @author simon
 * @since 30.01.2012
 * 
 */
public class Calculator {

	/**
	 * Holds the sum internally
	 */
	private int sum;

	/**
	 * Holds what is on the display
	 */
	private String display;

	/**
	 * Operating mode: If this value is true, the calculator expects a new
	 * number.
	 */
	private boolean awaitsNewNumber;

	/**
	 * Constructor for the class
	 */
	public Calculator() {
		this.sum = 0;
		this.display = "0";
		this.awaitsNewNumber = true;
	}

	/**
	 * Method to actually perform the calculation.
	 */
	public void addDisplayToSum() {
		this.sum += Integer.parseInt(display);
		this.display = String.valueOf(this.sum);
		this.awaitsNewNumber = true;
	}

	/**
	 * Append number to display
	 * 
	 * @param number
	 *            Number to be appended
	 */
	public void addNumber(String number) {
		if (this.awaitsNewNumber)
			this.display = "";
		this.display += number;
		this.awaitsNewNumber = false;
	}

	/**
	 * Method to check the operating mode
	 * 
	 * @return Returns TRUE if the calculator is expecting a new number
	 */
	public boolean isAwaitingNewNumber() {
		return awaitsNewNumber;
	}

	/**
	 * Resets the sum of the calculator Failed to include this on my paper :(
	 */
	public void reset() {
		this.sum = 0;
	}

	public int getSum() {
		return sum;
	}

	public String getDisplay() {
		return display;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Calculator [sum=" + sum + ", display=" + display
				+ ", awaitsNewNumber=" + awaitsNewNumber + "]";
	}

}
