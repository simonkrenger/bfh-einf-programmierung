import java.util.Scanner;
public class DataAnalyzer
{  
	public static void main(String[] args)
	{  
		Scanner in = new Scanner(System.in);
		DataSet data = new DataSet();
		while (true) {  
			System.out.print("Enter value, q to quit: ");
			String input = in.next(); 
			if (input.equals("q"))
				break;
			double x = Double.parseDouble(input);
			data.add(x);
		}
		System.out.println("Average: " + data.getAverage());
		System.out.println("Maximum: " + data.getMaximum());
	}
}