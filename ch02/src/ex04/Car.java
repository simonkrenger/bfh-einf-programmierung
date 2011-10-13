package ex04;

/**
 * A class to implement a generic car.
 * 
 * @author simon
 * @since 07.10.2011
 * 
 */
public class Car {

	/**
	 * Represents the consumption of the car per 100 kilometers.
	 */
	private double consumption = 0;

	/**
	 * Represents the current level of gas in the tank
	 */
	private double tankLevel = 0;
	
	/**
	 * Constructor for the class.
	 * 
	 * @param consumption
	 *            The consumption of the car per 100 kilometers
	 */
	public Car(double consumption) {
		this.consumption = consumption;
	}
	
	/**
	 * Constructor for the class. There is already some gas in the tank, how nice!
	 * 
	 * @param consumption The consumption of the car per 100 kilometers
	 * @param tankLevel The amount of gas already in the car.
	 */
	public Car(double consumption, double tankLevel) {
		this.consumption = consumption;
		this.tankLevel = tankLevel;
	}
	
	/**
	 * Returns the consumption of the car
	 * 
	 * @return The consumption of the car per 100 kilometers
	 */
	public double getConsumption() {
		return consumption;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [consumption=" + consumption + ", tankLevel=" + tankLevel + "]";
	}

	/**
	 * Get the amount of gas in the tank of the car
	 * 
	 * @return The amount of gas available in the car
	 */
	public double getTankLevel() {
		return tankLevel;
	}

	/**
	 * Fill up the tank (add gas)
	 * 
	 * @param amount
	 *            Amount of gas filled in the tank
	 * @return The amount of gas available after filling up.
	 */
	public double fillUp(double amount) {
		this.tankLevel += amount;
		return tankLevel;
	}

	/**
	 * Drives the car for a specified amount of kilometers
	 * 
	 * @param kilometers
	 *            Amount of kilometers to drive
	 * @return Returns TRUE if there was enough gas to drive. If there was not
	 *         enough gas available, this method returns FALSE.
	 */
	public boolean drive(double kilometers) {
		double gasUsed = kilometers / 100 * this.consumption;
		if (gasUsed <= this.tankLevel) {
			this.tankLevel = this.tankLevel - gasUsed;
			return true;
		}
		System.out.println("Not enough gas! " + this.tankLevel + " liters of gas left.");
		return false;
	}
}
