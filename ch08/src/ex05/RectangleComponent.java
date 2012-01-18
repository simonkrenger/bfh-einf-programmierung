package ex05;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

/**
 * Class to represent a JComponent that allows the user to add rectangles to a
 * plane. Features a method to add a rectangle at a specified point.
 * 
 * @author simon
 * @since 18.01.2012
 * 
 */
public class RectangleComponent extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Variable holding the default width of a new rectangle
	 */
	private static final int BOX_WIDTH = 20;

	/**
	 * Variable holding the default height of a new rectangle
	 */
	private static final int BOX_HEIGHT = 30;

	/**
	 * List holding all rectangles on the component
	 */
	private ArrayList<Rectangle> boxList = new ArrayList<Rectangle>();

	public RectangleComponent() {

	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		for (Rectangle box : boxList)
			g2.draw(box);
	}

	/**
	 * Method to add a rectangle to the component at the specified location
	 * 
	 * @param x
	 *            X coordinate
	 * @param y
	 *            Y coordinate
	 */
	public void addRectangle(int x, int y) {
		boxList.add(new Rectangle(x, y, BOX_WIDTH, BOX_HEIGHT));
		repaint();
	}
}