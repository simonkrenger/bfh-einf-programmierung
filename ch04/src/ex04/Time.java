package ex04;

/**
 * Implementation of a point in time in the 24 hour format. This implementation
 * features only logical decisions, how nice is that? :) The class provides
 * methods for comparing two points in time.
 * 
 * @author simon
 * @since 24.10.2011
 * 
 */
public class Time {

	/**
	 * Private variable to hold the hours
	 */
	private int hours;
	
	/**
	 * Private variable to hold the minutes
	 */
	private int minutes;
	
	/**
	 * Private variable to hold the seconds
	 */
	private int seconds;

	/**
	 * Constructor for the class, takes hours, minutes and seconds of a point in
	 * time. The class will make sure that the time provided is a valid time (by
	 * applying the modulo operator).
	 * 
	 * @param anHour
	 *            Hours
	 * @param aMinute
	 *            Minutes
	 * @param sSecond
	 *            Seconds
	 */
	public Time(int hours, int minutes, int seconds) {
		this.hours = hours % 24;
		this.minutes = minutes % 60;
		this.seconds = seconds % 60;
	}

	/**
	 * Compares this time against another time.
	 * 
	 * @param time2
	 *            the time to compare with
	 * @return true if this time comes before time2, false otherwise
	 */
	public boolean before(Time time2) {
		return (this.hours < time2.getHours())
				|| (this.hours == time2.getHours() && this.minutes < time2
						.getMinutes())
				|| (this.hours == time2.getHours()
						&& this.minutes == time2.getMinutes() && this.seconds < time2
						.getSeconds());
	}

	/**
	 * Compares this time against another time.
	 * 
	 * @param time2
	 *            the time to compare with
	 * @return true if this time comes after time2, false otherwise
	 */
	public boolean after(Time time2) {
		return (this.hours > time2.getHours())
				|| (this.hours == time2.getHours() && this.minutes > time2
						.getMinutes())
				|| (this.hours == time2.getHours()
						&& this.minutes == time2.getMinutes() && this.seconds > time2
						.getSeconds());
	}

	/**
	 * Compares this time against another time.
	 * 
	 * @param time2
	 *            the time to compare with
	 * @return true if this time and time2 are the same, false otherwise
	 */
	public boolean equals(Time time2) {
		return (this.hours == time2.getHours()
				&& this.minutes == time2.getMinutes() && this.seconds == time2
					.getSeconds());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + ", seconds="
				+ seconds + "]";
	}

	/**
	 * @return the hours
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * @return the minutes
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * @return the seconds
	 */
	public int getSeconds() {
		return seconds;
	}

}
