/*
 * Create by stormlin. All rights reserved.
 * Website: www.stormlin.com
 * Problem Name: 661. Image Smoother
 * Problem Address: https://leetcode.com/problems/image-smoother/description/
 * Solution Date: Set. 09, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 *  Given a 2D integer matrix M representing the gray scale of an image, you need to design a smoother to make the gray
 *  scale of each cell becomes the average gray scale (rounding down) of all the 8 surrounding cells and itself. If a cell has less than 8 surrounding cells, then use as many as you can.
 *
 * Examples:
 *  Input:
 *   [[1,1,1],
 *   [1,0,1],
 *   [1,1,1]]
 *  Output:
 *   [[0, 0, 0],[0, 0, 0],
 *   [0, 0, 0]]
 *
 * Explanation:
 *  For the point (0,0), (0,2), (2,0), (2,2): floor(3/4) = floor(0.75) = 0
 *  For the point (0,1), (1,0), (1,2), (2,1): floor(5/6) = floor(0.83333333) = 0
 *  For the point (1,1): floor(8/9) = floor(0.88888889) = 0
 *
 * Note:
 *  1. The value in the given matrix is in the range of [0, 255].
 *  2. The length and width of the given matrix are in the range of [1, 150].
 */

package easy;

public class ImageSmoother {

    public static int[][] imageSmoother(int[][] M) {

        int rows = M.length;
        int cols = M[0].length;
        int count;
        int sum = 0;

        int[] index = {-1, 0, 1};

        int[][] result = new int[rows][cols];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                count = 0;
                sum = 0;

                // Calculate the sum of its valid neighbour, then add it to itself
                for (int I = 0; I < 3; I++) {
                    for (int J = 0; J < 3; J++) {
                        if (valid(i + index[I], j + index[J], rows, cols)) {
                            count++;
                            sum += M[i + index[I]][j + index[J]];
                        }
                    }
                }

                result[i][j] = sum / count;
            }
        }

        return result;

    }

    private static boolean valid(int i, int j, int rows, int cols) {
        // Determine whether the indexes of its potential neighbour is valid
        return i >= 0 && i < rows && j >= 0 && j < cols;
    }

}
