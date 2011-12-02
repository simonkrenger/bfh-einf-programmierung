package ch.bfh.krens1.exam01;

import java.util.Arrays;

/**
 * Class to represent a stack realised with arrays.
 * 
 * @author simon
 * @since 02.12.2011
 * 
 */
public class StringStackArray {

	private String[] stack = null;

	/**
	 * Size by which the stack will be increased when the stack is full. Also
	 * the initial size
	 */
	private static final int INCREMENT = 10;

	private int stackPointer = 0;

	public StringStackArray() {
		stack = new String[INCREMENT];
		this.stackPointer = 0;
	}

	public void push(String str) {
		if (size() >= stack.length)
			stack = Arrays.copyOf(stack, stack.length + INCREMENT);
		stack[stackPointer] = str;
		stackPointer++;
	}

	public String pop() {
		if (this.stackPointer <= 0) {
			System.err.println("No elements to pop!");
			return null;
		} else {
			String temp = stack[stackPointer - 1];
			stack[stackPointer - 1] = null;
			stackPointer--;
			return temp;
		}
	}

	/**
	 * Calculates the size of the stack
	 * 
	 * @return The size of the stack
	 */
	public int size() {
		int size = 0;
		for (int i = 0; i < stack.length; i++) {
			if (stack[i] != null)
				size++;
		}
		return size;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StringStackArray [stack=" + Arrays.toString(stack)
				+ ", stackPointer=" + stackPointer + "]";
	}

}
