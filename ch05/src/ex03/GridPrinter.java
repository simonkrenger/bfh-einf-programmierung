package ex03;

/**
 * A class that provides methods for printing grids to STDOUT. The methods allow
 * for the number of rows and columns to be specified.
 * 
 * @author simon
 * @since 04.11.2011
 * 
 */
public class GridPrinter {

	/**
	 * Method to print a simple grid with the specified numbers of rows and
	 * columns. The cells have the height of 1 (width and height).
	 * 
	 * @param rows
	 *            The number of rows
	 * @param columns
	 *            The number of columns
	 */
	public void printGrid(int rows, int columns) {
		for (int rowCnt = 0; rowCnt < rows; rowCnt++) {
			for (int cCnt = 0; cCnt < columns; cCnt++) {
				System.out.print("+-");
				if (cCnt == columns - 1)
					System.out.println("+");

			}
			for (int colCnt = 0; colCnt < columns; colCnt++) {
				System.out.print("| ");
				if (colCnt == columns - 1)
					System.out.println("|");
			}
		}
		
		// Print the last border
		for (int colCnt = 0; colCnt < columns; colCnt++) {
			System.out.print("+-");
			if (colCnt == columns - 1)
				System.out.println("+");
		}
	}
	
	/* Alternative for the method above:
	public void printGrid(int rows, int columns) {
		this.printGrid(rows, columns, 1);
	}
	 */
	

	/**
	 * Method to print a grid with the specified number of rows and columns and
	 * a specified cell size (height and width).
	 * 
	 * @param rows
	 *            The number of rows to be printed
	 * @param columns
	 *            The number of columns to be printed
	 * @param cellSize
	 *            Height and width of a single cell
	 */
	public void printGrid(int rows, int columns, int cellSize) {
		for (int rowCnt = 0; rowCnt < rows; rowCnt++) {
			for (int colCnt = 0; colCnt < columns; colCnt++) {
				System.out.print("+");
				for (int cellWidth = 0; cellWidth < cellSize; cellWidth++) {
					System.out.print("-");
				}
				if (colCnt == columns - 1)
					System.out.println("+");
			}
			for (int cellHeight = 0; cellHeight < cellSize; cellHeight++) {
				for (int colCnt = 0; colCnt < columns; colCnt++) {
					System.out.print("|");
					for (int cellWidth = 0; cellWidth < cellSize; cellWidth++) {
						System.out.print(" ");
					}
					if (colCnt == columns - 1)
						System.out.println("|");
				}
			}
		}

		// Print the last border
		for (int colCnt = 0; colCnt < columns; colCnt++) {
			System.out.print("+");
			for (int cellWidth = 0; cellWidth < cellSize; cellWidth++) {
				System.out.print("-");
			}
			if (colCnt == columns - 1)
				System.out.println("+");
		}
	}
}
