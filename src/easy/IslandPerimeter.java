/**
 * Create by stormlin. All rights reserved.
 * Personal Website: www.stormlin.com
 * Problem Name: 463. Island Perimeter
 * Problem Address: https://leetcode.com/problems/island-perimeter/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * You are given a map in form of a two-dimensional integer grid where 1
 * represents land and 0 represents water. Grid cells are connected
 * horizontally/vertically (not diagonally). The grid is completely surrounded
 * by water, and there is exactly one island (i.e., one or more connected land
 * cells). The island doesn't have "lakes" (water inside that isn't connected
 * to the water around the island). One cell is a square with side length 1. The
 * grid is rectangular, width and height don't exceed 100. Determine the perimeter
 * of the island.
 * -----------------------------------------------------------------------------
 * Example:
 * <p>
 * [[0,1,0,0],
 * [1,1,1,0],
 * [0,1,0,0],
 * [1,1,0,0]]
 * <p>
 * Answer: 16
 **/

package easy;

public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int result = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int count = 0;
                if (grid[i][j] == 1) {
                    if (i != 0 && grid[i - 1][j] == 1) {
                        count++;
                    }
                    if (i != rows - 1 && grid[i + 1][j] == 1) {
                        count++;
                    }
                    if (j != 0 && grid[i][j - 1] == 1) {
                        count++;
                    }
                    if (j != cols - 1 && grid[i][j + 1] == 1) {
                        count++;
                    }
                    result += 4 - count;
                }
            }
        }

        return result;

    }

}
