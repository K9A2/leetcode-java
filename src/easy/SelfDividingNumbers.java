package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 728. Self Dividing Numbers
 * Problem Address: https://leetcode.com/problems/self-dividing-numbers/description/
 * Solution Date: Dec. 26, 2017
 * -----------------------------------------------------------------------------
 * A self-dividing number is a number that is divisible by every digit it contains.
 * <p>
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * <p>
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * <p>
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * -----------------------------------------------------------------------------
 * Example:
 * Input:
 * left = 1, right = 22
 * Output:
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * -----------------------------------------------------------------------------
 * Note: The boundaries of each input argument are 1 <= left <= right <= 10000.
 */

public class SelfDividingNumbers {

    public static List<Integer> selfDividingNumbers(int left, int right) {

        ArrayList<Integer> result = new ArrayList<>();
        boolean allZero;

        for (int i = left; i <= right; i++) {
            allZero = true;
            char[] digits = Integer.toString(i).toCharArray();
            for (char digit : digits) {
                if (digit == '0' || i % (digit - 48) != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) {
                result.add(i);
            }
        }

        return result;

    }

}
