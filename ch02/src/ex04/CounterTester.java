package ex04;

public class CounterTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter(5);
		System.out.print(c.getValue());
		c.count();
		c.count();
		System.out.println(c.getValue());
		c.reset();
		System.out.println(c.getValue());
	}

}
