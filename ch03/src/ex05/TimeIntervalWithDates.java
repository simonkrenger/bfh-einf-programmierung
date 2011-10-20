/**
 * 
 */
package ex05;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * TimeInterval class that implements the functionality with the Date class.
 * @author simon
 * @since 20.10.2011
 * 
 */
public class TimeIntervalWithDates {

	private long time1;
	private long time2;

	SimpleDateFormat militaryTime = new SimpleDateFormat("kkmm");

	/**
	 * Constructor for the class, takes two military times as Strings
	 * @param milTime1 The first time in military format (hhmm)
	 * @param milTime2 The second time in military format (hhmm)
	 */
	public TimeIntervalWithDates(String milTime1, String milTime2) {
		try {
			time1 = militaryTime.parse(milTime1).getTime();
			time2 = militaryTime.parse(milTime2).getTime();
		} catch (ParseException e) {
			System.err.println("Error while parsing the provided time.");
			e.printStackTrace();
		}
	}

	/**
	 * Computes the difference in minutes between the two times provided.
	 * @return The amount of minutes between the times (without the hours)
	 */
	public int getMinutes() {
		return (int) Math.abs(((time2 - time1) / (1000 * 60)) % 60);
	}

	/**
	 * Computes the difference in hours between the two times provided
	 * @return The amount of hours between the times
	 */
	public int getHours() {
		return (int) Math.abs(((time2 - time1) / (1000 * 60 * 60)) % 24);
	}
}
