package ex03;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Exercise with Buttons and ActionListeners
 * 
 * @author simon
 * @since 13.01.2012
 * 
 */
public class ButtonCounter {

	/**
	 * Holds the width of the frame
	 */
	private final static int FRAME_WIDTH = 200;

	/**
	 * Holds the height of the frame
	 */
	private final static int FRAME_HEIGHT = 100;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Set up two counters
		final Counter counter_a = new Counter();
		final Counter counter_b = new Counter();

		// Set up the frame that will hold our elements
		JFrame frame = new JFrame();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Counters");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create two buttons A and B
		JButton button_a = new JButton("A");
		JButton button_b = new JButton("B");

		// Create two labels with initial text
		final JLabel label_a = new JLabel("Button A: " + counter_a.getCount());
		final JLabel label_b = new JLabel("Button B: " + counter_b.getCount());

		// Place the elements above on a panel
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0,2,10,0));
		panel.add(button_a);
		panel.add(label_a);
		panel.add(button_b);
		panel.add(label_b);

		// Add that panel to the frame
		frame.add(panel);

		// Set up ActionListener for button A
		ActionListener listener_a = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				counter_a.increase();
				label_a.setText("Button A: " + counter_a.getCount());
			}
		};
		button_a.addActionListener(listener_a);

		// Set up ActionListener for button B
		ActionListener listener_b = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				counter_b.increase();
				label_b.setText("Button B: " + counter_b.getCount());
			}
		};
		button_b.addActionListener(listener_b);

		// Show
		frame.setVisible(true);
	}

}
