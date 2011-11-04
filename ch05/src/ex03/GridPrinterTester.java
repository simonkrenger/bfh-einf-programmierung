/**
 * 
 */
package ex03;

/**
 * Tester class for the GridPrinter class.
 * 
 * @author simon
 * @since 04.11.2011
 * 
 */
public class GridPrinterTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GridPrinter gp = new GridPrinter();

		// Prints a grid with 4 rows and 9 columns
		gp.printGrid(4, 9);

		// Prints a grid with 3 rows and 6 columns and a cell size of 3
		gp.printGrid(3, 6, 3);

	}

}
