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
	 * Amount the child spent
	 */
	private int expenses = 0;

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
				expenses += f.getAlbumPrice();
			}
		} else {
			Shop s = Shop.getInstance();
			// As long as the child has enough money to buy packages, do so
			while (balance >= s.getPackagePrice()) {
				balance = balance - s.getPackagePrice();
				expenses += s.getPackagePrice();
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
	 * Method to exchange duplicates with another child. This method checks if
	 * the child needs a picture from the other child and trades it.
	 * 
	 * @param peer
	 *            Trading partner
	 */
	public void exchange(Child peer) {
		if (peer.hasDuplicates() && this.hasDuplicates()) {

			// Get the "wants" of both children
			ArrayList<Picture> myWants = this.getWants(peer.getDuplicates());
			ArrayList<Picture> peerWants = peer.getWants(this.getDuplicates());

			while ((myWants.size() > 0) && (peerWants.size() > 0)) {
				this.transferPictureTo(peer,
						peerWants.remove(peerWants.size() - 1));
				peer.transferPictureTo(this, myWants.remove(myWants.size() - 1));
			}
		}
	}

	/**
	 * Retrieves the pictures in a pile of duplicates that this child wants.
	 * This method can be used to get a list of pictures the child wants to
	 * trade.
	 * 
	 * @param peerDuplicates
	 *            Duplicates of another child that are looked through
	 * @return A list of pictures from the duplicates of the peer
	 */
	public ArrayList<Picture> getWants(ArrayList<Picture> peerDuplicates) {
		ArrayList<Picture> temp = new ArrayList<Picture>();
		for (Picture p : peerDuplicates) {
			if (!(album.isPictureInAlbum(p))) {
				temp.add(p);
			}
		}
		return temp;
	}

	/**
	 * Method to transfer a duplicate picture from this child to another child.
	 * The duplicate specified is transfered to the other child and removed from
	 * this childs duplicates.
	 * 
	 * @param peer
	 *            The other child that the picture is transfered to
	 * @param p
	 *            The picture to be transfered
	 */
	public void transferPictureTo(Child peer, Picture p) {
		peer.addPicture(p);
		duplicates.remove(p);
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
		return "Child [name=" + name + ", balance=" + balance + ", expenses="
				+ expenses + ", hasDuplicates()=" + hasDuplicates()
				+ ", getNumberOfDuplicates()=" + getNumberOfDuplicates()
				+ ", hasCompleteAlbum()=" + hasCompleteAlbum()
				+ ", missingPictures()=" + missingPictures() + "]";
	}
}
