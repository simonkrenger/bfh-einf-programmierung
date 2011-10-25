package ex03;

/**
 * Class to represent a point in time. The class provides methods for comparing
 * two points in time. Can only be used to compare two points in time within 24
 * hours.
 * 
 * This class is based on the provided class by the teacher.
 * 
 * @author simon
 * @since 24.10.2011
 * 
 */
public class Time {

	/**
	 * Private variable to hold the hours
	 */
	private int hour;

	/**
	 * Private variable to hold the minutes
	 */
	private int minute;

	/**
	 * Private variable to hold the seconds
	 */
	private int second;

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
	public Time(int anHour, int aMinute, int sSecond) {
		this.hour = anHour % 24;
		this.minute = aMinute % 60;
		this.second = sSecond % 60;
	}

	/**
	 * Compares this time against another time.
	 * 
	 * @param time2
	 *            the time to compare with
	 * @return true if this time comes before time2, false otherwise
	 */
	public boolean before(Time time2) {
		if (this.getHour() < time2.getHour())
			return true;
		else if (this.getHour() == time2.getHour())
			if (this.getMinute() < time2.getMinute())
				return true;
			else if (this.getMinute() == time2.getMinute())
				if (this.getSecond() < time2.getSecond())
					return true;
		return false;
	}

	/**
	 * Compares this time against another time.
	 * 
	 * @param time2
	 *            the time to compare with
	 * @return true if this time comes after time2, false otherwise
	 */
	public boolean after(Time time2) {
		if (this.getHour() > time2.getHour())
			return true;
		else if (this.getHour() == time2.getHour())
			if (this.getMinute() > time2.getMinute())
				return true;
			else if (this.getMinute() == time2.getMinute())
				if (this.getSecond() > time2.getSecond())
					return true;
		return false;
	}

	/**
	 * Compares this time against another time.
	 * 
	 * @param time2
	 *            the time to compare with
	 * @return true if this time and time2 are the same, false otherwise
	 */
	public boolean equals(Time time2) {
		if (this.getHour() == time2.getHour())
			if (this.getMinute() == time2.getMinute())
				if (this.getSecond() == time2.getSecond())
					return true;
		return false;
	}

	/**
	 * @return the hours
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * @return the minutes
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * @return the seconds
	 */
	public int getSecond() {
		return second;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second="
				+ second + "]";
	}
}
