/**
 * Create by stormlin. All rights reserved.
 * Personal Website: www.stormlin.com
 * Problem Name: 258. Add Digits
 * Problem Address: https://leetcode.com/problems/add-digits/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.
 * -----------------------------------------------------------------------------
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only
 * one digit, return it.
 **/

package easy;

public class AddDigits {

    public int addDigits(int num) {
        String s = String.valueOf(num);
        return (s.length() == 1) ? s.charAt(0) - 48 : getCalculate(s);
    }

    private int getCalculate(String s) {
        int sum;
        while (s.length() != 1) {
            sum = 0;
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - 48;
            }
            s = String.valueOf(sum);
        }
        return s.charAt(0) - 48;
    }

}
