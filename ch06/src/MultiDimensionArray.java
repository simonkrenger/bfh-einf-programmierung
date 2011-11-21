/**
 * 
 */

/**
 * @author simon
 *
 */
public class MultiDimensionArray {

	private static final int COLUMNS = 10;
	
	private static final int ROWS = 10;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[][] table = new String[COLUMNS][ROWS];
		
		for(int x=0; x <  table.length; x++) {
			for(int y=0; y < table[x].length; y++) {
				table[x][y] = "TEST";
			}
		}
		
		for(String[] currentRow : table) {
			System.out.print("[ ");
			for(String currentCol : currentRow) {
				System.out.print(currentCol + " ");
			}
			System.out.println("]");
		}

	}

}
