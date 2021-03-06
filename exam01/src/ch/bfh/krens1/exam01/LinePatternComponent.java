package ch.bfh.krens1.exam01;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

/**
 * Component for drawing a line pattern on the screen.
 * 
 * @author simon
 * @since 02.12.2011
 * 
 */
public class LinePatternComponent extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Size of the pattern to be drawn (Number of iterations)
	 */
	private int patternSize = 0;

	/**
	 * Constructor for the class. Takes the number of lines to be drawn as an
	 * argument.
	 * 
	 * @param size
	 */
	public LinePatternComponent(int size) {
		this.patternSize = size;
	}

	public void paintComponent(Graphics g) {
		Graphics2D cGraphics = (Graphics2D) g;

		// First, lets calculate our borders
		double x_left = getWidth() * 0.1;
		double y_top = getHeight() * 0.1;

		double rectangle_width = getWidth() * 0.8;
		double rectangle_height = getHeight() * 0.8;

		// Now we draw the rectangle to contain our pattern
		Rectangle2D rectangle = new Rectangle2D.Double(x_left, y_top,
				rectangle_width, rectangle_height);
		cGraphics.draw(rectangle);

		for (int i = 1; i <= this.patternSize; i++) {
			double x_offset = x_left
					+ (i * (rectangle_width / this.patternSize));
			double y_offset = y_top
					+ (i * (rectangle_height / this.patternSize));

			// Calculate first line (top to right)
			Line2D l1 = new Line2D.Double(x_offset, y_top, x_left
					+ rectangle_width, y_offset);
			cGraphics.draw(l1);

			// Calculate second line (bottom to left)
			Line2D l2 = new Line2D.Double(x_offset, y_top + rectangle_height,
					x_left, y_offset);
			cGraphics.draw(l2);
		}
	}
}
