/*
 * Create by stormlin
 * Name: 338. Counting Bits
 * Address: https://leetcode.com/problems/counting-bits/description/
 * Date: May. 22, 2018
 */

package medium;

public class CountingBits {

    public static int[] countBits(int num) {

        if (num == 0) {
            return new int[]{0};
        }
        if (num == 1) {
            return new int[]{0, 1};
        }

        int[] result = new int[num + 1];
        result[0] = 0;
        result[1] = 1;

        int length = 2;
        for (int i = 2; i <= num; ) {
            for (int j = 0; j < length && i + j <= num; j++) {
                result[i + j] = result[i + j - length] + 1;
            }
            i += length;
            length = length << 1;
        }

        return result;
    }

}
