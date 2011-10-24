import java.util.Scanner;

public class TaxReturnTester
{  
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Please enter your income: ");
		double income = in.nextDouble();

		System.out.print("Please enter S (single) or M (married): ");
		String input = in.next();
		int status = 0;

		if (input.equalsIgnoreCase("S")) 
	 		status = TaxReturn.SINGLE;
		else if (input.equalsIgnoreCase("M")) 
			status = TaxReturn.MARRIED;
		else {
			System.out.println("Bad input.");
			return;
		}		
		TaxReturn aTaxReturn = new TaxReturn(income, status);
		System.out.println("The tax is "+ aTaxReturn.getTax());
	}
}