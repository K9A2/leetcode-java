/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 415. Add Strings
 * Problem Address: https://leetcode.com/problems/add-strings/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given two non-negative integers num1 and num2 represented as string, return
 * the sum of num1 and num2.
 * -----------------------------------------------------------------------------
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to
 * integer directly.
 */

package easy;

public class AddStrings {

    public String addStrings(String num1, String num2) {
        int carry = 0;

        int sum = 0;

        StringBuilder stringBuilder = new StringBuilder();

        if (num1.length() > num2.length()) {
            num2 = AddZero(num2, num1.length() - num2.length());
        } else {
            num1 = AddZero(num1, num2.length() - num1.length());
        }

        for (int i = num1.length() - 1; i >= 0; i--) {
            sum = (num1.charAt(i) - 48) + (num2.charAt(i) - 48) + carry;
            if (sum > 9) {
                stringBuilder.append(sum - 10);
                carry = 1;
            } else {
                stringBuilder.append(sum);
                carry = 0;
            }
        }

        if (carry == 1) {
            stringBuilder.append(1);
        }

        return stringBuilder.reverse().toString();
    }

    private String AddZero(String s, int count) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            stringBuilder.append("0");
        }

        stringBuilder.append(s);

        return stringBuilder.toString();
    }

}
