package ex07;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

/**
 * Component for the Game Of Life
 * @author simon
 *
 */
public class GameOfLifeComponent extends JComponent {

	private static final long serialVersionUID = 1L;

	private GameOfLife game = null;
	private double cellSize = 0;

	public GameOfLifeComponent(GameOfLife game, double cell_size) {
		this.game = game;
		this.cellSize = cell_size;
	}

	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		
		int height = game.getHeight();
		int width = game.getWidth();
		
		g2.setColor(Color.BLACK);
		for(int x = 0; x < width; x++) {
			for(int y = 0; y < height; y++) {
				Rectangle2D r = new Rectangle2D.Double(x*cellSize,y*cellSize,cellSize,cellSize);
				if(game.getCell(x, y) == 1)
					g2.fill(r);
				g2.draw(r);
			}
		}
	}
}
