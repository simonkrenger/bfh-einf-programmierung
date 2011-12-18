package ex01.panini;

import java.util.ArrayList;

/**
 * Container class to hold packages.
 * 
 * @author simon
 * @since 16.12.2011
 * 
 */
public class PicturePackageBox {

	/**
	 * ArrayList to hold the packages in this box
	 */
	private ArrayList<PicturePackage> packages;

	/**
	 * Cost to produce one box
	 */
	private static final int BOX_PRODUCTION_COST = 10;

	/**
	 * Number of packages that one box can hold.
	 */
	private static final int PACKS_PER_BOX = 50;

	/**
	 * Constructor for the class, prepares the box for filling. You need to add
	 * the packages manually by calling the addPackage() method of this class.
	 */
	public PicturePackageBox() {
		packages = new ArrayList<PicturePackage>();
	}

	/**
	 * Atomic operation to unpack all packages from the box
	 * 
	 * @return All packages in the box
	 */
	public ArrayList<PicturePackage> unpack() {
		return packages;
	}

	/**
	 * Adds a new package to the box
	 * 
	 * @param pp
	 *            The picture package that is placed in the box
	 */
	public void addPackage(PicturePackage pp) {
		packages.add(pp);
	}

	/**
	 * Checks if the box is empty
	 * 
	 * @return Returns TRUE if the box is empty or FALSE if the box still has
	 *         packages in it
	 */
	public boolean isEmpty() {
		return packages.isEmpty();
	}

	/**
	 * Gets the production cost for one box
	 * @return The production cost for one box
	 */
	public static int getBoxProductionCost() {
		return BOX_PRODUCTION_COST;
	}

	/**
	 * Returns the number of packages per box
	 * @return Maximum number of packages per box
	 */
	public static int getPacksPerBox() {
		return PACKS_PER_BOX;
	}
}
