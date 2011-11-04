package ex02;

import java.util.Scanner;

public class FactorEvaluatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner myscan = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = myscan.nextInt();
		
		System.out.println("Using my method:");
		FactorEvaluator.printFactors(number);
		
		System.out.println("Using the teachers method:");
		FactorEvaluator.printFactorsTeacher(number);

	}

}
