/**
 * 
 */
package ex05;

/**
 * TimeInterval class that implements the functionality with the String class.
 * Uses substring() to parse the hours and minutes.
 * @author simon
 * @since 20.10.2011
 * 
 */
public class TimeIntervalWithStrings {

	private String time1;
	private String time2;
	
	/**
	 * Constructor for the class, takes two military times as Strings
	 * @param milTime1 The first time in military format (hhmm)
	 * @param milTime2 The second time in military format (hhmm)
	 */
	public TimeIntervalWithStrings(String milTime1, String milTime2) {
		this.time1 = milTime1;
		this.time2 = milTime2;
	}

	/**
	 * Computes the difference in minutes between the two times provided.
	 * @return The amount of minutes between the times (without the hours)
	 */
	public int getMinutes() {
		int minsTime1 = Integer.parseInt(this.time1.substring(2, 4));
		int minsTime2 = Integer.parseInt(this.time2.substring(2, 4));
		return Math.abs(minsTime2 - minsTime1);
	}

	/**
	 * Computes the difference in hours between the two times provided
	 * @return The amount of hours between the times
	 */
	public int getHours() {
		int hoursTime1 = Integer.parseInt(this.time1.substring(0, 2));
		int hoursTime2 = Integer.parseInt(this.time2.substring(0, 2));
		return Math.abs(hoursTime2 - hoursTime1);
	}

}
