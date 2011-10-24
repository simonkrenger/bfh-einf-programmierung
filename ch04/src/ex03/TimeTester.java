/**
 * 
 */
package ex03;

import java.util.Scanner;

/**
 * Tester class for the Time class.
 * Prompts the user for two points in time and then prints them in the right
 * order. If the two points in time are the same, print them only once.
 * 
 * @author simon
 * @since 24.10.2011
 * 
 */
public class TimeTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int tmpHours, tmpMinutes, tmpSeconds;

		System.out.print("1.Time) Please enter the hours: ");
		tmpHours = in.nextInt();
		System.out.print("1.Time) Please enter the minutes: ");
		tmpMinutes = in.nextInt();
		System.out.print("1.Time) Please enter the seconds: ");
		tmpSeconds = in.nextInt();

		Time time1 = new Time(tmpHours, tmpMinutes, tmpSeconds);

		System.out.print("2.Time) Please enter the hours: ");
		tmpHours = in.nextInt();
		System.out.print("2.Time) Please enter the minutes: ");
		tmpMinutes = in.nextInt();
		System.out.print("2.Time) Please enter the seconds: ");
		tmpSeconds = in.nextInt();

		Time time2 = new Time(tmpHours, tmpMinutes, tmpSeconds);

		if (time1.equals(time2)) {
			System.out.println("The two times are the same:");
			System.out.println(time1);
		} else if (time1.before(time2)) {
			System.out.println(time1);
			System.out.println(time2);
		} else if (time1.after(time2)) {
			System.out.println(time2);
			System.out.println(time1);
		} else {
			System.err.println("Wow, something strange happend here!");
			System.out.println(time1);
			System.out.println(time2);
		}
	}

}
