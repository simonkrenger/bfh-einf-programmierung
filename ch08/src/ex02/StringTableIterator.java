package ex02;

/**
 * Iterator for a two-dimensional array (a table) of strings.
 * 
 * @author simon
 * @since 09.01.2012
 * 
 */
public class StringTableIterator implements Iterator {

	/**
	 * Local reference to the two-dimensinal array
	 */
	private String[][] table = null;

	/**
	 * Current row of the iterator in the table
	 */
	private int nextRow = 0;

	/**
	 * Current column of the iterator in the table
	 */
	private int nextCol = 0;

	/**
	 * Constructor for the class, takes the table as an argument
	 * @param strTable The table that will be iterated through
	 */
	public StringTableIterator(String[][] strTable) {
		table = strTable;
	}

	@Override
	public boolean hasNext() {
		// Check if there is a next
		if (nextCol < table[0].length && nextRow < table.length)
			return true;
		return false;
	}

	@Override
	public Object next() {
		String temp = table[nextRow][nextCol];
		
		// Prepare next
		if(nextCol + 1 == table[0].length) {
			nextCol = 0;
			nextRow++;
		} else {
			nextCol++;
		}
		
		return temp;
	}

	@Override
	public void reset() {
		nextCol = 0;
		nextRow = 0;
	}

}
