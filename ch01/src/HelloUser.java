/**
 * 
 */

import java.util.Scanner;

/**
 * @author simon
 * @since 26.09.2011
 */
public class HelloUser {
	public static void main(String[] args) {
		String fname = "";
		String lname = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		fname = input.nextLine();

		System.out.print("Enter your last name: ");
		lname = input.nextLine();

		System.out.println("Hello " + fname + " " + lname);
	}
}