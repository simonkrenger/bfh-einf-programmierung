package ex04;

import java.awt.*;
import javax.swing.*;

/**
 * Class to represent a RectangleComponent that consists of a rectangle on a
 * plane. The class provides methods to move the rectangle or to cause it to
 * bounce around in the component.
 * 
 * Idea taken from here:
 * http://www.dreamincode.net/forums/topic/69704-bouncing-rectangle/
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
	 * Constant to define the starting point of the box
	 */
	private static final int BOX_X = 50, BOX_Y = 50;

	/**
	 * Variable for bouncing, defines if the box is currently moving to the
	 * right
	 */
	private boolean translateRight = true;

	/**
	 * Variable for bouncing, defines if the box is currently moving down.
	 */
	private boolean translateDown = true;

	/**
	 * Variable to hold the box itself
	 */
	private Rectangle box;

	/**
	 * Constructor for the class, takes the height and width of the box as an
	 * argument. The box will be drawn at the starting point defined in this
	 * class.
	 * 
	 * @param boxWidth
	 *            Width of the box to be drawn
	 * @param boxHeight
	 *            Height of the box to be drawn
	 */
	public RectangleComponent(int boxWidth, int boxHeight) {
		box = new Rectangle(BOX_X, BOX_Y, boxWidth, boxHeight);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(box);
	}

	/**
	 * Method to move the rectangle by a defined X value and a defined Y value
	 * 
	 * @param dx
	 *            Horizontal difference
	 * @param dy
	 *            Vertical difference
	 */
	public void moveby(int dx, int dy) {
		box.translate(dx, dy);
		repaint();
	}

	/**
	 * Method to bounce the box around. Takes the vertical and horizontal speed
	 * of the operation as parameters.
	 * 
	 * @param dx
	 *            Horizontal speed of the operation
	 * @param dy
	 *            Vertical speed of the operation
	 */
	public void bounce(int dx, int dy) {

		java.awt.Point p = box.getLocation();
		int x = p.x;
		int y = p.y;

		// Calculate new X
		if (x >= getWidth() - box.getWidth()) {
			translateRight = false;
		} else if (x <= 0) {
			translateRight = true;
		}
		x = translateRight ? p.x + dx : p.x - dx;

		// Calculate new Y
		if (y >= getHeight() - box.getHeight()) {
			translateDown = false;
		} else if (y <= 0) {
			translateDown = true;
		}
		y = translateDown ? p.y + dy : p.y - dy;

		moveTo(x, y);
	}

	/**
	 * Method to move the box to a certain point on the grid
	 * 
	 * @param x
	 *            X coordinate of the new location
	 * @param y
	 *            Y coordinate of the new location
	 */
	public void moveTo(int x, int y) {
		box.setLocation(x, y);
		repaint(); // update drawing
	}
}