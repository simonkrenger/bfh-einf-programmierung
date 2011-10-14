package ex01;

import java.math.BigDecimal;

/**
 * Cash Register class with all internal variables as BigDecimal.
 * BigDecimal allows for better precision than double.
 * @author simon
 * @since 14.10.2011
 *
 */
public class CashRegister {
	
	/**
	 * Define the Dollar as $1.00
	 */
	public static final BigDecimal DOLLAR_VALUE = new BigDecimal("1");
	
	/**
	 * Define the quarter as $0.25
	 */
	public static final BigDecimal QUARTER_VALUE = new BigDecimal("0.25");
	
	/**
	 * Define the dime as $0.1
	 */
	public static final BigDecimal DIME_VALUE = new BigDecimal("0.1");
	
	/**
	 * Define the nickel as $0.05
	 */
	public static final BigDecimal NICKEL_VALUE = new BigDecimal("0.05");

	/**
	 * Variable that contains the total of all purchases for a customer
	 */
	private BigDecimal purchase;
	
	/**
	 * Contains the amount of cash the customer paid.
	 * This is then used to calculate the amount of change.
	 */
	private BigDecimal payment;

	/**
	 * Constructor for the CashRegister class.
	 */
	public CashRegister() {
		purchase = new BigDecimal(0);
		payment = new BigDecimal(0);
	}

	/**
	 * Adds another item the customer purchased.
	 * The specified amount is added to the total purchase
	 * @param amount Dollars the item costs
	 */
	public void recordPurchase(double amount) {
		purchase = purchase.add(DOLLAR_VALUE.multiply(new BigDecimal(amount)));
	}

	/**
	 * Enters a payment the customer makes.
	 * 
	 * @param dollars Specifies the amount of dollar bills the customer pays
	 * @param quarters Specifies the amount of quarters the customer pays
	 * @param dimes Specifies the amount of dimes the customer pays
	 * @param nickels Specifies the amount of nickels the customer pays
	 */
	public void enterPayment(int dollars, int quarters, int dimes, int nickels) {
		enterDollars(dollars);
		enterQuarters(quarters);
		enterDimes(dimes);
		enterNickels(nickels);
	}
	
	/**
	 * Adds the specified amount of dollars to the total payment.
	 * @param amount Dollars added to the total payment
	 */
	public void enterDollars(int amount) {
		payment = payment.add(DOLLAR_VALUE.multiply(new BigDecimal(amount)));
	}
	
	/**
	 * Adds the specified amount of quarters to the total payment.
	 * @param amount Quarters added to the total payment
	 */
	public void enterQuarters(int amount) {
		payment = payment.add(QUARTER_VALUE.multiply(new BigDecimal(amount)));
	}
	
	/**
	 * Adds the specified amount of dimes to the total payment.
	 * @param amount Dimes added to the total payment
	 */
	public void enterDimes(int amount) {
		payment = payment.add(DIME_VALUE.multiply(new BigDecimal(amount)));
	}
	
	/**
	 * Adds the specified amount of nickels to the total payment.
	 * @param amount Nickels added to the total payment
	 */
	public void enterNickels(int amount) {
		payment = payment.add(NICKEL_VALUE.multiply(new BigDecimal(amount)));
	}

	/**
	 * Calculates the change the customer gets.
	 * @return Amount of change the customer receives.
	 */
	public double giveChange() {
		BigDecimal change = payment.subtract(purchase);
		purchase = new BigDecimal(0);
		payment = new BigDecimal(0);
		return change.doubleValue();
	}
}