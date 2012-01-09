package ex02;

/**
 * Class to iterate through 0 to 9. The iterator begins at 0 and iterates though
 * all digits up to 9.
 * 
 * @author simon
 * @since 09.01.2012
 * 
 */
public class DigitsIterator implements Iterator {

	/**
	 * Array to hold all digits
	 */
	private int[] digits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	/**
	 * Current index of the iterator
	 */
	private int curIdx = 0;

	@Override
	public boolean hasNext() {
		if (curIdx < digits.length)
			return true;
		return false;
	}

	@Override
	public Object next() {
		return digits[curIdx++];
	}

	@Override
	public void reset() {
		curIdx = 0;
	}
}
