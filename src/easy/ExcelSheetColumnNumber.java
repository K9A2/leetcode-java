/*
Author: stormlin
Personal Website: www.stormlin.com
Problem Name: 171. Excel Sheet Column Number
Problem Address: https://leetcode.com/problems/excel-sheet-column-number/#/description
Solution Date: Apr. 18, 2017
--------------------------------------------------------------------------------
Description:

Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding
column number.
--------------------------------------------------------------------------------
For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
 */

package easy;

/**
 * Problem: 171. Excel Sheet Column Number
 *
 * @Author stormlin
 * @DATE 2017/4/18
 * @TIME 14:36
 * @PROJECT LeetCode
 * @PACKAGE easy
 */

public class ExcelSheetColumnNumber {

    /**
     * Get decimal number of the input.
     *
     * @param s Input in 26 base.
     * @return Result in decimal.
     */
    public int titleToNumber(String s) {

        int index = 0;
        int carry = 1;

        for (int i = s.length() - 1; i >= 0; i--) {
            index += (s.charAt(i) - 64) * carry;
            carry *= 26;
        }

        return index;

    }

}
