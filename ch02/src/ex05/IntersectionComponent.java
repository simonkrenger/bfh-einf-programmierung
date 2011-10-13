package ex05;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class IntersectionComponent extends JComponent {
	
	public void paintComponent(Graphics g) {  
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle2D box1 = new Rectangle2D.Double(5,5,80,40);
		Rectangle2D box2 = new Rectangle2D.Double(30,30,160,100);
		
		g2.draw(box1);
		g2.draw(box2);
		
		if(box1.intersects(box2))
		{
			Rectangle2D boxIntersection = box1.createIntersection(box2);
			g2.setColor(Color.RED);
			g2.fill(boxIntersection);
			g2.draw(boxIntersection);
		}
	}
}
