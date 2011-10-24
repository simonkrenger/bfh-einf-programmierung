package ex02;

public class ChecksumTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Expected: 5
		System.out.println(ChecksumTool.digitSum(23));
		
		// Expected: 31
		System.out.println(ChecksumTool.digitSum(278437));
		
		//Expected: 0
		System.out.println(ChecksumTool.digitSum(0));
		
		System.out.println(Integer.MAX_VALUE);
		// Expecte: 46
		System.out.println(ChecksumTool.digitSum(Integer.MAX_VALUE));
	}
}
