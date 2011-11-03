package ex01;

/**
 * Class used to calculate PI.
 * Provides one method to calculate PI to the n-th place after the decimal point.
 * @author simon
 *
 */
public class PiCalculator {

	/**
	 * Holds how many iterations it took to calculate PI.
	 */
	int lastRunIterations = 0;
	
	/**
	 * Calculates PI using the formula "4*(1 - 1/3 + 1/5 - 1/7 + 1/9 - ...)" to the n-th place after the decimal point.
	 * @param placesAfterDecimalPoint Defines how many places after the decimal point are evaluated.
	 * @return PI rounded to the n-th place after the 
	 */
	public double calcPi(int placesAfterDecimalPoint) {
		
		double piCalc = 1D;
		int fraction = 3;
		boolean operation = false;	// First operation is "1 - 1/3"
		double lastValue = 0D; // Holds the value of the last iteration;
		
		while(round(4*piCalc, placesAfterDecimalPoint) != lastValue)
		{
			lastValue = round(4*piCalc, placesAfterDecimalPoint);
			if(operation) {
				piCalc += (1D/fraction);
				operation=false;
			}
			else {
				piCalc -= (1D/fraction);
				operation = true;
			}
			fraction += 2;
			lastRunIterations++;
		}
		return lastValue;
	}
	
	/**
	 * Reads how many iterations were necessary to calculate PI with calcPi()
	 * @return The number of iterations it took
	 */
	public int getLastRunIterations() {
		return this.lastRunIterations;
	}
	
	/**
	 * Function provided by the teacher to round a DOUBLE
	 * @param n The number to be rounded
	 * @param k k places after the decimal point
	 * @return The rounded number
	 */
	private static double round(double n, int k)
	{	
		double c = Math.pow(10,k);
		return Math.floor(n * c) / c;
	}
}
