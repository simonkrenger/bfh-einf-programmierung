package ex06;

import javax.swing.JFrame;

/**
 * A viewer for our BuildingComponent.
 * Displays a frame and adds a BuildingComponent to the frame.
 * @author simon
 * @since 14.10.2011
 *
 */
public class BuildingViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(1000, 500);
		frame.setTitle("Towers of the world");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		BuildingsComponent bldC = new BuildingsComponent();
		frame.add(bldC);
		
		frame.setVisible(true);

	}

}
