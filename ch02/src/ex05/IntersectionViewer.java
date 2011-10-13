package ex05;


import javax.swing.JFrame;

public class IntersectionViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 200);
		frame.setTitle("Two Rectangles and their intersection");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		IntersectionComponent component = new IntersectionComponent();
		frame.add(component);

		frame.setVisible(true);
	}
}
