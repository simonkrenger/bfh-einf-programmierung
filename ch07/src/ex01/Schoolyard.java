package ex01;

import java.util.ArrayList;

/**
 * Class to represent a schoolyard that holds a number of children and features
 * methods to run the simulation
 * 
 * @author simon
 * @since 16.12.2011
 * 
 */
public class Schoolyard {

	/**
	 * Private variable to hold the children on the schoolyard
	 */
	private ArrayList<Child> children;

	/**
	 * Constructor for the schoolyard
	 */
	public Schoolyard() {
		children = new ArrayList<Child>();
	}

	/**
	 * Returns a list of the children on the schoolyard
	 * 
	 * @return List of children on the schoolyard
	 */
	public ArrayList<Child> getChildren() {
		return children;
	}

	/**
	 * Method to add a child to the schoolyard
	 * 
	 * @param child
	 *            Child to be added to the schoolyard
	 */
	public void addChild(Child child) {
		children.add(child);
	}

	/**
	 * Check if the schoolyard still has children on it
	 * 
	 * @return TRUE if there are children on the schoolyard
	 */
	public boolean hasChildren() {
		return (children.size() > 0);
	}

	/**
	 * Method for simulating recess on the schoolyard. During the recess,
	 * children go shopping in the shop and exchange pictures with their peers.
	 * If they have a complete album, the child leaves the schoolyard.
	 */
	public void recess() {
		for (Child c : children) {
			c.shopping();
			if (c.hasDuplicates()) {
				for (Child peer : children) {
					if (!peer.equals(c)) {
						c.exchange(peer);
					}
				}
			}
		}

		for (int i = 0; i < children.size(); i++) {
			if (children.get(i).hasCompleteAlbum())
				children.remove(i);
		}
	}
}
