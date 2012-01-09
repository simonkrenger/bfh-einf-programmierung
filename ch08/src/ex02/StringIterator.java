package ex02;

/**
 * Class to represent an iterator for a string. The iterator iterates through
 * the string character by character.
 * 
 * @author simon
 * @since 09.01.2012
 * 
 */
public class StringIterator implements Iterator {

	/**
	 * Reference to the string to be iterated through
	 */
	private String str = null;

	/**
	 * Current index for the iterator
	 */
	private int curIdx = 0;

	/**
	 * Constructor for the class, takes the string to be iterated through as an argument
	 * @param str The string that will be iterated through
	 */
	public StringIterator(String str) {
		this.str = str;
	}

	@Override
	public boolean hasNext() {
		if (curIdx < str.length())
			return true;
		return false;
	}

	@Override
	public Object next() {
		return str.charAt(curIdx++);
	}

	@Override
	public void reset() {
		curIdx = 0;
	}

}
