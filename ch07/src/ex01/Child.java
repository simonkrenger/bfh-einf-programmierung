package ex01;

import java.util.ArrayList;

import ex01.panini.Album;
import ex01.panini.Picture;
import ex01.panini.PicturePackage;
import ex01.utils.RandomNameGen;

/**
 * Class to represent a child in the simulation. A child has an album, a name, a
 * bank account and duplicates.
 * 
 * @author simon
 * @since 16.12.2011
 * 
 */
public class Child {

	/**
	 * The name of the child
	 */
	private String name;

	/**
	 * The album of the child
	 */
	private Album album = null;

	/**
	 * ArrayList to hold the duplicates of the child
	 */
	private ArrayList<Picture> duplicates;

	/**
	 * The amount of money the child has
	 */
	private int balance = 0;

	/**
	 * Constructor for the class. Generates a random name for the child.
	 */
	public Child() {
		name = RandomNameGen.getRandomPersonName();
		duplicates = new ArrayList<Picture>();
	}

	/**
	 * Gives a certain amount of pocket money to the child
	 * 
	 * @param amount
	 *            The amount of money that is added to the childs purse
	 */
	public void addMoney(int amount) {
		balance += amount;
	}

	/**
	 * Gets the name of the child
	 * 
	 * @return The name of the child
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method to send the child shopping. First, the child needs to get an album
	 * so it can collect pictures. When the child has enough money to buy
	 * packages, it does so.
	 */
	public void shopping() {
		// First, check if the child has an album
		if (album == null) {
			// If the child has no album, buy one
			Factory f = Factory.getInstance();
			if (balance >= f.getAlbumPrice()) {
				album = f.sellAlbum();
				balance = balance - f.getAlbumPrice();
			}
		} else {
			Shop s = Shop.getInstance();
			// As long as the child has enough money to buy packages, do so
			while (balance >= s.getPackagePrice()) {
				balance = balance - s.getPackagePrice();
				PicturePackage pack = s.sellPackage();

				for (Picture p : pack.unpack()) {
					addPicture(p);
				}
			}
		}

	}

	/**
	 * Method to check if a child has duplicates to trade
	 * 
	 * @return TRUE if the child has duplicates
	 */
	public boolean hasDuplicates() {
		return (duplicates.size() > 0);
	}

	/**
	 * Method to get the duplicates of this child
	 * 
	 * @return An ArrayList that holds all the duplicates of this child
	 */
	public ArrayList<Picture> getDuplicates() {
		return duplicates;
	}

	/**
	 * Gets the number of duplicates
	 * 
	 * @return Returns the number of duplicates of this child
	 */
	public int getNumberOfDuplicates() {
		return duplicates.size();
	}

	/**
	 * Method to remove a certain picture from the duplicates (usually used to
	 * exchange pictures)
	 * 
	 * @param p
	 *            The picture that needs to be removed from the duplicates
	 */
	private void removeFromDuplicates(Picture p) {
		duplicates.remove(p);
	}

	/**
	 * Method to exchange duplicates with another child. This method checks if
	 * the child needs a picture from the other child and trades it.
	 * 
	 * @param peer
	 *            Trading partner
	 */
	public void exchange(Child peer) {
		if (peer.hasDuplicates() && this.hasDuplicates()) {

			// Just as a warning, the following code is quite ugly.
			// To be refactored!

			ArrayList<Picture> myDuplicates = this.getDuplicates();
			ArrayList<Picture> peerDuplicates = peer.getDuplicates();

			while (this.checkDuplicates(peerDuplicates)
					&& peer.checkDuplicates(myDuplicates)) {
				// We both have pictures we want to trade

				Picture myWant = this.getMissingDuplicate(peerDuplicates);
				Picture peerWant = peer.getMissingDuplicate(myDuplicates);

				this.addPicture(myWant);
				peer.removeFromDuplicates(myWant);

				peer.addPicture(peerWant);
				this.removeFromDuplicates(peerWant);
			}
		}
	}

	/**
	 * Method to give a picture to this child. It is then checked if the child
	 * already has the picture. If it already has the picture, the picture is
	 * added to the list of duplicates, else it is glued into the childs album.
	 * 
	 * @param p
	 *            The picture that is given to the child
	 */
	public void addPicture(Picture p) {
		if (album.isPictureInAlbum(p)) {
			duplicates.add(p);
		} else {
			album.putInAlbum(p);
		}
	}

	/**
	 * Ugly method to check if the peer child has some duplicates that this
	 * child wants
	 * 
	 * @param peerDuplicates
	 *            The duplicates of the peer
	 * @return Returns TRUE if there is a picture in the duplicates we still
	 *         need.
	 */
	private boolean checkDuplicates(ArrayList<Picture> peerDuplicates) {
		for (Picture p : peerDuplicates) {
			if (!(album.isPictureInAlbum(p)))
				return true;
		}
		return false;
	}

	/**
	 * Method to get the missing duplicates (UGLY!)
	 * 
	 * @param peerDuplicates
	 *            Duplicates of a peer
	 * @return The missing pictures
	 */
	private Picture getMissingDuplicate(ArrayList<Picture> peerDuplicates) {
		for (Picture p : peerDuplicates) {
			if (!(album.isPictureInAlbum(p)))
				return p;
		}
		return null;
	}

	/**
	 * Checks if this child has a complete album
	 * 
	 * @return Returns TRUE if the child has a complete album
	 */
	public boolean hasCompleteAlbum() {
		if (album == null) {
			return false;
		}
		return album.isComplete();
	}

	/**
	 * Get the number of missing pictures of this child.
	 * 
	 * @return Returns the number pictures this child is still missing. Returns
	 *         -1 if this child has no album yet.
	 */
	public int missingPictures() {
		if (album != null) {
			return album.getMissing();
		}
		return -1;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Child [name=" + name + ", balance=" + balance
				+ ", hasDuplicates()=" + hasDuplicates()
				+ ", getNumberOfDuplicates()=" + getNumberOfDuplicates()
				+ ", hasCompleteAlbum()=" + hasCompleteAlbum()
				+ ", missingPictures()=" + missingPictures() + "]";
	}

}
