package ex05;

/**
 * This class provides the possibility to represent a line. Internally, the line
 * is represented with a linear function in the form (y = f(x) = m*x+q).
 * 
 * @author simon
 * @since 28.10.2011
 * 
 */
public class Line {

	/**
	 * Internal field to hold the slope (m) of a line.
	 * If the line is vertical, this will hold Double.POSITIVE_INFINITY.
	 */
	private double m;

	/**
	 * Internal field to hold the y-intersect (q) of a line
	 */
	private double q;

	/**
	 * Internal field to hold the position of the line if the line is vertical.
	 */
	private double a;

	/**
	 * Internal field to define if the line is vertical. False by default.
	 */
	private boolean isVertical = false;

	/**
	 * A line is created with 2 points in a cartesian system.
	 * 
	 * @param x1
	 *            X coordinate of the first point
	 * @param y1
	 *            Y coordinate of the first point
	 * @param x2
	 *            X coordinate of the second point
	 * @param y2
	 *            Y coordinate of the second point
	 */
	public Line(double x1, double y1, double x2, double y2) {
		if (x1 == x2) {
			this.isVertical = true;
			this.a = x1;
			this.m = Double.POSITIVE_INFINITY;
		} else {
			this.m = (y2 - y1) / (x2 - x1);
			this.q = y1 - this.m * x1;
		}
	}

	/**
	 * Constructs a line with one point and a slope
	 * @param x X-coordinate of the point
	 * @param y Y-coordinate of the point
	 * @param slope The slope of the line
	 */
	public Line(double x, double y, double slope) {
		this.m = slope;
		this.q = y - this.m * x;

	}

	/**
	 * Constructs a line with a given slope and a given y-intercept.
	 * @param slope The slope of the line
	 * @param b The y-intercept (sometimes called q)
	 */
	public Line(double slope, double b) {
		this.m = slope;
		this.q = b;
	}

	/**
	 * Constructs a vertical line.
	 * @param a
	 */
	public Line(double a) {
		this.a = a;
		this.m = Double.POSITIVE_INFINITY;
		this.isVertical = true;
	}

	/**
	 * Method to read the y-intercept of the line
	 * 
	 * @return Returns the y-intercept of the line.
	 */
	public double getQ() {
		return this.q;
	}

	/**
	 * Method to read the slope of the line.
	 * 
	 * @return Returns the slope of the line and returns Double.POSITIVE_INFINITY if the
	 *         line is vertical.
	 */
	public double getSlope() {
		return this.m;
	}

	/**
	 * Checks if a line is vertical
	 * @return Returns TRUE if the line is vertical
	 */
	public boolean isVertical() {
		return this.isVertical;
	}

	
	public double getVerticalLocation() {
		return this.a;
	}

	public boolean isHorizontal() {
		if (this.getSlope() == 0)
			return true;
		return false;
	}

	/**
	 * Checks if two lines are equal to eachother.
	 * 
	 * @param other
	 *            The line that will be compared
	 * @return TRUE if the two lines have the same attributes and are therefore
	 *         the same
	 */
	public boolean equals(Line other) {
		if (this.isVertical() && other.isVertical()) {
			if (this.getVerticalLocation() == other.getVerticalLocation())
				return true;
			else
				return false;
		} else {
			if (this.getSlope() == other.getSlope())
				if (this.getQ() == other.getQ())
					return true;
			return false;
		}
	}

	/**
	 * Checks if two lines are parallel to eachother.
	 * 
	 * @param other
	 *            This line will be compared
	 * @return TRUE if the lines are parallel, FALSE if not
	 */
	public boolean isParallel(Line other) {
		return (this.isVertical() && other.isVertical()) || (this.getSlope() == other.getSlope());
	}

	/**
	 * Checks if two lines intersect. This is checked by applying the
	 * "isParallel" function.
	 * 
	 * @param other
	 *            This line will be compared
	 * @return TRUE if the lines intersect, FALSE if they are parallel (and thus
	 *         never intersect)
	 */
	public boolean intersects(Line other) {
		if (this.isParallel(other)) {
			if (this.equals(other))
				return true;
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Line [m=" + m + ", q=" + q + ", a=" + a + ", isVertical="
				+ isVertical + "]";
	}

}
