public class BankAccount {

	private static double RATE = 0.015; // static variable
	private double balance; // instance variable
	
	public BankAccount() { 
		balance = 0;
	}

	public void deposit(double amount) { // explicit parameter
		balance += amount;
	}
		
	public void transfer(double amount, BankAccount other) { // explicit parameters
		this.balance -= amount; // implicit parameter
		other.balance += amount;
	}
	
	public void addInterest() {
		double interest = balance * RATE; // local variable
		balance += interest; 
	}

	public double getBalance() {
		return balance; 
	}
}