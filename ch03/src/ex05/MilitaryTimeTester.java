/**
 * 
 */
package ex05;

import java.util.Scanner;

/**
 * Tester class for testing the two solutions
 * @author simon
 * @since 20.10.2011
 * 
 */
public class MilitaryTimeTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Please enter the first time: ");
		String firstTime = scn.nextLine();
		System.out.print("Please enter a second time: ");
		String secondTime = scn.nextLine();

		TimeIntervalWithDates tid = new TimeIntervalWithDates(firstTime,
				secondTime);
		TimeIntervalWithStrings tis = new TimeIntervalWithStrings(firstTime,
				secondTime);

		System.out.println("Calculated with the TimeIntervalWithDates class:\n"
				+ tid.getHours() + " hours " + tid.getMinutes() + " minutes");
		System.out
				.println("Calculated with the TimeIntervalWithStrings class:\n"
						+ tis.getHours() + " hours " + tis.getMinutes()
						+ " minutes");
	}

}
