/**
 * 
 */
package ch.bfh.krens1.exam01;

import javax.swing.JFrame;

/**
 * @author simon
 * 
 */
public class LinePatternViewer {

	private static final int PATTERN_SIZE = 100;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(1000, 700);
		frame.setTitle("Line Pattern");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		LinePatternComponent lpc = new LinePatternComponent(PATTERN_SIZE);
		frame.add(lpc);

		frame.setVisible(true);

	}

}
