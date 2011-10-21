package ex03;

/**
 * Dataset class for statistics. Provides methods for calculation of the sum,
 * average, maximum value and minimum value.
 * 
 * @author simon
 * 
 */
public class DataSet {

	/**
	 * Holds the sum of all values in the dataset.
	 */
	private int sum;

	/**
	 * Holds the largest value of all values in the dataset.
	 */
	private int max_value;

	/**
	 * Holds the smallest value of all values in the dataset.
	 */
	private int min_value;

	/**
	 * Holds the number of values in the dataset.
	 */
	private int count;

	/**
	 * Constructor for an empty dataset. Initializes the sum and the number of
	 * items to 0. The initially largest value in the dataset is
	 * Integer.MIN_VALUE. The initially smallest value in the dataset is
	 * Integer.MAX_VALUE.
	 */
	public DataSet() {
		this.sum = 0;
		this.count = 0;
		this.max_value = Integer.MIN_VALUE;
		this.min_value = Integer.MAX_VALUE;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataSet [sum=" + sum + ", max_value=" + max_value
				+ ", min_value=" + min_value + ", count=" + count
				+ ", getAverage()=" + getAverage() + "]";
	}



	/**
	 * Adds a new value to the dataset.
	 * 
	 * @param x
	 *            The value to be added to the dataset.
	 */
	public void addValue(int x) {
		count++;
		this.sum += x;
		max_value = Math.max(x, max_value);
		min_value = Math.min(x, min_value);
	}

	/**
	 * Calculates the sum of all values in the dataset.
	 * 
	 * @return The sum of all values in the dataset.
	 */
	public int getSum() {
		return this.sum;
	}

	/**
	 * Calculates the average of all values in the dataset.
	 * 
	 * @return The average of all values in the dataset.
	 */
	public double getAverage() {
		return (double) getSum() / count;
	}

	/**
	 * Retrieves the largest number from the dataset.
	 * 
	 * @return The largest number in the dataset.
	 */
	public int getMax() {
		return this.max_value;
	}

	/**
	 * Retrieves the smallest number from the dataset.
	 * 
	 * @return The largest number in the dataset.
	 */
	public int getMin() {
		return this.min_value;
	}
}
