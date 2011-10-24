public class Earthquake
{
	private double richter;
	public Earthquake(double magnitude)
	{
		richter = magnitude;
	}
	public String getDescription()
	{
		String r;
		if (richter >= 8.0)
			r = "Most structures fall";
		else if (richter >= 7.0)
			r = "Many buildings destroyed";
		else if (richter >= 6.0)
			r = "Many buildings considerably damaged, some collapse";
		else if (richter >= 4.5)
			r = "Damage to poorly constructed buildings";
		else if (richter >= 3.5)
			r = "Felt by many people, no destruction";
		else if (richter >= 0)
			r = "Generally not felt by people";
		else
			r = "Negative numbers are not valid";
		return r;
	}
}