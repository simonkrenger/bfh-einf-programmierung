package ex07;

import javax.swing.JFrame;

/**
 * Viewer class for the Conway Game of Life provided by the teacher
 * @author Rolf Haenni, simon
 *
 */
public class GameOfLifeViewer {
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame();

		final int WIDTH = 100;
		final int HEIGHT = 100;
		final int CELL_SIZE = 8;
		final int FRAME_WIDTH = WIDTH * CELL_SIZE;
		final int FRAME_HEIGHT = HEIGHT * CELL_SIZE + 23; // plus window header
		final int DELAY = 100;

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Game of Life");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GameOfLife game = new GameOfLife(WIDTH, HEIGHT);
		game.createBlinker(10, 10);
		game.createBlinker(10, 30);
		game.createGlider(20, 30);
		game.createPentomino(50, 50);
		
		//game.createGun(10, 10);
		
		//game.createRandom();

		GameOfLifeComponent component = new GameOfLifeComponent(game,
				(double) CELL_SIZE);
		frame.add(component);
		frame.setVisible(true);

		while (true) {
			Thread.sleep(DELAY);
			game.nextGeneration();
			component.repaint();
		}
	}
}
