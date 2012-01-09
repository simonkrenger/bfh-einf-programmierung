package ex02;

import java.util.ArrayList;

/**
 * Class to represent an iterator that iterates through an ArrayList of strings
 * (So basically a string list).
 * 
 * @author simon
 * @since 09.01.2012
 * 
 */
public class StringListIterator implements Iterator {

	/**
	 * Local reference to the string list
	 */
	private ArrayList<String> strList = null;

	/**
	 * Current index for the iterator
	 */
	private int curIdx = 0;

	/**
	 * Constrctor for the class, takes a string list as an argument
	 * @param list The list of strings that will be iterated through
	 */
	public StringListIterator(ArrayList<String> list) {
		strList = list;
	}

	@Override
	public boolean hasNext() {
		if (curIdx < strList.size())
			return true;
		return false;
	}

	@Override
	public Object next() {
		return strList.get(curIdx++);
	}

	@Override
	public void reset() {
		curIdx = 0;
	}

}
