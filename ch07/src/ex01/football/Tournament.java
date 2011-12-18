package ex01.football;

import java.util.ArrayList;
import java.util.Random;

/**
 * Class to represent a football tournament. The tournament can hold teams and
 * provides helper methods to access single players from the tournament
 * 
 * @author simon
 * @since 16.12.2011
 * 
 */
public class Tournament {

	/**
	 * ArrayList to hold the teams in the tournament
	 */
	private ArrayList<Team> teams = new ArrayList<Team>();

	/**
	 * Variable to hold the total number of players in the tournament
	 */
	private int playersInTournament = 0;

	/**
	 * Constructor for the class. When the constructor is called, the specified
	 * number of teams is created.
	 * 
	 * @param numberOfTeams
	 *            The number of teams to be created within the tournament
	 */
	public Tournament(int numberOfTeams) {
		for (int i = 0; i < numberOfTeams; i++) {
			teams.add(new Team("Team" + i));
		}
		playersInTournament = numberOfTeams * Team.getSize();
	}

	/**
	 * Gets the teams in the tournament
	 * 
	 * @return Returns the teams in the tournament
	 */
	public ArrayList<Team> getTeams() {
		return teams;
	}

	/**
	 * Number of players in the tournament
	 * 
	 * @return The total number of players in the tournament.
	 */
	public int getTotalPlayers() {
		return playersInTournament;
	}

	/**
	 * Method to get a random player from the tournament.
	 * 
	 * @return Returns a random player in the tournament
	 */
	public Player getRandomPlayer() {
		Random rand = new Random();
		Team randomTeam = teams.get(rand.nextInt(teams.size()));
		return randomTeam.getMembers().get(
				rand.nextInt(randomTeam.getMembers().size()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tournament [teams=" + teams + ", playersInTournament="
				+ playersInTournament + ", getTotalPlayers()="
				+ getTotalPlayers() + "]";
	}
}
