/**
 * 
 */
package ex06;

/**
 * Class to represent a magic square. All rows and all columns of a magic square
 * have the same sum. This class allows the user to print a magic square of
 * desired size to STDOUT.
 * 
 * @author simon
 * @since 21.11.2011
 * 
 */
public class MagicSquare {

	/**
	 * Variable to hold the square size
	 */
	private int squareSize = 0;

	/**
	 * Represents an array that will hold the values of the magic square
	 */
	private int[][] magicSquare = null;

	/**
	 * Constructor for the class that takes the size of the magic square as an
	 * argument. The magic square will have the size n*n, where n is the
	 * argument given.
	 * 
	 * @param size
	 *            The size of the magic square.
	 */
	public MagicSquare(int size) {
		if (size % 2 == 0) {
			System.err.println("The size you gave is not odd. Using size="
					+ size + 1);
			size += 1;
		}

		this.squareSize = size;
		this.magicSquare = new int[squareSize][squareSize];

		// Fill the magic square with magic numbers (It's magic!)
		fillSquare();
	}

	/**
	 * Method to fill the magic square with numbers. So this is where the magic
	 * happens.
	 */
	private void fillSquare() {

		// The last number will be squareSize^2
		int lastNumber = squareSize * squareSize;
		int currentX = 0;
		int currentY = 0;

		for (int counter = 1; counter <= lastNumber; counter++) {
			// Rule 1: Place a 1 in the middle of the bottom row
			if (counter == 1) {
				currentX = (squareSize / 2);
				currentY = squareSize - 1;
			} else {
				// Rule 2: Check if we need to wrap around
				if (currentX + 1 >= squareSize || currentY + 1 >= squareSize) {
					if (currentX + 1 >= squareSize) {
						// Set to -1 so we get 0 after incrementing
						currentX = -1;
					}
					if (currentY + 1 >= squareSize) {
						// Set to -1 so we get 0 after incrementing
						currentY = -1;
					}
				}

				// Go one down and one to the right
				currentX++;
				currentY++;

				// Rule 3: Check if that cell is already filled
				if (magicSquare[currentX][currentY] != 0)
					currentY--;
			}
			magicSquare[currentX][currentY] = counter;

			// print(); // Debug
			// System.out.println("---------"); // Debug
		}
	}

	/**
	 * Calculates the magic number of the square (the sum of a column or a row)
	 * 
	 * @return The magic number
	 */
	public int magicNumber() {
		return squareSize * (squareSize * squareSize + 1) / 2;
	}

	/**
	 * Checks if this magic square is actually magic by calculating the magic
	 * number and then checking if the sum of all rows are equal to
	 * that magic number.
	 * 
	 * @return Returns true if all sums are equal to the magic number
	 */
	public boolean isMagic() {
		int magicNumber = magicNumber();

		// Check all rows
		for (int y = 0; y < squareSize; y++) {
			int value = 0;
			for (int x = 0; x < squareSize; x++)
				value += magicSquare[x][y];
			if (value != magicNumber)
				return false;
		}
		return true;
	}

	/**
	 * Prints the magic square for your viewing pleasure.
	 */
	public void print() {
		for (int y = 0; y < squareSize; y++) {
			System.out.print("[ ");
			for (int x = 0; x < squareSize; x++) {
				System.out.print(magicSquare[x][y] + " ");
			}
			System.out.println("]");
		}
	}
}
