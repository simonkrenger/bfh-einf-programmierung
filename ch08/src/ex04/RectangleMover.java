package ex04;

import java.awt.event.*;

import javax.swing.*;

public class RectangleMover {
	/**
	 * Initial width and height of the window
	 */
	private static final int WIDTH = 400, HEIGHT = 300;
	
	/**
	 * Update speed
	 */
	private static final int DELAY = 30;
	
	/**
	 * Width of the box
	 */
	private static final int BOX_WIDTH = 20;
	
	/**
	 * Height of the box
	 */
	private static final int BOX_HEIGHT = 20;
	
	/**
	 * Horizontal speed of the translation
	 */
	private static final int SPEED_X = 4;
	
	/**
	 * Vertical speed of the translation
	 */
	private static final int SPEED_Y = 4;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("An Animated Rectangle");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final RectangleComponent component = new RectangleComponent(BOX_WIDTH, BOX_HEIGHT);
		frame.add(component);
		frame.setVisible(true);

		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				component.bounce(SPEED_X, SPEED_Y);
			}
		};
		Timer t = new Timer(DELAY, listener);
		t.start();
	}
}
