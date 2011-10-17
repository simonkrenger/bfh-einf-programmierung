/**
 * 
 */
package ex03;

/**
 * @author simon
 *
 */
public class DataSetTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DataSet ds = new DataSet();
		
		System.out.println(ds.toString());
		
		ds.addValue(6);
		ds.addValue(5);
		System.out.println(ds.toString());
		
		ds.addValue(8);
		System.out.println(ds.toString());

		ds.addValue(99);
		ds.addValue(-20);
		System.out.println(ds.toString());
		
	}

}
