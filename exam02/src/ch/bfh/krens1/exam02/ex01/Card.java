package ch.bfh.krens1.exam02.ex01;

/**
 * Class to represent a single card in a game of cards
 * 
 * @author simon
 * @since 30.01.2012
 * 
 */
public class Card {

	/**
	 * Color of the card (1-4)
	 */
	private int color;

	/**
	 * Value of the card (1-9)
	 */
	private int value;

	/**
	 * Constructor for the class, takes the color and the value of the new card
	 * as arguments
	 * 
	 * @param color
	 *            Color of the card (usually between 1 and 4)
	 * @param value
	 *            Value of the card (usually between 1 and 9)
	 */
	public Card(int color, int value) {
		this.color = color;
		this.value = value;
	}

	/**
	 * Method to check if this card has a higher color or value than the other.
	 * Method of evaluation: Colors are evaluated first. If the two colors are
	 * the same, the value is taken into account as well.
	 * 
	 * @param other
	 *            The card that this card is compared against.
	 * @return Returns TRUE if this card has a higher value than the card in the
	 *         argument. Else, returns FALSE
	 */
	public boolean beats(Card other) {

		// Whoops, used variables as "public" on paper.
		// But since we have the getter-methods, let's use those!
		if (this.getColor() == other.getColor()) {
			return (this.getValue() > other.getValue());
		}
		return (this.getColor() > other.getColor());
	}

	/**
	 * Method to get the color of the card
	 * 
	 * @return The color of the card
	 */
	private int getColor() {
		return this.color;
	}

	/**
	 * Method to get the value of the card
	 * 
	 * @return The value of the card
	 */
	private int getValue() {
		return this.value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return color + "/" + value;
	}
}
