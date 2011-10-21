/**
 * 
 */
package ex06;

import javax.swing.JOptionPane;

import ex01.CashRegister;

/**
 * Simulator for a CashRegister.
 * Displays DialogBoxes to the user for input
 * @author simon
 * @since 21.10.2011
 * 
 */
public class CashRegisterSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// The CashRegister object we will be using
		CashRegister cr = null;
		
		// Default the user choice to "No"
		int userChoice = JOptionPane.NO_OPTION;

		do {
			// Reset the CashRegister
			cr = new CashRegister();

			// Ask the user for the purchase amount
			String purchaseAmount = JOptionPane.showInputDialog(null,
					"Please enter the purchase amount", "Purchase Amount",
					JOptionPane.QUESTION_MESSAGE);
			cr.recordPurchase(Double.parseDouble(purchaseAmount));

			// Ask the user what the customer gave
			String numDollars = JOptionPane.showInputDialog(null,
					"Please enter the number of dollars", "Dollars",
					JOptionPane.QUESTION_MESSAGE);
			cr.enterDollars(Integer.parseInt(numDollars));

			String numQuarters = JOptionPane.showInputDialog(null,
					"Please enter the number of quarters", "Quarters",
					JOptionPane.QUESTION_MESSAGE);
			cr.enterQuarters(Integer.parseInt(numQuarters));

			String numDimes = JOptionPane.showInputDialog(null,
					"Please enter the number of dimes", "Dimes",
					JOptionPane.QUESTION_MESSAGE);
			cr.enterDimes(Integer.parseInt(numDimes));

			String numNickels = JOptionPane.showInputDialog(null,
					"Please enter the number of nickels", "Nickels",
					JOptionPane.QUESTION_MESSAGE);
			cr.enterNickels(Integer.parseInt(numNickels));

			// Calculate the change and format it
			String fChange = String.format("%.2f", cr.giveChange());
			JOptionPane.showMessageDialog(null,
					"Thank you for your purchase.\nYour change: $" + fChange,
					"Change", JOptionPane.PLAIN_MESSAGE);

			// After we are done, ask if the user wants to enter another purchase
			userChoice = JOptionPane.showConfirmDialog(null,
					"Do you want to enter another purchase?", "Repeat",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

		} while (userChoice == JOptionPane.YES_OPTION);
	}
}
