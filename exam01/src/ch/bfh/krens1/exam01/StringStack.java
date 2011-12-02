/**
 * 
 */
package ch.bfh.krens1.exam01;

import java.util.ArrayList;

/**
 * Class to implement a stack to save Strings
 * 
 * @author simon
 * @since 02.12.2011
 * 
 */
public class StringStack {

	/**
	 * ArrayList to hold the stack
	 */
	private ArrayList<String> stack = null;

	/**
	 * Constructor for the class, initialises a new StringStack
	 */
	public StringStack() {
		stack = new ArrayList<String>();
	}

	/**
	 * Method to add a new String on top of the stack.
	 * 
	 * @param str
	 *            The String to put on top of the stack
	 */
	public void push(String str) {
		stack.add(str);
	}

	/**
	 * Method to pop the top element from the stack
	 * 
	 * @return Returns the top element of the stack
	 */
	public String pop() {
		if (stack.isEmpty())
			return null;
		return stack.remove(stack.size() - 1);
	}

	/**
	 * Calculation of the size of the stack
	 * 
	 * @return The current size of the stack
	 */
	public int size() {
		return stack.size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StringStack [stack=" + stack + "]";
	}
}
