/**
 * 
 */
package ex06;

import java.util.Scanner;

/**
 * Tester class for the MagicSquare class
 * @author simon
 * @since 21.11.2011
 *
 */
public class MagicSquareTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter an odd number to create a magic square: ");
		int sqSize = in.nextInt();
		
		MagicSquare m = new MagicSquare(sqSize);
		m.print();
		
		System.out.println("The magic number is " + m.magicNumber());
		
		System.out.println(m.isMagic());
	}

}
