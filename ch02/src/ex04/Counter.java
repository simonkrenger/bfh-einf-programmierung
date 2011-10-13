package ex04;

/**
 * A simple class for a counter
 * 
 * @author simon
 * @since 2011.10.07
 * 
 */
public class Counter {

	/**
	 * Current value of the counter
	 */
	private int value;

	/**
	 * Simple constructor for the class. Initial value of the counter is 0.
	 */
	public Counter() {
		this.value = 0;
	}

	/**
	 * Constructor for the class with a specific inital value.
	 * 
	 * @param initialValue
	 *            Start value for the counter
	 */
	public Counter(int initialValue) {
		this.value = initialValue;
	}

	/**
	 * Get the current value of the counter.
	 * 
	 * @return The current value of the counter.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * Increases the value of the counter by 1.
	 */
	public void count() {
		this.value += 1;
	}

	/**
	 * Increases the value of the counter by n.
	 */
	public void count(int n) {
		this.value += n;
	}
	
	/**
	 * Resets the counter to 0.
	 */
	public void reset() {
		this.value = 0;
	}
}
