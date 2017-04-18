/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 371. Sum of Two Integers
 * Problem Address: https://leetcode.com/problems/sum-of-two-integers/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Calculate the sum of two integers a and b, but you are not allowed to use the
 * operator + and -.
 * -----------------------------------------------------------------------------
 * Example:
 * Given a = 1 and b = 2, return 3.
 */

package easy;

public class SumOfTwoIntegers {

    public int getSum(int a, int b) {

        int carry = 0;

        while (b != 0) {
            carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }

}
