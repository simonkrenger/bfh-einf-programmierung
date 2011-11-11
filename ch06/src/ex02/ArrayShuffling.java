/**
 * 
 */
package ex02;

import java.util.Random;

/**
 * Class for shuffling an array. This class provides internal methods for
 * swapping and shuffling an array
 * 
 * @author simon
 * @since 11.11.2011
 * 
 */
public class ArrayShuffling {

	/**
	 * Size of the array to be generated and then shuffled
	 */
	private static int ARRAY_SIZE = 20;

	/**
	 * Defines how many random swaps will take place
	 */
	private static int THOROUGHNESS = 1000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] ordered = new int[ARRAY_SIZE];
		for (int i = 0; i < ordered.length; i++)
			ordered[i] = i + 1;

		printArray(ordered);

		// Shake it, baby!
		int[] shuffled = shuffle(ordered, THOROUGHNESS);
		printArray(shuffled);
	}

	/**
	 * Shuffles an integer array by randomly swapping two fields
	 * 
	 * @param arr
	 *            The array to be randomized
	 * @param iterations
	 *            This many random swaps will take place
	 * @return Returns the shuffled array
	 */
	private static int[] shuffle(int[] arr, int iterations) {

		Random generator = new Random();
		for (int i = 1; i <= iterations; i++) {
			arr = swap(arr, generator.nextInt(ARRAY_SIZE),
					generator.nextInt(ARRAY_SIZE));
		}
		return arr;
	}

	/**
	 * Swap two fields of an integer array
	 * 
	 * @param array
	 *            The operation will be performed on this array
	 * @param firstIndex
	 *            Index of first field
	 * @param secondIndex
	 *            Index of second field
	 * @return Returns the specified array with the two fields swapped
	 */
	private static int[] swap(int[] array, int firstIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
		return array;
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

}
