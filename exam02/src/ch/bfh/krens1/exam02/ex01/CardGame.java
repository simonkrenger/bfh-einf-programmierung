package ch.bfh.krens1.exam02.ex01;

public class CardGame {

	/**
	 * Points that are given to a player when he wins two cards
	 */
	private static final int POINTS_PER_CARD = 10;

	public static void main(String[] args) {
		Player john = new Player("John");
		Player mary = new Player("Mary");

		Deck deck = new Deck();
		System.out.println("Initial deck: " + deck);

		deck.shuffle();
		System.out.println("Deck after shuffling: " + deck);

		deck.deal(john, mary);
		System.out.println("Deck after dealing: " + deck);

		System.out.println("INITIAL STATE:");
		System.out.println(john);
		System.out.println(mary);

		play(deck, john, mary);

		System.out.println("FINAL SCORES:");
		System.out.println(john);
		System.out.println(mary);

	}

	/**
	 * Method to simulate a game of cards between two players
	 * 
	 * @param deck
	 *            The deck that is used (usually empty, I have no idea why this
	 *            is here)
	 * @param player1
	 *            First player
	 * @param player2
	 *            Second player
	 */
	private static void play(Deck deck, Player player1, Player player2) {
		while (player1.getNumberOfCards() > 0 && player2.getNumberOfCards() > 0) {
			Card c1 = player1.drawCard();
			Card c2 = player2.drawCard();
			if (c1.beats(c2)) {
				player1.addPoints(POINTS_PER_CARD);
			} else {
				player2.addPoints(POINTS_PER_CARD);
			}
		}
	}
}