public class DataSetTester 
{
	public static void main(String[] args)
	{
		DataSet bankData = new DataSet();
		bankData.add(new BankAccount(0));
		bankData.add(new BankAccount(10000));
		bankData.add(new BankAccount(2000));

		Measurable max = bankData.getMaximum();
		System.out.println("Max. balance: " + max.getMeasure());
		System.out.println("Expected: 10000.0");

		DataSet coinData = new DataSet();
		coinData.add(new Coin(0.25, "quarter"));
		coinData.add(new Coin(0.1, "dime"));
		coinData.add(new Coin(0.05, "nickel"));

		max = coinData.getMaximum();
		System.out.println("Max. coin value: " + max.getMeasure());
		System.out.println("Expected: 0.25");            
	}
}