/**
 * 
 */
package ex01;

import java.util.Random;

/**
 * Demonstration exercise for filling random numbers into arrays
 * 
 * @author simon
 * @since 11.11.2011
 * 
 */
public class RandomArrayTester {

	/**
	 * Size of our arrays
	 */
	private static int ARRAY_SIZE = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Random r = new Random();

		/*
		 * Fill array with random values
		 */
		int[] firstArray = new int[ARRAY_SIZE];
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = r.nextInt(ARRAY_SIZE) + 1;
		}

		/*
		 * One method for inserting unique values using a method
		 */
		int[] secondArray = new int[ARRAY_SIZE];
		for (int i = 0; i < secondArray.length; i++) {
			int randomNumber = r.nextInt(ARRAY_SIZE) + 1;
			while (exists(secondArray, randomNumber, i))
				randomNumber = r.nextInt(ARRAY_SIZE) + 1;
			secondArray[i] = randomNumber;
		}

		/*
		 * Solution the teacher provided. Pretty much the same as my solution
		 * above, just without the method call.
		 */
		int[] teacherSolution = new int[ARRAY_SIZE];
		for (int i = 0; i < teacherSolution.length; i++) {
			int randomNumber;
			boolean exists;
			do {
				exists = false;
				randomNumber = r.nextInt(ARRAY_SIZE) + 1;
				for (int j = 0; j < i; j++) {
					if (randomNumber == teacherSolution[j]) {
						exists = true;
						break;
					}
				}
			} while (exists);
			teacherSolution[i] = randomNumber;
		}

		/*
		 * Print the two arrays for verification
		 */
		printArray(firstArray);
		printArray(secondArray);
		printArray(teacherSolution);

	}

	/**
	 * Method for printing an integer array to STDOUT
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
	 * Method for checking if a value already exists in an array.
	 * Not used in this example
	 * 
	 * @param values
	 *            The array that will be inspected and searched through
	 * @param number
	 *            This number will be searched
	 * @return Returns true if the value exists in the provided array, returns
	 *         false if the value does not exist
	 */
	@SuppressWarnings("unused")
	private static boolean exists(int[] values, int number) {
		for (int j = 0; j < values.length; j++) {
			if (values[j] == number)
				return true;
		}
		return false;
	}

	/**
	 * Method for checking if a value already exists in an array.
	 * @param values The array that will be inspected and searched through
	 * @param number This number will be searched
	 * @param maxIndex The search is linear and will stop at this index
	 * @return Returns true if the value exists in the provided array, returns
	 *         false if the value does not exist
	 */
	private static boolean exists(int[] values, int number, int maxIndex) {
		for (int j = 0; j < maxIndex; j++) {
			if (values[j] == number)
				return true;
		}
		return false;
	}

}
