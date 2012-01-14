package ex03;

/**
 * Class to represent a primitive counter with methods to increase and decrease
 * the current counter value.
 * 
 * @author simon
 * @since 13.01.2012
 * 
 */
public class Counter {

	/**
	 * Private variable to hold the current value
	 */
	private int count = 0;

	/**
	 * Method to increase the value of the counter by 1.
	 */
	public void increase() {
		count++;
	}

	/**
	 * Method to decrease the value of the counter by 1.
	 */
	public void decrease() {
		count--;
	}

	/**
	 * Method to get the current value of the counter.
	 * 
	 * @return The current value of the counter.
	 */
	public int getCount() {
		return count;
	}
}
