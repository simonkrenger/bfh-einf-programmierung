package ex01.utils;

import java.util.Random;

/**
 * Class for generating random names.
 * 
 * @author simon
 * @since 09.12.2011
 * 
 */
public class RandomNameGen {

	/**
	 * Method to generate a random name for a person. The format is
	 * "<First Name> <Last Name>". Stolen from here:
	 * http://www.dreamincode.net/code/snippet5057.htm
	 * 
	 * @return A random String in the format "<First Name> <Last Name>"
	 */
	public static String getRandomPersonName() {
		Random rand = new Random();
		String[] fNames = new String[] { "Tom", "Jacob", "Jake", "Ethan",
				"Jonathan", "Tyler", "Samuel", "Nicholas", "Angel", "Jayden",
				"Nathan", "Elijah", "Christian", "Gabriel", "Benjamin", "Emma",
				"Aiden", "Ryan", "James", "Abigail", "Logan", "John", "Daniel",
				"Alexander", "Isabella", "Anthony", "William", "Christopher",
				"Matthew", "Emily", "Madison", "Rob", "Ava", "Olivia",
				"Andrew", "Joseph", "David", "Sophia", "Noah", "Justin", };

		String[] lNames = new String[] { "Smith", "Johnson", "Williams",
				"Jones", "Brown", "Davis", "Miller", "Wilson", "Moore",
				"Taylor", "Anderson", "Thomas", "Jackson", "White", "Harris",
				"Martin", "Thompson", "Garcia", "Martinez", "Robinson",
				"Clark", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young",
				"King", "Wright", "Hill", "Scott", "Green", "Adams", "Baker",
				"Carter", "Turner", };

		return fNames[rand.nextInt(fNames.length - 1)] + " "
				+ lNames[rand.nextInt(lNames.length - 1)];
	}
}
