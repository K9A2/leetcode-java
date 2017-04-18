/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 231. Power of Two
 * Problem Address: https://leetcode.com/problems/power-of-two/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given an integer, write a function to determine if it is a power of two.
 */

package easy;

public class PowerofTwo {

    public boolean isPowerOfTwo(int n) {

        int count = 0;

        if (n == 0) {
            return false;
        }

        if (n < 0) {
            return false;
        }

        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
            if (count > 1) {
                return false;
            }
        }

        return true;

    }
}
