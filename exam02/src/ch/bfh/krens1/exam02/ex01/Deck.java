package ch.bfh.krens1.exam02.ex01;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class to represent a deck of cards
 * 
 * @author simon
 * @since 30.01.2012
 * 
 */
public class Deck {

	/**
	 * Cards in the deck
	 */
	private ArrayList<Card> cards = new ArrayList<Card>();

	/**
	 * Constructor for the class
	 */
	public Deck() {
		for (int c = 1; c <= 4; c++) {
			for (int v = 1; v <= 9; v++) {
				cards.add(new Card(c, v));
			}
		}
	}

	/**
	 * Method to shuffle the deck of cards
	 */
	public void shuffle() {
		Random rand = new Random();
		ArrayList<Card> shuffled = new ArrayList<Card>();
		while (cards.size() > 0) {
			// "nextInt" uses indexed numbering, no need to decrease by 1!
			shuffled.add(cards.remove(rand.nextInt(cards.size())));
		}
		this.cards = shuffled;
	}

	/**
	 * Method to deal all cards of this deck to two players in an alternating
	 * fashion
	 * 
	 * @param player1
	 *            First player to receive cards
	 * @param player2
	 *            Second player to receive cards
	 */
	public void deal(Player player1, Player player2) {
		boolean alternate = true;
		while (cards.size() > 0) {
			if (alternate) {
				player1.addCard(cards.remove(cards.size() - 1));
			} else {
				player2.addCard(cards.remove(cards.size() - 1));
			}
			alternate = !alternate;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return cards.toString();
	}

}
