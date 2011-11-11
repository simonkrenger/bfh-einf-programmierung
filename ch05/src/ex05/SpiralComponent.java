package ex05;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

/**
 * Class for drawing a spiral with lines.
 * 
 * @author simon
 * @since 11.11.2011
 * 
 */
public class SpiralComponent extends JComponent {

	private static final long serialVersionUID = 1L;

	/**
	 * Space between the individual lines
	 */
	private int SPACE;

	/**
	 * Length of the current line
	 */
	private int LENGTH;

	/**
	 * This many iterations will be painted
	 */
	private int ITERATIONS;

	/**
	 * X coordinate of starting point
	 */
	private int START_X = 0;

	/**
	 * Y coordinate of starting point
	 */
	private int START_Y = 0;

	/**
	 * Constructor for the class that takes its basic properties. The center
	 * point of the spiral is at the center of the window.
	 * 
	 * @param initialLength
	 *            Initial length of the first line in the spiral
	 * @param spaceBetweenLines
	 *            Space between the lines
	 * @param iterations
	 *            Iterations to draw (this many lines will be drawn)
	 */
	public SpiralComponent(int initialLength, int spaceBetweenLines,
			int iterations) {
		this.START_X = getWidth() / 2;
		this.START_Y = getHeight() / 2;
		this.LENGTH = initialLength;
		this.SPACE = spaceBetweenLines;
		this.ITERATIONS = iterations;
	}

	/**
	 * Constructor for the class that takes its basic properties and the
	 * coordinates of the starting point.
	 * 
	 * @param initialLength
	 *            Initial length of the first line in the spiral
	 * @param spaceBetweenLines
	 *            Space between the lines
	 * @param iterations
	 *            Iterations to draw (this many lines will be drawn)
	 * @param startX
	 *            X coordinate of the starting point
	 * @param startY
	 *            Y coordinate of the starting point
	 */
	public SpiralComponent(int initialLength, int spaceBetweenLines,
			int iterations, int startX, int startY) {
		this.START_X = startX;
		this.START_Y = startY;
		this.LENGTH = initialLength;
		this.SPACE = spaceBetweenLines;
		this.ITERATIONS = iterations;
	}

	public void paintComponent(Graphics g) {

		Graphics2D cGraphics = (Graphics2D) g;

		int startX = START_X;
		int startY = START_Y;
		int endX = 0;
		int endY = 0;
		int tmpLength = this.LENGTH;

		for (int i = 0; i <= this.ITERATIONS; i++) {

			if (i % 2 == 0)
				tmpLength = tmpLength + this.SPACE;

			switch (i % 4) {
			case 0: // right
				endX = startX + this.LENGTH;
				endY = startY;
				break;
			case 1: // up
				endX = startX;
				endY = startY + this.LENGTH;
				break;
			case 2: // left
				endX = startX - this.LENGTH;
				endY = startY;
				break;
			case 3: // down
				endX = startX;
				endY = startY - this.LENGTH;
				break;
			}

			Line2D line = new Line2D.Double(startX, startY, endX, endY);
			cGraphics.draw(line);

			startX = endX;
			startY = endY;

		}
	}

}
