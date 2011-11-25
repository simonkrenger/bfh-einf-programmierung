package ex07;

import java.util.Random;

/**
 * Class to represent a game of life by John Horton Conway. The class provides
 * methods to query the status of the method or to place certain predefined
 * objects on the grid. There are also methods to calculate a new generation or
 * to create a random starting grid.
 * 
 * The grid for the Game of Life is implemented as a toroidal array.
 * 
 * http://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
 * 
 * @author simon
 * @since 25.11.2011
 * 
 */
public class GameOfLife {

	/**
	 * Holds the width of the grid
	 */
	private int width;

	/**
	 * Holds the height of the grid
	 */
	private int height;

	/**
	 * The grid itself as an integer array (easier to calculate neighbors)
	 */
	private int[][] cells;

	/**
	 * Constructor for the class. The arguments specify the size of the grid
	 * which holds the game itself
	 * 
	 * @param x
	 *            Width of the grid
	 * @param y
	 *            Height of the grid
	 */
	public GameOfLife(int x, int y) {
		width = x;
		height = y;
		cells = new int[x][y];
	}

	/**
	 * Returns the width of the grid
	 * 
	 * @return The width of the grid
	 */
	public int getWidth() {
		return this.width;
	}

	/**
	 * Returns the height of the grid
	 * 
	 * @return The height of the grid
	 */
	public int getHeight() {
		return this.height;
	}

	/**
	 * Method to set a certain cell to "1", or "alive"
	 * 
	 * @param x
	 *            X coordinate of the cell to be set
	 * @param y
	 *            Y coordinate of the cell to be set
	 */
	public void setCell(int x, int y) {
		cells[x][y] = 1;
	}

	/**
	 * Reads the grid and determines if the selected cell is alive or dead.
	 * 
	 * @param x
	 *            X coordinate of the cell to be checked
	 * @param y
	 *            Y coordinate of the cell to be checked
	 * @return Returns "1" if the cell is alive or "0" if the cell is dead
	 */
	public int getCell(int x, int y) {
		return cells[x][y];
	}

	/**
	 * Method for calculating the next generation of the grid. The new
	 * generation is calculated according to the preset rules of the Game of
	 * Life. Note that we are using a toroidal array as the grid for our game.
	 */
	public void nextGeneration() {
		int[][] nextGen = new int[width][height];

		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				int nCount = countNeighbors(x, y);

				// Apply the rules
				if (cells[x][y] == 1) {
					if (nCount == 2 || nCount == 3) {
						// Cell lives on if there are 2 or 3 neighbors
						nextGen[x][y] = 1;
					} else {
						// Cell dies otherwise
						nextGen[x][y] = 0;
					}
				} else {
					if (nCount == 3) {
						// A dead cell with 3 neighbors becomes a live cell
						nextGen[x][y] = 1;
					} else {
						nextGen[x][y] = 0;
					}
				}
			}
		}
		cells = nextGen;
	}

	/**
	 * Method to count the neighbors of a certain cell. This method is used to
	 * determine if a cell lives on or not
	 * 
	 * @param i
	 *            X coordinate of the cell to be checked
	 * @param j
	 *            Y coordinate of the cell to be checked
	 * @return The number of neighbors the specified cell has
	 */
	private int countNeighbors(int i, int j) {
		int neighborCount = 0;
		for (int x = -1; x < 2; x++) {
			for (int y = -1; y < 2; y++) {
				// Check if this is the cell itself
				if (!(x == 0 && y == 0)) {
					// Wrap around the borders
					int newX = (i + x) % width;
					int newY = (j + y) % height;

					// Javas modulo operation also returns negative integers
					if (newX < 0)
						newX = width + newX;
					if (newY < 0)
						newY = height + newY;

					neighborCount += cells[newX][newY];
				}
			}
		}
		return neighborCount;
	}

	/**
	 * Fills the grid with a random pattern
	 */
	public void createRandom() {
		Random rGen = new Random();
		for (int x = 0; x < width; x++) {
			for (int y = 0; y < height; y++) {
				cells[x][y] = rGen.nextInt() % 2;
			}
		}
	}

	/**
	 * Creates a "Blinker" at the specified coordinates
	 * 
	 * @param i
	 *            X coordinate of the object
	 * @param j
	 *            Y coordinate of the object
	 */
	public void createBlinker(int i, int j) {
		setCell(i, j);
		setCell(i + 1, j);
		setCell(i + 2, j);
	}

	/**
	 * Creates a "Glider" at the specified coordinates
	 * 
	 * @param i
	 *            X coordinate of the object
	 * @param j
	 *            Y coordinate of the object
	 */
	public void createGlider(int i, int j) {
		setCell(i, j);
		setCell(i + 1, j);
		setCell(i + 1, j - 2);
		setCell(i + 2, j);
		setCell(i + 2, j - 1);
	}

	/**
	 * Creates a "Pentomino" at the specified coordinates
	 * 
	 * @param i
	 *            X coordinate of the object
	 * @param j
	 *            Y coordinate of the object
	 */
	public void createPentomino(int i, int j) {
		setCell(i, j);
		setCell(i + 1, j);
		setCell(i + 1, j + 1);
		setCell(i + 1, j - 1);
		setCell(i + 2, j - 1);
	}

	/**
	 * Creates a square of live cells at the specified coordinates
	 * 
	 * @param i
	 *            X coordinate of the object
	 * @param j
	 *            Y coordinate of the object
	 */
	public void createSquare(int x, int y) {
		setCell(x, y);
		setCell(x, y + 1);
		setCell(x + 1, y);
		setCell(x + 1, y + 1);
	}

	/**
	 * Creates a "Gun" at the specified coordinates. See
	 * http://en.wikipedia.org/wiki/Gun_(cellular_automaton) for more
	 * information
	 * 
	 * @param i
	 *            X coordinate of the object
	 * @param j
	 *            Y coordinate of the object
	 */
	public void createGun(int x, int y) {
		createSquare(x, y + 4);

		setCell(x + 24, y);
		setCell(x + 24, y + 1);
		setCell(x + 22, y + 1);
		createSquare(x + 20, y + 2);
		createSquare(x + 20, y + 3);
		setCell(x + 22, y + 5);
		setCell(x + 24, y + 5);
		setCell(x + 24, y + 6);

		setCell(x + 12, y + 2);
		setCell(x + 13, y + 2);
		setCell(x + 11, y + 3);
		setCell(x + 10, y + 4);
		setCell(x + 10, y + 5);
		setCell(x + 10, y + 6);
		setCell(x + 11, y + 7);
		setCell(x + 12, y + 8);
		setCell(x + 13, y + 8);
		setCell(x + 14, y + 5);
		setCell(x + 15, y + 3);
		setCell(x + 16, y + 4);
		setCell(x + 16, y + 5);
		setCell(x + 16, y + 6);
		setCell(x + 15, y + 7);
		setCell(x + 17, y + 5);

		createSquare(x + 34, y + 2);
	}
}
