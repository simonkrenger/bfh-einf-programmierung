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
		
		int x = (squareSize / 2);
		int y = squareSize - 1;

		// The last number will be squareSize^2
		for (int counter = 1; counter <= (squareSize * squareSize); counter++) {

			magicSquare[x][y] = counter;

			// System.out.println(this); // Debug
			// System.out.println("---------"); // Debug

			int newX = (x + 1) % squareSize;
			int newY = (y + 1) % squareSize;

			if (magicSquare[newX][newY] == 0) {
				x = newX;
				y = newY;
			} else {
				y--;
			}
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
	 * number and then checking if the sum of all rows, columns and diagonals
	 * are equal to that magic number.
	 * 
	 * @return Returns true if all sums are equal to the magic number
	 */
	public boolean isMagic() {
		int magicNumber = magicNumber();

		int checkValue = 0;

		// Check all rows
		for (int y = 0; y < squareSize; y++) {
			checkValue = 0;
			for (int x = 0; x < squareSize; x++)
				checkValue += magicSquare[x][y];
			if (checkValue != magicNumber)
				return false;
		}

		// Check all columns
		for (int x = 0; x < squareSize; x++) {
			checkValue = 0;
			for (int y = 0; y < squareSize; y++)
				checkValue += magicSquare[x][y];
			if (checkValue != magicNumber)
				return false;
		}

		// Check two diagonals
		checkValue = 0;
		for (int n = 0; n < squareSize; n++)
			checkValue += magicSquare[n][n];
		if (checkValue != magicNumber)
			return false;

		checkValue = 0;
		for (int n = 0; n < squareSize; n++)
			checkValue += magicSquare[squareSize - 1 - n][squareSize - 1 - n];
		if (checkValue != magicNumber)
			return false;

		return true;
	}

	/**
	 * Prints the magic square for your viewing pleasure.
	 * 
	 * @return
	 */
	public String toString() {
		String output = "";
		for (int y = 0; y < squareSize; y++) {
			output += "[ ";
			for (int x = 0; x < squareSize; x++) {
				output += magicSquare[x][y] + " ";
			}
			output += "]\n";
		}
		return output;
	}
}
