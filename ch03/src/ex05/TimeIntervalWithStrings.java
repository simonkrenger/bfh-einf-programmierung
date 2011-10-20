/**
 * 
 */
package ex05;

/**
 * @author simon
 *
 */
public class TimeIntervalWithStrings {

	private String time1;
	private String time2;
	
	public TimeIntervalWithStrings(String milTime1, String milTime2) {
		this.time1 = milTime1;
		this.time2 = milTime2;
	}

	public int getMinutes() {
		int minsTime1 = Integer.parseInt(this.time1.substring(2, 4));
		int minsTime2 = Integer.parseInt(this.time2.substring(2, 4));
		return Math.abs(minsTime2 - minsTime1);
	}

	public int getHours() {
		int hoursTime1 = Integer.parseInt(this.time1.substring(0, 2));
		int hoursTime2 = Integer.parseInt(this.time2.substring(0, 2));
		return Math.abs(hoursTime2 - hoursTime1);
	}

}
