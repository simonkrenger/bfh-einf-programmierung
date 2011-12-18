package ex01.panini;

import java.util.Arrays;

/**
 * Class to represent a Panini album. This is mainly a container class that
 * holds the pictures
 * 
 * @author simon
 * @since 16.12.2011
 * 
 */
public class Album {

	/**
	 * Array that holds the pictures in the album. Since this is an array, every
	 * element in the array corresponds to an ID of a player in the tournament
	 */
	private Picture[] pictures;

	/**
	 * Helper variable to hold the number of missing pictures for this album
	 */
	private int missing;

	/**
	 * Constructor for the class, takes the number of pictures the album can
	 * hold as an argument.
	 * 
	 * @param size
	 *            Size of the album; Number of pictures this album can hold
	 */
	public Album(int size) {
		pictures = new Picture[size];
		missing = size;
	}

	/**
	 * Glues a picture into the album
	 * 
	 * @param p
	 *            Picture that is glued into the album
	 */
	public void putInAlbum(Picture p) {
		pictures[p.getId() - 1] = p;
		p.glue();
		missing--;
	}

	/**
	 * Checks if this picture is in the album already.
	 * 
	 * @param p
	 *            The picture that is checked for
	 * @return Returns TRUE if the picture is already in the album and FALSE if
	 *         the picture is missing
	 */
	public boolean isPictureInAlbum(Picture p) {
		return (pictures[p.getId() - 1] != null);
	}

	/**
	 * Gets the number of missing pictures in this album
	 * 
	 * @return The number of missing pictures in the album
	 */
	public int getMissing() {
		return missing;
	}

	/**
	 * Checks if the album is complete (has no missing pictures)
	 * 
	 * @return TRUE if the album is full
	 */
	public boolean isComplete() {
		return (missing == 0);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Album [pictures=" + Arrays.toString(pictures) + ", missing="
				+ missing + ", isComplete()=" + isComplete() + "]";
	}

}
