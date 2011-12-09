/**
 * Singleton Pattern
 * 
 * @author simon
 * @since 09.12.2011
 * 
 */
public class Universe {

	/**
	 * Singleton instance
	 */
	private static Universe instance;

	/**
	 * Private constructor for the class. This is a key feature of the singleton
	 */
	private Universe() {
		// Do stuff
	}

	/**
	 * Static method "getInstance()" returns the only instance of this object.
	 * Is thread-safe.
	 * 
	 * @return
	 */
	public static Universe getInstance() {
		// Create instance the first time only
		if (instance == null)
			instance = new Universe();
		return instance;
	}
}
