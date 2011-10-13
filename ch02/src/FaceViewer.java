import javax.swing.*;

public class FaceViewer {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(200, 250);
		frame.setTitle("An Alien Face");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		FaceComponent component = new FaceComponent();
		frame.add(component);

		frame.setVisible(true);
	}
}