package ch.bfh.krens1.exam01;

public class StringStackTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StringStack strst = new StringStack();

		strst.push("Hallo");
		strst.push("Welt");
		System.out.println(strst.size());
		System.out.println(strst);
		System.out.println(strst.pop());
		System.out.println(strst.pop());
		System.out.println(strst);
		System.out.println(strst.pop());
		strst.push("Simon");
		System.out.println(strst);
		System.out.println(strst.pop());
		System.out.println(strst);
	}

}
