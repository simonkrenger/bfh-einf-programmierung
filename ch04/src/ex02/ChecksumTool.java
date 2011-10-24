package ex02;

/**
 * Class that provides functions for calculating checksums
 * @author simon
 * @since 20.10.2011
 * 
 */
public class ChecksumTool {

	/**
	 * Calculates the digit sum of a given number
	 * @param n The number to be evaulated
	 * @return The digit sum of the specified number
	 */
	public static int digitSum(int n) {
		if(n == 0)
			return 0;
		else
			return n % 10 + digitSum(n / 10);
	}
}
