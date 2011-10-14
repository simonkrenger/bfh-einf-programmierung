public class CashRegisterTester {

	public static void main(String[] args) {
		CashRegister register = new CashRegister();

		register.recordPurchase(0.75);
		register.recordPurchase(1.50);
		register.enterPayment(2, 0, 5, 0);
		System.out.print("Change: ");
		System.out.println(register.giveChange());
		System.out.println("Expected: 0.25");

		register.recordPurchase(2.25);
		register.recordPurchase(19.25);
		register.enterPayment(23, 2, 0, 0);
		System.out.print("Change: ");
		System.out.println(register.giveChange());
		System.out.println("Expected: 2.0");

		System.out.println("Value of a quarter: " + CashRegister.QUARTER_VALUE);
		System.out.println("Value of a dime: " + CashRegister.DIME_VALUE);
		System.out.println("Value of a nickel: " + CashRegister.NICKEL_VALUE);
	}
}