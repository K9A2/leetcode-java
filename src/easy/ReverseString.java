/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 344. Reverse String
 * Problem Address: https://leetcode.com/problems/reverse-string/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Write a function that takes a string as input and returns the string reversed.
 * -----------------------------------------------------------------------------
 * Example:
 * Given s = "hello", return "olleh".
 */

package easy;

public class ReverseString {

    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
