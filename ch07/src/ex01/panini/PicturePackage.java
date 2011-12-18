package ex01.panini;

import java.util.ArrayList;

/**
 * Class to represent a picture package to hold Panini pictures
 * 
 * @author simon
 * @since 16.12.2011
 * 
 */
public class PicturePackage {

	/**
	 * ArrayList to hold the pictures in this package
	 */
	private ArrayList<Picture> pictures;

	/**
	 * Constant to hold the number of pictures in a package
	 */
	private static final int PICTURES_PER_PACK = 4;

	/**
	 * Constructor for the class. Creates a new package, but the pictures need
	 * to be added manually. This can be done by calling the addPicture()
	 * method.
	 */
	public PicturePackage() {
		pictures = new ArrayList<Picture>();
	}

	/**
	 * Atomic operation to unpack this picture package.
	 * 
	 * @return Returns the pictures in this package
	 */
	public ArrayList<Picture> unpack() {
		return pictures;
	}

	/**
	 * Method to add a picture to the package.
	 * 
	 * @param p
	 *            The picture that is added to the package
	 */
	public void addPicture(Picture p) {
		pictures.add(p);
	}

	/**
	 * Method to check if the package is empty
	 * 
	 * @return Returns TRUE if the package is empty or FALSE if it still has
	 *         pictures in it.
	 */
	public boolean isEmpty() {
		return pictures.isEmpty();
	}

	/**
	 * Returns the number of pictures in this package
	 * 
	 * @return The number of pictures per package
	 */
	public static int getPicturesPerPack() {
		return PICTURES_PER_PACK;
	}
}
