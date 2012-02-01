package ch.bfh.krens1.exam02.ex01;

import java.util.ArrayList;

/**
 * Class to represent a player in a game of cards
 * 
 * @author simon
 * @since 30.01.2012
 * 
 */
public class Player {

	/**
	 * ArrayList to hold the cards the player has been given
	 */
	private ArrayList<Card> cards = new ArrayList<Card>();

	/**
	 * Name of the player
	 */
	private String name;

	/**
	 * Points of the player, points can be added with the addPoints method
	 */
	private int points;

	/**
	 * Constructor for the class, takes the name of the player as an argument
	 * 
	 * @param name
	 *            Name of the player
	 */
	public Player(String name) {
		this.name = name;
		this.points = 0;
	}

	/**
	 * Method to give a new card to the player
	 * 
	 * @param c
	 *            Card that is added to the players cards
	 */
	public void addCard(Card c) {
		cards.add(c);
	}

	/**
	 * Method to draw a new card from the players stack of cards
	 * 
	 * @return A card of the player
	 */
	public Card drawCard() {
		return cards.remove(cards.size() - 1);
	}

	/**
	 * Method to get the number of cards
	 * 
	 * @return Number of cards on the players card stack
	 */
	public int getNumberOfCards() {
		return cards.size();
	}

	/**
	 * Method to add points to this player
	 * 
	 * @param points
	 *            Number of points to be added
	 */
	public void addPoints(int points) {
		this.points += points;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name + ": " + points + " Points " + cards;
	}
}
