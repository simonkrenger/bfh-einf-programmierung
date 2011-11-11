/**
 * 
 */
package ex05;
import javax.swing.JFrame;

/**
 * Tester class for the SpiralComponent
 * @author simon
 *
 */
public class SpiralViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setTitle("My awesome spiral");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SpiralComponent spc = new SpiralComponent(5,5,100);
		frame.add(spc);
		
		frame.setVisible(true);
	}

}
