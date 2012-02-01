package ex06;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

public class PolygonComponent extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int DISK_RADIUS = 5;
	private static final Color DISK_COLOR = Color.RED, LINE_COLOR = Color.BLACK;

	private ArrayList<Point2D> points;
	private Point2D selectedPoint;
	private Point2D oldMousePoint;

	public PolygonComponent() {
		points = new ArrayList<Point2D>();
	}

	public void addPoint(Point mousePoint) {
		points.add(mousePoint);
		System.out.println(mousePoint);
		repaint();
	}

	public void selectPoint(Point mousePoint) {
		selectedPoint = null;
		for (Point2D point : points) {
			if (point.distance(mousePoint) < DISK_RADIUS) 
				selectedPoint = point;
		}
		if (selectedPoint == null) // drag polygon
			oldMousePoint = mousePoint;
	}

	public void drag(Point newMousePoint) {
		if (selectedPoint == null) // drag polygon 
		{
			double dx = newMousePoint.getX() - oldMousePoint.getX();
			double dy = newMousePoint.getY() - oldMousePoint.getY();
			for (Point2D point : points) {
				point.setLocation(point.getX() + dx, point.getY() + dy);
			}
			oldMousePoint = newMousePoint;
		}
		else // drag selected point
		{
			selectedPoint.setLocation(newMousePoint.getX(), newMousePoint.getY());
		}
		repaint();
	}

	public void paintComponent(Graphics g) {  
		Graphics2D g2 = (Graphics2D)g;

		for (Point2D p : points) {
			Ellipse2D disk = new Ellipse2D.Double(p.getX() - DISK_RADIUS, p.getY() - DISK_RADIUS, 2 * DISK_RADIUS, 2 * DISK_RADIUS);
			g2.setColor(DISK_COLOR);
			g2.fill(disk);
		}  

		for (int i = 0; i < points.size(); i++) {
			Point2D from = points.get(i);
			Point2D to = points.get((i + 1) % points.size());
			if (from != to) {
				g2.setColor(LINE_COLOR);
				g2.draw(new Line2D.Double(from, to));
			}
		}
	}

	public void clear() {
		points.clear();
		repaint();
	}
}