package ex06;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class BuildingsComponent extends JComponent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1111511804162144460L;
	
	private int ORDER_SPACE = 50;
	private int BAR_WIDTH = ORDER_SPACE-20;
	
	public BuildingsComponent() {
	
	}
	
	public void paintComponent(Graphics g) {  
		Graphics2D cGraphics = (Graphics2D) g;
		
		cGraphics.setColor(Color.BLACK);
		Font font = new Font("Serif", Font.BOLD, 20);
		cGraphics.setFont(font);
		
		Building bld1 = new Building("Petronas Tower", 520);
		Building bld2 = new Building("Berner MŸnster", 100);
		Building bld3 = new Building("Empire State Building", 300);
		Building bld4 = new Building("Burj Al Arab", 800);
		Building bld5 = new Building("Another building", 350);
		
		int order = 1;
		Rectangle2D bld1Rect = new Rectangle2D.Double(5,(order*ORDER_SPACE),bld1.getHeight(),BAR_WIDTH);
		cGraphics.fill(bld1Rect);
		cGraphics.draw(bld1Rect);
		cGraphics.setColor(Color.WHITE);
		cGraphics.drawString(bld1.getName(), (order*ORDER_SPACE)+(BAR_WIDTH), 50);
		cGraphics.setColor(Color.BLACK);
		
		order++;
		Rectangle2D bld2Rect = new Rectangle2D.Double(5,(order*ORDER_SPACE),bld2.getHeight(),BAR_WIDTH);
		cGraphics.fill(bld2Rect);
		cGraphics.draw(bld2Rect);
		
		order++;
		Rectangle2D bld3Rect = new Rectangle2D.Double(5,(order*ORDER_SPACE),bld3.getHeight(),BAR_WIDTH);
		cGraphics.fill(bld3Rect);
		cGraphics.draw(bld3Rect);
		
		order++;
		Rectangle2D bld4Rect = new Rectangle2D.Double(5,(order*ORDER_SPACE),bld4.getHeight(),BAR_WIDTH);
		cGraphics.fill(bld4Rect);
		cGraphics.draw(bld4Rect);
		
		order++;
		Rectangle2D bld5Rect = new Rectangle2D.Double(5,(order*ORDER_SPACE),bld5.getHeight(),BAR_WIDTH);
		cGraphics.fill(bld5Rect);
		cGraphics.draw(bld5Rect);
	}

}
