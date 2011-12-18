package ex01;

import java.util.Random;

import ex01.football.Tournament;

/**
 * Class to represent a simulation. Each simulation has parameters that
 * influence the output of the simulation. There is one tournament, one factory
 * and one shop per simulation.
 * 
 * @author simon
 * @since 16.12.2011
 * 
 */
public class PaniniSimulation {

	/**
	 * The schoolyard where all the children are.
	 */
	private Schoolyard yard;

	/**
	 * The tournament that is simulated
	 */
	private Tournament tournament;

	/**
	 * Constant that defines the maximum amount of pocket money a child can
	 * receive.
	 */
	private static final int MAX_POCKET_MONEY = 5;

	/**
	 * Constructor for the class, takes the number of children and the number of
	 * teams in the simulation as arguments
	 * 
	 * @param numberOfChildren
	 *            Children on the schoolyard
	 * @param numberOfTeams
	 *            Teams in the tournament
	 */
	public PaniniSimulation(int numberOfChildren, int numberOfTeams) {

		tournament = new Tournament(numberOfTeams);
		yard = new Schoolyard();

		// Set the series for the factory, so the factory knows what tournament
		// it has to produce pictures for
		Factory.getInstance().setSeries(tournament);

		for (int c = 0; c < numberOfChildren; c++) {
			yard.addChild(new Child());
		}

		// Debug information for tournament
		System.out.println(tournament);
	}

	/**
	 * Method to run the simulation. The simulation will be run until all
	 * children completed their albums.
	 */
	public void run() {

		// Variable hold the number of runs in a simulation
		int runNumber = 1;

		Random rand = new Random();

		do {
			System.out.println("Run number=" + runNumber++);

			for (Child schoolchild : yard.getChildren()) {
				// Does this child get pocket money?
				if (rand.nextBoolean()) {
					// Alright, just how much?
					schoolchild.addMoney(rand.nextInt(MAX_POCKET_MONEY + 1));
				}
				System.out.println(schoolchild);
			}
			System.out.println(Factory.getInstance());
			System.out.println(Shop.getInstance());
			System.out.println("--");

			yard.recess();

		} while (yard.hasChildren());
	}
}
