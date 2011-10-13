package ex02;

public class LetterSwitcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String bfh = "Berner Fachhochschule";
		System.out.println(bfh);
		
		bfh = bfh.replace('e', 'a');
		bfh = bfh.replace('a', 'u');
		
		System.out.println(bfh);

	}

}
