import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class FaceComponent extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6596943226789327264L;

	public void paintComponent(Graphics g) {  
		Graphics2D g2 = (Graphics2D) g;

		// Draw the head
		Ellipse2D.Double head = new Ellipse2D.Double(5,10,95,150);
		g2.draw(head);

		// Draw the eyes
		g2.setColor(Color.GREEN);
		Rectangle eye = new Rectangle(25, 70, 15, 15);
		g2.fill(eye);
		eye.translate(50, 0);
		g2.fill(eye);

		// Draw the mouth
		Line2D.Double mouth = new Line2D.Double(30, 110, 80, 110);
		g2.setColor(Color.RED);
		g2.draw(mouth);

		// Draw the greeting
		Font font = new Font("Serif", Font.BOLD, 20);
		g2.setFont(font);
		g2.drawString("Hello, World!", 10, 175);
	}
}