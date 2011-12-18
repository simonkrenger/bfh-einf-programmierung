package ex01.panini;

import ex01.football.Player;

/**
 * Container class to represent a Panini picture.
 * 
 * @author simon
 * @since 16.12.2011
 * 
 */
public class Picture {

	/**
	 * Player that is represented on the picture
	 */
	private Player player;

	/**
	 * Boolean variable that says if the picture is glued into an album
	 */
	private boolean isInAlbum;

	/**
	 * Constructor for the class to represent a picture for a certain player
	 * 
	 * @param player
	 *            Player that is represented on the picture
	 */
	public Picture(Player player) {
		this.player = player;
	}

	/**
	 * Gets the player on the picture
	 * 
	 * @return the player represented on the picture
	 */
	public Player getPlayer() {
		return player;
	}

	/**
	 * Gets the ID of the player on the picture
	 * 
	 * @return The ID of the player on the picture
	 */
	public int getId() {
		return player.getId();
	}

	/**
	 * Checks if this picture is in an album
	 * 
	 * @return TRUE if the picture is glued into an album, FALSE if it is not
	 */
	public boolean isInAlbum() {
		return isInAlbum;
	}

	/**
	 * Glues a picture into an album
	 */
	public void glue() {
		isInAlbum = true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Picture [player=" + player + ", isInAlbum=" + isInAlbum + "]";
	}

}
