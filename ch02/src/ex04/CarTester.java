package ex04;

public class CarTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Car simonsCar = new Car(7.0);
		
		System.out.println(simonsCar.toString());
		
		simonsCar.fillUp(14.0);
		System.out.println(simonsCar.toString());
		
		simonsCar.drive(100);
		System.out.println(simonsCar.toString());
		
		simonsCar.drive(50);
		System.out.println(simonsCar.toString());
		
		simonsCar.drive(200);
		System.out.println(simonsCar.toString());
	}

}
