/*
 * Create by stormlin. All rights reserved.
 * Website: www.stormlin.com
 * Problem Name: 66. Plus One
 * Problem Address: https://leetcode.com/problems/plus-one/description/
 * Solution Date: Set. 08, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 */

package easy;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        int plus = 1;
        int sum = 0;
        for(int i = digits.length - 1; plus >= 0; i--) {
            sum = digits[i] + plus;
            if(sum > 9) {
                digits[i] = sum - 10;
                plus = 1;
                if(i == 0) {
                    List<Integer> result = new ArrayList<>(digits.length);
                    for (int digit : digits) {
                        result.add(digit);
                    }
                    result.add(0, plus);
                    int[] newArray = new int[result.size()];
                    for(int j = 0; j < result.size(); j++) {
                        newArray[j] = result.get(j);
                    }
                    return newArray;
                }
            } else {
                digits[i] = sum;
                return digits;
            }
        }

        return digits;

    }

}
