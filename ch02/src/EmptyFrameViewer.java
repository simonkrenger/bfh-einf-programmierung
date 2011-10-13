import javax.swing.*;

public class EmptyFrameViewer {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400, 200);
		frame.setLocationRelativeTo(null);
		frame.setTitle("An Empty Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
