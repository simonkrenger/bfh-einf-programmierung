package ex01.football;

import java.util.ArrayList;

/**
 * Class to represent a team in a tournament. The team has a list of players
 * with different functions. Constants of the class define the number of players
 * for each function.
 * 
 * @author simon
 * @since 09.12.2011
 * 
 */
public class Team {

	/**
	 * Constant to define the number of goalkeepers per team
	 */
	private static final byte NUMBER_OF_GOALKEEPERS = 2;

	/**
	 * Constant to define the number of defenders per team
	 */
	private static final byte NUMBER_OF_DEFENDERS = 6;

	/**
	 * Constant to define the number of midfielders per team
	 */
	private static final byte NUMBER_OF_MIDFIELDERS = 6;

	/**
	 * Constant to define the number of attackers per team
	 */
	private static final byte NUMBER_OF_ATTACKERS = 4;

	/**
	 * Variable to hold the name of the team
	 */
	private String teamName = null;

	/**
	 * List with all players of the team
	 */
	private ArrayList<Player> players;

	/**
	 * Constructor for the class, creates a team with new players
	 * @param name The name of the team
	 */
	public Team(String name) {
		teamName = name;
		players = new ArrayList<Player>();

		int teamNum = 1;
		for (int g = 0; g < NUMBER_OF_GOALKEEPERS; g++) {
			players.add(new Player(PlayerFunction.GOALKEEPER, teamNum));
			teamNum++;
		}

		for (int d = 0; d < NUMBER_OF_DEFENDERS; d++) {
			players.add(new Player(PlayerFunction.DEFENDER, teamNum));
			teamNum++;
		}

		for (int m = 0; m < NUMBER_OF_MIDFIELDERS; m++) {
			players.add(new Player(PlayerFunction.MIDFIELD, teamNum));
			teamNum++;
		}

		for (int a = 0; a < NUMBER_OF_ATTACKERS; a++) {
			players.add(new Player(PlayerFunction.ATTACKER, teamNum));
			teamNum++;
		}
	}

	/**
	 * Calculates the size of the team
	 * @return The number of players in the team
	 */
	public static int getSize() {
		return NUMBER_OF_ATTACKERS + NUMBER_OF_DEFENDERS
				+ NUMBER_OF_GOALKEEPERS + NUMBER_OF_MIDFIELDERS;
	}

	/**
	 * Gets the name of the team
	 * @return The name of the team
	 */
	public String getName() {
		return teamName;
	}

	/**
	 * Gets all members of the team
	 * @return An ArrayList with all members of the team.
	 */
	public ArrayList<Player> getMembers() {
		return players;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Team [teamName=" + teamName + ", players=" + players + "]";
	}
}
