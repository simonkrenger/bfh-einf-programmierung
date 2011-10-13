import javax.swing.*;

public class RectangleViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 200);
		frame.setTitle("Two Rectangles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		RectangleComponent component = new RectangleComponent();
		frame.add(component);

		frame.setVisible(true);
	}
}