package ex06;

public class Building {

	private int height;
	private String name;
	
	public Building(String name) {
		this.name = name;
		this.height = 0;
	}
	
	public Building(String name, int height) {
		this.name = name;
		this.height = height;
	}

	/**
	 * @return the height
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
	 * @return the name
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
