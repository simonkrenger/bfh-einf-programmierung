import java.awt.*;
import javax.swing.*;

public class RectangleComponent extends JComponent {  
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int BOX_X = 50, BOX_Y = 50;
	private static final int BOX_WIDTH = 20, BOX_HEIGHT = 30;

	private Rectangle box;

	public RectangleComponent() {  
		box = new Rectangle(BOX_X, BOX_Y, BOX_WIDTH, BOX_HEIGHT);         
	}
	
	public void paintComponent(Graphics g) {  
		Graphics2D g2 = (Graphics2D) g;
		g2.draw(box);
	}
	
	public void moveBy(int dx, int dy) {
		box.translate(dx, dy);
		repaint(); // update drawing
	}

	public void moveTo(int x, int y) {
		box.setLocation(x, y);
		repaint(); // update drawing
	}
}