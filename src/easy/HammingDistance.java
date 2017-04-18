/**
 * Create by stormlin. All rights reserved.
 * Personal Website: www.stormlin.com
 * Problem Name: 461. Hamming Distance
 * Problem Address: https://leetcode.com/problems/hamming-distance/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * The Hamming distance between two integers is the number of positions at which
 * the corresponding bits are different. Given two integers x and y,
 * calculate the Hamming distance.
 * -----------------------------------------------------------------------------
 * Note:
 * 0 ≤ x, y < 231.
 * -----------------------------------------------------------------------------
 * Example:
 * <p>
 * Input: x = 1, y = 4
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * <p>
 * The above arrows point to positions where the corresponding bits are different.
 **/

package easy;

public class HammingDistance {

    public int hammingDistance(int x, int y) {

        return Integer.bitCount(x ^ y);

    }

}
