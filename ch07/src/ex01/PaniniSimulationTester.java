/**
 * 
 */
package ex01;

/**
 * Main class to run a PaniniSimulation.
 * 
 * @author simon
 * @since 16.12.2011
 * 
 */
public class PaniniSimulationTester {

	/**
	 * Constant that specifies the number of children in the simulation
	 */
	private static final int NUMBER_OF_CHILDREN = 5;

	/**
	 * Constant to specify the number of teams in the simulation
	 */
	private static final int NUMBER_OF_TEAMS = 10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PaniniSimulation ps = new PaniniSimulation(NUMBER_OF_CHILDREN,
				NUMBER_OF_TEAMS);
		ps.run();
	}

}
