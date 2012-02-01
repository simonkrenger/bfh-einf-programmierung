package ch.bfh.krens1.exam02.ex02;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorViewer {

	/**
	 * Holds the width of the frame
	 */
	private final static int FRAME_WIDTH = 300;

	/**
	 * Holds the height of the frame
	 */
	private final static int FRAME_HEIGHT = 400;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Frame
		JFrame frame = new JFrame();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Instance of calculator
		final Calculator calc = new Calculator();

		// Panel with a GridLayout
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(0, 3, 10, 5));

		// SUM Label
		final JLabel sumLabel = new JLabel(calc.getDisplay(), JLabel.CENTER);
		panel.add(sumLabel);

		// Equals button
		ActionListener equalsButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if (!calc.isAwaitingNewNumber()) {
					calc.addDisplayToSum();
					sumLabel.setText(calc.getDisplay());
					calc.reset();
				}
				System.out.println(calc); // Debug
			}
		};
		JButton eqButton = new JButton("=");
		eqButton.addActionListener(equalsButtonListener);
		panel.add(eqButton);

		// Plus button
		ActionListener plusButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				if (!calc.isAwaitingNewNumber()) {
					calc.addDisplayToSum();
					sumLabel.setText(calc.getDisplay());
				}
				System.out.println(calc); // Debug
			}
		};
		JButton plusButton = new JButton("+");
		plusButton.addActionListener(plusButtonListener);
		panel.add(plusButton);

		// Number buttons below
		ActionListener numberButtonListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				JButton pressedButton = (JButton) evt.getSource();
				calc.addNumber(pressedButton.getText());
				sumLabel.setText(calc.getDisplay());
				System.out.println(calc); // Debug
			}
		};
		for (int i = 9; i >= 0; i--) {
			JButton numberButton = new JButton(String.valueOf(i));
			numberButton.addActionListener(numberButtonListener);
			panel.add(numberButton);
		}

		frame.add(panel);
		frame.setVisible(true);
	}

}
