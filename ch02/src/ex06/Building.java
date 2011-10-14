package ex06;

/**
 * Building class for ex06.
 * Construct a generic building with a name and a height.
 * 
 * @author simon
 * @since 14.10.2011
 *
 */
public class Building {

	/**
	 * Height of the building
	 */
	private int height;
	
	/**
	 * Name of the building
	 */
	private String name;
	
	/**
	 * Constructs a building with the specified name
	 * @param name The name of the building
	 */
	public Building(String name) {
		this.name = name;
		this.height = 0;
	}
	
	/**
	 * Constructs a building with the specified name and the specified height.
	 * @param name The name of the building
	 * @param height The height of the building
	 */
	public Building(String name, int height) {
		this.name = name;
		this.height = height;
	}

	/**
	 * @return The height of the building
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return The name of the building
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
