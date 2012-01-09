package ex02;

/**
 * Interface for a simple iterator. Features methods to check if the object has
 * a next object, get the next object and methods to reset the iterator.
 * 
 * @author simon
 * @since 09.01.2012
 * 
 */
public interface Iterator {

	/**
	 * Method to check if this iterator has a next object.
	 * @return TRUE if there is at least one more object and FALSE if there is none
	 */
	boolean hasNext();

	/**
	 * Method to retrieve the next object.
	 * @return The object from the iterator
	 */
	Object next();

	/**
	 * Method to reset the iterator.
	 */
	void reset();
}
