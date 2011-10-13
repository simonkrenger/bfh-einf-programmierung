package ex06;

import javax.swing.JFrame;

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
