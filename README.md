# Mountain Path Project

### Summary
Find and draw a good path to cross the state of Colorado by foot.

## Getting Started
1. Clone the starter project from this repository: https://github.com/daltonschool/MountainPathProject.git
2. Look at MountainPaths.java. This is what you will edit.
3. DrawingPanel.java has been written for you. You do not need to change it.

## Overview
I want to cross the state of Colorado by foot. How far west-to-east it is is fixed, but I have a choice over which hills, mountains, and valleys I encounter along the way. If I choose poorly I am making my trip so much harder! 

In this project you will determine a good route to take. The project contains a file with all the elevations (in feet, in 1x1 squares) of Colorado. You will draw an elevation map (where white represents the highest elevation, black the lowest, and shades of gray in between). Then you try several paths, starting from the north-most row and working your way south, and compute the total elevation changes. Finally, tell me which one has the least elevation change, i.e. which is the flattest. That way I'll know where to start my journey.

## Instructions
1. Fill a 2D array of ints with the elevation data from the file by completing the function fillGrid().
1. To color the map, we want to use white for the highest elevation, black for the lowest elevation, and degrees of gray in between. To do this, first find the minimum and maxiumum values in the array by completing getMin() and getMax(). 

   **Checkpoint:** After this step, the Lowest Elevation and Highest Elevation will print to the console.
    ![First console output](console-output-01.png)
    
1. Now you can draw the map by completing the function drawMap().

   **Checkpoint:** After this step, the graphics panel will look like this:
   ![Graphics panel](graphics-panel.png)

1. Finally, we can start comparing paths. Complete the function drawGreedyPath().  
  1. Start at the west side of the state (column 0).  
  2. Then compute the elevation changes for 3 choices for the next step ahead: straight ahead, diagonally north (this won't apply when you are at row 0, but will for all the others), and diagonally south (this won't apply for the last row but it will for all the others).  
  3. pick the best direction to take (the one with the least elevation change).  
    1. Note: elevation change is the difference in elevation from the current spot to next spot without regard to if you are stepping up or down, i.e., you need absolute value.

