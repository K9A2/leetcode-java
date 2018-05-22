/*
 * Create by stormlin
 * Name: 693. Binary Number with Alternating Bits
 * Address: https://leetcode.com/problems/binary-number-with-alternating-bits/description/
 * Date: Oct. 10, 2017
 */

package easy;

public class BinaryNumberWithAlternatingBits {

    public static boolean hasAlternatingBits(int n) {

        // Supposed it is a 32-bit integer
        int bitLen = 32;
        int one = 0;
        int zero = 0;

        for (int i = bitLen; i > 0; i--) {
            if ((n & 1) == 1) {
                one++;
                if (zero > 1) {
                    return false;
                }
                zero = 0;
            } else {
                zero++;
                if (one > 1) {
                    return false;
                }
                one = 0;
            }
            n = n >> 1;
        }

        return true;
    }

}
