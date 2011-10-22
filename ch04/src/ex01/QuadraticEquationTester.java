/**
 * 
 */
package ex01;

import java.util.Scanner;

/**
 * @author simon
 *
 */
public class QuadraticEquationTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Quadratic equation a*x^2+b*x+c=0");

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the coefficient a: ");
		int coeffA = scan.nextInt();
		System.out.print("Please enter the coefficient b: ");
		int coeffB = scan.nextInt();
		System.out.print("Please enter the coefficient c: ");
		int coeffC = scan.nextInt();
		
		QuadraticEquation qe = new QuadraticEquation(coeffA, coeffB, coeffC);
		System.out.println(qe);
		
	}

}
