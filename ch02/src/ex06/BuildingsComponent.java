package ex06;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.JComponent;

public class BuildingsComponent extends JComponent {

	private static final long serialVersionUID = 1L;

	/**
	 * Defines the clearance between the bars.
	 */
	private int CLEARANCE = 40;
	
	/**
	 * Array to hold a dynamic amount of buildings
	 */
	private ArrayList<Building> bldList = new ArrayList<Building>();

	/**
	 * Constructor for our Component that draws buildings
	 */
	public BuildingsComponent() {
		
		// Create objects for our 5 towers and add them to the list
		bldList.add(new Building("Sears Towers", 527));
		bldList.add(new Building("Taipei 101", 508));
		bldList.add(new Building("Petronas Towers", 452));
		bldList.add(new Building("Empire State Building", 449));
		bldList.add(new Building("Eiffel Tower", 324));
	}

	public void paintComponent(Graphics g) {
		Graphics2D cGraphics = (Graphics2D) g;
		
		// Alright, calculate the width of a single bar
		double recalculatedBarWidth = (getHeight() - CLEARANCE) / bldList.size() - CLEARANCE;
		
		// For the purpose of resizing the X value of the rectangle, get the highest building
		double largestBuilding = getHeightOfLargestTower(bldList);
		
		// Set up the environment
		Font font = new Font("Serif", Font.BOLD, (int) (recalculatedBarWidth/2));
		cGraphics.setFont(font);

		for (int i = 0; i < bldList.size(); i++) {
			Building tmpBld = bldList.get(i);
			
			// Calculate the Y position of this building on our frame
			double yPosition = CLEARANCE + i * (CLEARANCE + recalculatedBarWidth);
			
			// How high (=width of the rectangle) does this building have to be painted?
			// Multiply the value with 0.9 so we do not fill the window completely and leave free space left and right
			double rectangleWidth = tmpBld.getHeight() / largestBuilding * getWidth() * 0.9;

			
			cGraphics.setColor(Color.RED);
			Rectangle2D bldRect = new Rectangle2D.Double(10, yPosition, rectangleWidth, recalculatedBarWidth);
			cGraphics.fill(bldRect);
			cGraphics.draw(bldRect);

			cGraphics.setColor(Color.BLACK);
			cGraphics.drawString(tmpBld.getName() + "(" + tmpBld.getHeight() + "m)", 20, (int) (yPosition + 0.75*recalculatedBarWidth));
		}

	}

	/**
	 * Helper method to get the highest building from a list of buildings
	 * @param buildingsList An ArrayList containing all the buildings that will be compared to eachother.
	 * @return The height of the largest building
	 */
	private int getHeightOfLargestTower(ArrayList<Building> buildingsList) {
		int tempHeight = 0;
		for(Building b : buildingsList)
		{
			if(b.getHeight() > tempHeight)
				tempHeight = b.getHeight();
		}
		return tempHeight;
	}
}
