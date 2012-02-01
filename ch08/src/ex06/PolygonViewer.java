package ex06;

import java.awt.event.*;
import javax.swing.*;

public class PolygonViewer {

	private static final 
	int FRAME_WIDTH = 500, FRAME_HEIGHT = 300;

	public static void main(String[] args) {
		final PolygonComponent component = new PolygonComponent();

		// Add mouse press listener         
		component.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {  
				if (event.isControlDown())
					component.clear();
				else
					component.addPoint(event.getPoint());
			}
			public void mousePressed(MouseEvent event) {  
				component.selectPoint(event.getPoint());
			}
		});

		// Add mouse drag listener         
		component.addMouseMotionListener(new MouseAdapter() {
			public void mouseDragged(MouseEvent event) {
				component.drag(event.getPoint());
			}
		});

		JFrame frame = new JFrame();
		frame.setTitle("Polygon");
		frame.add(component);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setVisible(true);
	}
}