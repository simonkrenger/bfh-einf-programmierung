/**
 * 
 */
package ex05;

import java.util.ArrayList;

/**
 * A class for a purse, implemented with an enum instead of Strings
 * 
 * @author simon
 * @since 28.11.2011
 * 
 */
public class Purse {

	/**
	 * An enum for coins, so we only accept these coins. This is implemented in
	 * place of Strings, since I find the solution with Strings quite ugly.
	 * 
	 * @author simon
	 * @since 28.11.2011
	 * 
	 */
	public enum Coin {
		Quarter, Dime, Nickel, Penny
	};

	/**
	 * Holds the content of the purse as a list
	 */
	private ArrayList<Coin> purseContents = new ArrayList<Coin>();

	/**
	 * Constructor for the class, takes an unspecified number of coins as the
	 * constructor value. These coins are then added to the purse.
	 * 
	 * @param coins
	 *            Coins that are initially in the purse
	 */
	public Purse(Coin... coins) {
		for (int i = 0; i < coins.length; i++) {
			addCoin(coins[i]);
		}
	}

	/**
	 * Adds a coin to the purse
	 * 
	 * @param coin
	 *            This coin will be added to the purse
	 */
	public void addCoin(Coin coin) {
		purseContents.add(coin);
	}

	/**
	 * "prints" the purse into a string, so one can see the contents as a
	 * String.
	 */
	public String toString() {
		String output = "PURSE[ ";
		for (int i = 0; i < purseContents.size(); i++) {
			output += purseContents.get(i) + " ";
		}
		return output += "]";
	}

	/**
	 * Transfers all coins to another purse
	 * 
	 * @param other
	 *            The purse the coins will be transfered to
	 */
	public void transferTo(Purse other) {
		for (int i = 0; i < purseContents.size(); i++) {
			other.addCoin(purseContents.get(i));
			purseContents.remove(i);
		}
	}

	/**
	 * Transfers all coins from another purse
	 * 
	 * @param other
	 *            The other purse that will be emptied
	 */
	public void transferFrom(Purse other) {
		other.transferTo(this);
	}

	/**
	 * Computes the total value of the purse (in cents)
	 * 
	 * @return The value of the coins stored in the purse (in cents)
	 */
	public int sum() {
		return getNumberOf(Coin.Quarter) * 25 + getNumberOf(Coin.Dime) * 10
				+ getNumberOf(Coin.Nickel) * 5 + getNumberOf(Coin.Penny);
	}

	/**
	 * Checks whether another purse has the same total value
	 * 
	 * @param other
	 *            The other purse that will be compared to this one
	 * @return Returns true if the other purse has the same total value
	 */
	public boolean sameValue(Purse other) {
		return this.sum() == other.sum();
	}

	/**
	 * Checks whether another purse has the same coins (possibly in a different
	 * order)
	 * 
	 * @param other
	 *            The other purse
	 * @return Returns true if there are the same coins in the other purse or
	 *         false if there are different coins in the other purse
	 */
	public boolean sameCoins(Purse other) {
		if (this.sum() == other.sum()) {
			if (this.getNumberOf(Coin.Quarter) == other
					.getNumberOf(Coin.Quarter))
				if (this.getNumberOf(Coin.Dime) == other.getNumberOf(Coin.Dime))
					if (this.getNumberOf(Coin.Nickel) == other
							.getNumberOf(Coin.Nickel))
						if (this.getNumberOf(Coin.Penny) == other
								.getNumberOf(Coin.Penny))
							return true;
			return false;
		}
		return false;
	}

	/**
	 * Method for getting the number of a certain coin type from this purse
	 * 
	 * @param c
	 *            The coin type that will be counted
	 * @return The number of coins of this type in the purse
	 */
	private int getNumberOf(Coin c) {
		int counter = 0;
		for (int i = 0; i < purseContents.size(); i++) {
			if (purseContents.get(i).equals(c))
				counter++;
		}
		return counter;
	}

}
