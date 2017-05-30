package app;

import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.util.Scanner;

/**
 * Compute the best path travelling west-to-east across the state of Colorado.
 * The best path is the one with the least elevation change (the flattest).
 * 
 * @author Katie Jergens
 *
 */
public class MountainPaths {

	/**
	 * Main method calls the helper functions and prints results. You do not
	 * need to change the main method.
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		// Declarations
		final int width = 844;
		final int height = 480;
		DrawingPanel panel = new DrawingPanel(width, height);
		Graphics graphicsPanel = panel.getGraphics();
		int[][] grid = new int[height][width];

		// Step 1 - Fill grid with data from file.
		fillGrid(grid, height, width);

		// Step 2 - Find the min and max elevations in the grid.
		int min = getMin(grid);
		int max = getMax(grid);

		System.out.println("Lowest elevation: " + min);
		System.out.println("Highest elevation: " + max);

		// Step 3 - Draw the map
		drawMap(graphicsPanel, grid);

		// Step 4 - Draw greedy path from first latitude (top row)
		graphicsPanel.setColor(Color.BLUE);
		int totalRows = grid.length;
		int elevationOfBestPath = drawGreedyPath(graphicsPanel, grid, 0);
		int bestRow = 0; // best row so far

		// Step 5 - Draw greedy paths from every row and save the best one.
		for (int i = 1; i < totalRows; i++) {

			int elev = drawGreedyPath(graphicsPanel, grid, i);

			System.out
					.println("The path that starts at row " + i + " has a total elevation change of " + elev + " ft.");

			if (elev < elevationOfBestPath) {
				elevationOfBestPath = elev;
				bestRow = i; // best row so far
			}
		}

		// Step 5 - Re-Draw path with lowest total elevation change in green.
		graphicsPanel.setColor(Color.GREEN);
		int totalChange = drawGreedyPath(graphicsPanel, grid, bestRow);

		System.out.println("\nFINAL RESULTS\nThe best path starts at row " + bestRow
				+ " and has a total elevation change of " + totalChange + " ft.");

	}

	/**
	 * Fill the 2D array with the values from the file.
	 * 
	 * @param grid
	 * @param numRows
	 * @param numCols
	 * @throws Exception
	 */
	public static void fillGrid(int[][] grid, int numRows, int numCols) throws Exception {

		Scanner scan = new Scanner(new File("Colorado_844x480.dat"));

		// TODO your code (Hint: use scan.nextInt to read the numbers from the
		// file)

		scan.close();
	}

	/**
	 * Finds the minimum value in a 2d array of ints.
	 * 
	 * @param grid
	 *            a 2D array from which you want to find the smallest value
	 * @return the smallest value in the given 2D array
	 */
	public static int getMin(int[][] grid) {

		int min = -1;

		// TODO your code

		return min;
	}

	/**
	 * Finds the maximum value in a 2d array of ints.
	 * 
	 * @param grid
	 *            a 2D array from which you want to find the largest value
	 * @return the largest value in the given 2D array
	 */
	public static int getMax(int[][] grid) {

		int max = -1;

		// TODO your code

		return max;
	}

	/**
	 * Create an image from a 2D array of elevation data.
	 * 
	 * Note: To make the gray scale values, first find the min and max values in
	 * the grid. Then use the formula:
	 * 
	 * gray = 255 * (currentValue - min) / (max - min)
	 * 
	 * (Explanation of gray scale formula: http://bit.ly/2lwIsf2)
	 * 
	 * For every value in the grid, do the following:
	 * 
	 * Set the color of graphics panel to the scaled gray using
	 * graphics.setColor(new Color(gray, gray, gray))
	 * 
	 * Then fill in a 1x1 rectangle on the graphics panel spot like this:
	 * g.fillRect(col, row, 1, 1);
	 * 
	 * 
	 * @param graphics
	 *            a Graphics context to use
	 * @param grid
	 *            a 2D array of the data
	 */
	public static void drawMap(Graphics graphics, int[][] grid) {

		// TODO your code

	}

	/**
	 * Draws the best route from West-to-East in the given grid. Start from the
	 * given starting row. The best row is defined as the one with the least
	 * elevation change, i.e. the flattest.
	 * 
	 * @param g
	 *            - the graphics context to use
	 * @param grid
	 *            - the 2D array of elevation values
	 * @param row
	 *            - the starting row for traversing to find the min path
	 * @return total elevation of the route
	 */
	public static int drawGreedyPath(Graphics g, int[][] grid, int rowStart) {

		// Declarations. You will need more than these.
		int totalElevationChange = 0;
		int currentElevation = grid[rowStart][0];

		// Iterate through the columns left-to-right, i.e. travel west-to-east.
		for (int col = 1; col < grid[rowStart].length; col++) {

			/*
			 * Step 1: Compute the elevation change for going straight ahead,
			 * for going diagonally north, and for going diagonally south. Then
			 * pick the best direction to take. (Note: elevation change is the
			 * difference in elevation from the current spot to next spot
			 * without regard to if you are stepping up or down, i.e., you need
			 * absolute value.)
			 */

			// TODO Step 1a. Compute delta of stepping fwd (straight ahead)

			// TODO Step 1b. Compute delta of stepping fwd+left (diagonally
			// north). (Hint: you
			// need to check your are not going out of bounds)

			// TODO Step 1c. Compute delta of stepping fwd+right (diagonally
			// south). (Hint: you
			// need to check your are not going out of bounds)

			/*
			 * TODO Step 2: Compare the three and pick the one with the smallest
			 * elevation change. If there is a tie between forward and the other
			 * directions, forward wins. Else, if there is a tie between left
			 * and right, left wins. After you've chosen, add the elevation
			 * change the total elevation.
			 */

			// TODO Step 3. Save this elevation to use in the computation for
			// the next column.

			// TODO Step 4. Mark the path on the graphics panel.

		}

		return totalElevationChange;
	}

}