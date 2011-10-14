package ex01;

/**
 * Tester class for CashRegister provided by the teacher
 * @author Rolf Haenni
 *
 */
public class CashRegisterTester {

	public static void main(String[] args) {
		CashRegister register = new CashRegister();

		register.recordPurchase(0.75);
		register.recordPurchase(1.50);
		register.enterDollars(2);
		register.enterDimes(3);
		System.out.print("Change: ");
		System.out.println(register.giveChange());
		System.out.println("Expected: 0.05");
	}
}
