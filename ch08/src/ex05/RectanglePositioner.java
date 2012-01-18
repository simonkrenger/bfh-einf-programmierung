package ex05;

import java.awt.event.*;
import javax.swing.*;

public class RectanglePositioner {
	/**
	 * Variable to hold the width of the window
	 */
	private static final int WIDTH = 400;

	/**
	 * Variable to hold the height of the window
	 */
	private static final int HEIGHT = 300;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		final RectangleComponent component = new RectangleComponent();
		frame.add(component);
		frame.setVisible(true);

		MouseListener listener = new MouseListener() {
			public void mousePressed(MouseEvent event) {
				int x = event.getX(); // x-coordinate of click
				int y = event.getY(); // y-coordinate of click
				component.addRectangle(x, y);
			}
			public void mouseReleased(MouseEvent event) {}
			public void mouseClicked(MouseEvent event) {}
			public void mouseEntered(MouseEvent event) {}
			public void mouseExited(MouseEvent event) {}
		};
		component.addMouseListener(listener);
	}
}