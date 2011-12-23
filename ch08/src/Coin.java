public class Coin implements Measurable {
	private double value;
	private String name;

	public Coin(double aValue, String aName) {
		value = aValue;
		name = aName;
	}

	public double getValue() {
		return value;
	}

	public String getName() {
		return name;
	}

	public double getMeasure() {
		return value;
	}
}