import java.util.Scanner;
 
public class EarthquakeTester
{  
	public static void main(String[] args)
	{  
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a magnitude on the Richter scale: ");
		double magnitude = in.nextDouble();
		Earthquake quake = new Earthquake(magnitude);
		System.out.println(quake.getDescription());
	}
}