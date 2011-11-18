/**
 * 
 */
package ex04;

import java.util.Random;

/**
 * Tester class for the ExtendedIntegerList
 * 
 * @author simon
 * @since 18.11.2011
 *
 */
public class ExtendedIntegerListTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ExtendedIntegerList eil = new ExtendedIntegerList();
		
		// Fill in some random values
		Random generator = new Random();
		for(int i=0; i<20; i++)
		{
			int random = generator.nextInt(30);
			// Make sure we don't add a value twice
			while((eil.contains(random)))
				random = generator.nextInt(30);
			eil.add(random);
		}
		eil.printList();
		
		// Swap some values
		System.out.println(eil.swap(0, 3));
		System.out.println(eil.swap(0, 6));
		System.out.println(eil.swap(0, eil.size()+1)); // Invalid position
		eil.printList();
		
		System.out.println(eil.size());
		eil.reverse();
		eil.printList();
		System.out.println(eil.size());
		
		eil.bubblesort();
		eil.printList();
	}

}
