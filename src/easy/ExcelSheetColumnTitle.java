/*
Author: stormlin
Personal Website: www.stormlin.com
Problem Name: 168. Excel Sheet Column Title
Problem Address: https://leetcode.com/problems/excel-sheet-column-title/#/description
Solution Date: Apr. 18, 2017
--------------------------------------------------------------------------------
Description:
Given a positive integer, return its corresponding column title as appear in an
Excel sheet.
--------------------------------------------------------------------------------
For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
 */

package easy;

/**
 * Convert a decimal number into a 26-base result string.
 *
 * @Author stormlin
 * @DATE 2017/4/18
 * @TIME 15:03
 * @PROJECT LeetCode
 * @PACKAGE easy
 */

public class ExcelSheetColumnTitle {

    /**
     * Convert 26-base string into decimal number.
     * Assuming that the letter A -> 0 and Z -> 25, so this solution is
     * similar to binary-decimal exchange.
     * @param n
     * @return
     */
    public String convertToTitle(int n) {

        StringBuilder result = new StringBuilder();

        while (n != 0) {
            result.append((char) ((n - 1) % 26 + 65));
            n = (n - 1) / 26;
        }

        return result.reverse().toString();

    }

}
