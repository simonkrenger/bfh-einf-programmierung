package ex01.football;

import java.util.Random;

import ex01.utils.RandomNameGen;

/**
 * Class to represent a football player with a name, function, age and number.
 * 
 * @author simon
 * @since 09.12.2011
 * 
 */
public class Player {

	/**
	 * Holds the full name of the player
	 */
	private String name;

	/**
	 * Holds the function of the player
	 */
	private PlayerFunction function = null;

	/**
	 * Holds the number of the player
	 */
	private int number;

	/**
	 * Holds the age of the player
	 */
	private int age;

	/**
	 * Holds the tournament ID of the player
	 */
	private int id;

	/**
	 * Static variable to hold the latest id for players
	 */
	private static int serialId = 0;

	/**
	 * Constructor for the class. Takes the function of the player and the
	 * number inside the team as arguments. The name and the age are generated
	 * randomly. The ID is automatically set.
	 * 
	 * @param function
	 *            Function of the player (such as goalkeeper)
	 * @param number
	 *            Number on the shirt of the player
	 */
	public Player(PlayerFunction function, int number) {
		this.function = function;
		this.number = number;

		this.id = Player.getNextId();
		this.name = RandomNameGen.getRandomPersonName();

		Random r = new Random();
		this.age = 20 + r.nextInt(20);
	}

	/**
	 * @return The name of the player
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return The function of the player
	 */
	public PlayerFunction getFunction() {
		return function;
	}

	/**
	 * @return The number of the player
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @return The age of the player
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Get the unique id of the player
	 * @return The id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Retrieves the next new unique ID for a player
	 * @return A new ID
	 */
	private static int getNextId() {
		serialId++;
		return serialId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Player [name=" + name + ", function=" + function + ", number="
				+ number + ", age=" + age + ", playerId=" + id + "]";
	}
}
