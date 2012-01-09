package ex02;

import java.util.ArrayList;

/**
 * Tester class for this exercise. Instantiates all iterators and iterates
 * through a test object.
 * 
 * @author simon
 * @since 09.01.2012
 * 
 */
public class IteratorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Iterator> iterators = new ArrayList<Iterator>();

		// DigitsIterator
		iterators.add(new DigitsIterator());

		// StringIterator
		iterators.add(new StringIterator("Another test"));

		// StringListIterator
		ArrayList<String> sl = new ArrayList<String>();
		sl.add("Here");
		sl.add("is");
		sl.add("my");
		sl.add("list");
		iterators.add(new StringListIterator(sl));

		// StringTableIterator
		String[][] testTable = { { "Top left", "Top middle", "Top right" },
				{ "Center left", "Center middle", "Center right" },
				{ "Bottom left", "Bottom middle", "Bottom right" } };
		iterators.add(new StringTableIterator(testTable));
		
		// Test all iterators
		for (Iterator i : iterators) {
			while (i.hasNext()) {
				System.out.println(i.next());
			}
		}
	}

}
