import java.awt.*;
import javax.swing.*;

public class RectangleComponent extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6163845021797049062L;

	public void paintComponent(Graphics g) {  
		Graphics2D g2 = (Graphics2D) g; // Cast g to Graphics2D

		Rectangle box = new Rectangle(5, 10, 40, 50);
		
		g2.draw(box); // Draw rectangle
		
		box.translate(15, 25);	
		g2.draw(box); // Draw moved rectangle
	}
}