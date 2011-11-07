package ex04;

/**
 * Tester class for the Roulette class. This tester runs the algorithms in the
 * Roulette class multiple times and tries to calculate the probability of
 * winning with the implemented strategy.
 * 
 * @author simon
 * @since 07.11.2011
 * 
 */
public class RouletteTester {

	/**
	 * Start with this amount of money each time
	 */
	private final static int START_BALANCE = 100;
	
	/**
	 * The goal is to reach this amount of money
	 */
	private final static int END_BALANCE = 2 * START_BALANCE;

	/**
	 * The simulation will run this many times.
	 */
	private final static int SIMULATION_ROUNDS = 100000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Roulette r = null;
		int timesWon = 0;
		int timesLost = 0;

		for (int i = 1; i <= SIMULATION_ROUNDS; i++) {
			r = new Roulette(START_BALANCE);
			if (r.playStrategyMultipleTimes(END_BALANCE))
				timesWon++;
			else
				timesLost++;
		}
		System.out.println("Won " + timesWon + " times and lost " + timesLost
				+ " times.");
		System.out.println("Probability of winning is "
				+ ((double) timesWon / SIMULATION_ROUNDS));

	}

}
