package ex04;

import java.util.Arrays;

/**
 * Implements an extended IntegerList with additional capabilities such as
 * swapping, getting the position of a certain element, reversing the list or
 * sorting the list. The IntegerList was provided by the teacher, Rolf Haenni.
 * 
 * 
 * @author Rolf Haenni, simon
 * @since 18.11.2011
 * 
 */
public class ExtendedIntegerList {
	/**
	 * Initial size of the internal array when constructing the class
	 */
	final static int INITIAL_SIZE = 10;

	/**
	 * Integer array to hold our elements
	 */
	private int[] integers;

	/**
	 * Size of the list
	 */
	private int size;

	/**
	 * Constructor for the class. Constructs a new ExtendedIntegerList with
	 * initial size 0 (Well, there are no elements in it).
	 */
	public ExtendedIntegerList() {
		integers = new int[INITIAL_SIZE];
		size = 0;
	}

	/**
	 * Method for adding an element to the list. This method adds the element at
	 * the end of the list.
	 * 
	 * @param x
	 *            The element to be added to the list
	 * @return Returns a message if the element was added or not
	 */
	public String add(int x) {
		if (size == integers.length)
			integers = Arrays.copyOf(integers, 2 * integers.length);
		integers[size] = x;
		size++;
		return "Element added";
	}

	/**
	 * Inserts a new element at a certain position.
	 * 
	 * @param x
	 *            The new element
	 * @param position
	 *            The new element will be added at this position
	 * @return Returns a string if the insert succeeded or not
	 */
	public String insert(int x, int position) {
		if (position < 0 || position > size)
			return "Invalid Position";
		if (size == integers.length)
			integers = Arrays.copyOf(integers, 2 * integers.length);
		for (int i = size; i > position; i--)
			integers[i] = integers[i - 1];
		integers[position] = x;
		size++;
		return "Element inserted";
	}

	/**
	 * Method for removing a certain element from the list. The method takes the
	 * position as an argument.
	 * 
	 * @param position
	 *            This position will be removed
	 * @return Returns a message if the removal was successful
	 */
	public String remove(int position) {
		if (position < 0 || position > size - 1)
			return "Invalid Position";
		for (int i = position; i < size - 1; i++)
			integers[i] = integers[i + 1];
		size--;
		return "Element removed";
	}

	/**
	 * Prints the contents of the list with nicely formatted brackets.
	 */
	public void printList() {
		System.out.print("< ");
		for (int i = 0; i < size; i++)
			System.out.printf("%1d ", integers[i]);
		System.out.println(">");
	}

	/**
	 * Gets the position of a certain element in the list.
	 * 
	 * @param x
	 *            This element will be looked for in the list
	 * @return The position of the element, returns -1 if the element was not
	 *         found
	 */
	public int position(int x) {
		for (int i = 0; i < size; i++) {
			if (integers[i] == x)
				return i;
		}
		return -1;
	}

	/**
	 * Method for checking if the list contains an element
	 * 
	 * @param x
	 *            This element will be looked for
	 * @return Returns true if the element was found or false if there is no
	 *         such element
	 */
	public boolean contains(int x) {
		return (position(x) != -1);
	}

	/**
	 * Method for swapping two positions
	 * 
	 * @param x
	 *            First position
	 * @param y
	 *            Second position
	 * @return Returns a message if the swap was successful
	 */
	public String swap(int x, int y) {
		if ((x < 0 || x > size - 1) || (y < 0 || y > size - 1))
			return "Invalid position";
		doSwap(x, y);
		return "Positions " + x + " and " + y + " swapped";
	}

	/**
	 * Private method for swapping two positions of an array. Assumes that the
	 * two positions are valid
	 * 
	 * @param x
	 *            First position
	 * @param y
	 *            Second position
	 */
	private void doSwap(int x, int y) {
		int temp = integers[x];
		integers[x] = integers[y];
		integers[y] = temp;
	}

	/**
	 * Reverses the list
	 */
	public void reverse() {
		int[] tempList = new int[size];
		for (int i = size - 1; i >= 0; i--) {
			tempList[(size - 1) - i] = integers[i];
		}
		integers = Arrays.copyOf(tempList, size);
	}

	/**
	 * Method for sorting the list in ascending order using the Bubblesort
	 * algorithm. The pseudocode was taken from the following site and then
	 * implemented:
	 * http://en.wikipedia.org/wiki/Bubble_sort#Optimizing_bubble_sort
	 */
	public void bubblesort() {
		int n = size;
		do {
			int newn = 0;
			for (int i = 1; i < size; i++) {
				if (integers[i - 1] > integers[i]) {
					doSwap(i - 1, i);
					newn = i;
				}
			}
			n = newn;
		} while (n > 0);
	}

	/**
	 * Non-optimized version of a bubblesort algorithm implemented while in the
	 * classroom.
	 */
	public void sort() {
		for(int steps = size-1; steps >=0; steps--) {
			for(int j=0; j< steps; j++) {
				if(integers[j] > integers[j+1])
					doSwap(j, j+1);
			}
		}
	}
	
	/**
	 * Reads the size of the list
	 * 
	 * @return The size of the list
	 */
	public int size() {
		return size;
	}
}
