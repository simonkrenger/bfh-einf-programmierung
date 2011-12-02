/**
 * 
 */
package ch.bfh.krens1.exam01;

import java.util.ArrayList;

/**
 * Class to implement a stack to save Strings
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
	 * Pointer to identify the last entry
	 */
	private int stackPointer = 0;

	/**
	 * Constructor for the class, initialises a new StringStack
	 */
	public StringStack() {
		stack = new ArrayList<String>();
		stackPointer = 0;
	}

	/**
	 * Method to add a new String on top of the stack.
	 * @param str The String to put on top of the stack
	 */
	public void push(String str) {
		stack.add(str);
		this.stackPointer++;
	}

	/**
	 * Method to pop the top element from the stack
	 * @return Returns the top element of the stack
	 */
	public String pop() {
		if (this.stackPointer <= 0) {
			System.err.println("No more elements to pop!");
			return null;
		} else {
			String temp = stack.get(stackPointer - 1);
			stack.remove(stackPointer - 1);
			this.stackPointer--;
			return temp;
		}
	}

	/**
	 * Calculation of the size of the stack
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
		return "StringStack [stack=" + stack + ", stackPointer=" + stackPointer
				+ "]";
	}
}
