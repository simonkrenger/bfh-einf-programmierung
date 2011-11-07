/**
 * 
 */
package ex04;

import java.util.Random;

/**
 * Implementation of a roulette game. Provides methods for playing the strategy
 * of "doubling" your bet.
 * 
 * @author simon
 * 
 */
public class Roulette {

	/*
	 * For our roulette game, our starting bet is 1$.
	 */
	private final static int STARTING_AMOUNT = 1;

	/**
	 * Probability for one color in roulette is 18/37 (37 minus the "0")
	 */
	private final static double ROULETTE_PROBABILITY = 18.0 / 37.0;

	/**
	 * The balance of the roulette player for one game. This value is set in the
	 * constructor of the class.
	 */
	private int balance;

	/**
	 * Generator for our random numbers
	 */
	private Random randGenerator = new Random();

	/**
	 * Constructor for the class, with the initial balance of the roulette
	 * player
	 * 
	 * @param initialBalance
	 */
	public Roulette(int initialBalance) {
		this.balance = initialBalance;
	}

	/**
	 * Plays a single bid, returns true if winning. Updates the balance.
	 * 
	 * @param amount
	 *            The amount to bet on one game of roulette.
	 * @return Returns true if the player won and false if the game was lost.
	 */
	boolean play(int amount) {
		balance = balance - amount;
		if (randGenerator.nextDouble() <= ROULETTE_PROBABILITY) {
			// Yay, won!
			balance = balance + 2 * amount;
			return true;
		}
		// Aww, lost :(
		return false;
	}

	/**
	 * Play the strategy until winning $1 or losing everything.
	 * 
	 */
	void playStrategy() {
		int amount = STARTING_AMOUNT;
		boolean win;
		do {
			win = play(amount);
			if (!win)
				amount = amount * 2;
		} while (!win && balance >= amount);
	}

	/**
	 * Method for playing multiple times, as long as we have money and the
	 * specified amount is not reached (when we reach the specified amount, we
	 * go home).
	 * 
	 * @param endBalance
	 *            We try to get our balance to this level.
	 * @return Returns true if we reached the specified balance and returns
	 *         false if we ran out of money
	 */
	public boolean playStrategyMultipleTimes(int endBalance) {
		while (getBalance() > 0 && getBalance() < endBalance)
			playStrategy();
		return getBalance() > 0;
	}

	/**
	 * Returns the current balance
	 * 
	 * @return The current balance
	 */
	int getBalance() {
		return this.balance;
	}
}
