package ex03;

import java.util.Random;

/**
 * 
 */

/**
 * Program to roll the dice and identify the runs
 * 
 * @author simon
 * @since 11.11.2011
 * 
 */
public class DiceRuns {

	private static int NUMBER_OF_ROLLS = 20;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] dice = new int[NUMBER_OF_ROLLS];

		// Roll the dice!
		Random generator = new Random();
		for (int i = 0; i < dice.length; i++)
			dice[i] = generator.nextInt(5) + 1;
		printArray(dice);

		// Now lets identify the runs
		printRuns(dice);
	}

	/**
	 * Prints an integer array nicely formatted to STDOUT
	 * 
	 * @param array
	 *            The array to be printed
	 */
	private static void printArray(int[] array) {
		System.out.print("int[] = [ ");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("]");
	}

	/**
	 * Teachers solution for printing the array with the runs to STDOUT
	 * 
	 * @param array
	 *            The array to be analysed
	 */
	private static void printRuns(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i < array.length - 1 && array[i] == array[i + 1]
					&& (i == 0 || array[i] != array[i - 1]))
				System.out.print("(");
			System.out.print(array[i]);
			if (i > 0 && array[i] == array[i - 1]
					&& (i == array.length - 1 || array[i] != array[i + 1]))
				System.out.print(")");
			if (i < array.length - 1)
				System.out.print(" ");
		}
	}

}
