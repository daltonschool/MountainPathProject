# Mountain Path Project

### Summary
Find and draw a good route across the state of Colorado.

## Getting Started
1. Clone the starter project from this repository: https://github.com/daltonschool/MountainPathProject.git
2. Look at MountainPaths.java. This is what you will edit.
3. DrawingPanel.java has been written for you. You do not need to change it.

## Instructions
1. First read in the data file that contains the elevation of the state of Colorado broken into 1x1 foot squares. Fill a 2D array of ints with this data by completing the function fillGrid().
1. When coloring the map, we want to use white for the highest elevation, black for the lowest elevation, and degrees of gray in between. To do this, first find the minimum and maxiumum values in the array by completing getMin() and getMax(). 

   **Checkpoint:** After this step, the Lowest Elevation and Highest Elevation will print to the console.
    ![First console output](console-output-01.png)
    
1. Now you can draw the map by completing the function drawMap().

   **Checkpoint:** After this step, the graphics panel will look like this:
   ![Graphics panel](graphics-panel.png)

