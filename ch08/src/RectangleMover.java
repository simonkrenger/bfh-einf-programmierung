import java.awt.event.*;
import javax.swing.*;

public class RectangleMover {
	private static final int WIDTH = 400, HEIGHT = 300;
	private static final int DELAY = 50; // milliseconds 

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("An Animated Rectangle");
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		final RectangleComponent component = new RectangleComponent();
		frame.add(component);
		frame.setVisible(true);

		ActionListener listener = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				component.moveBy(1, 0);
			}
		};
		Timer t = new Timer(DELAY, listener);
		t.start();
	}
}