package easy;

/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 367. Valid Perfect Square
 * Problem Address: https://leetcode.com/problems/valid-perfect-square/#/description
 * Solution Date: Jun. 27, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 * -----------------------------------------------------------------------------
 * Example 1:
 * Input: 16
 * Returns: True
 * -----------------------------------------------------------------------------
 * Example 2:
 * Input: 14
 * Returns: False
 * -----------------------------------------------------------------------------
 * Note:
 * Note: Do not use any built-in library function such as sqrt.
 */
public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {
        if (num == 0) {
            return true;
        }
        for (int i = 1; i <= num / i; i++) {
            if ((i * i) == num) {
                return true;
            }
        }
        return false;
    }

}
