package ex03;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class CalendarExercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long MILLIS_PER_DAYS = 1000 * 60 * 60 * 24;
		String DATE_FORMAT = "yyyy.MM.dd '(ISO week no: 'w')'";
		
		GregorianCalendar gregCal = new GregorianCalendar();
		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		
		/* Print todays date */
		Date currentDate = gregCal.getTime();
		System.out.println("Today: " + sdf.format(currentDate));
		
		/* Calculate the date 100 days from now */
		gregCal.add(Calendar.DATE, 100);
		Date inHundredDays = gregCal.getTime();
		System.out.println("In 100 days: " + sdf.format(inHundredDays));
	
		/* Calculate days Mozart lived */
		gregCal.set(1791, 11, 05);
		long mozartDeath = gregCal.getTimeInMillis();
		gregCal.set(1756, 0, 27);
		long mozartBirth = gregCal.getTimeInMillis();
		
		long daysMozartLived = (mozartDeath - mozartBirth) / MILLIS_PER_DAYS;
		System.out.println("Mozart lived " + daysMozartLived + " days");
	
		/* Calculate his day of death based on the days he lived */
		gregCal.add(Calendar.DATE, (int) (daysMozartLived));
		Date mozartDeathDate = gregCal.getTime();
		
		System.out.println("Mozart died on the " + sdf.format(mozartDeathDate));
		}

}
