/*
Author: stormlin
Personal Website: www.stormlin.com
Problem Name: 557. Reverse Words in a String III
Problem Address: https://leetcode.com/problems/reverse-words-in-a-string-iii/#/description
Solution Date: Jun. 4, 2017
--------------------------------------------------------------------------------
Given a string, you need to reverse the order of characters in each word within a sentence while still preserving
whitespace and initial word order.
--------------------------------------------------------------------------------
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */

package easy;

import javax.lang.model.element.NestingKind;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem: 557. Reverse Words in a String III
 *
 * @Author stormlin
 * @DATE 2017/6/4
 * @TIME 11:20
 * @PROJECT LeetCode
 * @PACKAGE easy
 */

public class Reverse_Words_in_a_String_III {

    public static String reverseWords(String s) {

        StringBuilder result = new StringBuilder();

        for (String item : s.split(" ")) {
            StringBuilder temp = new StringBuilder();
            temp.append(item).reverse();
            result.append(temp).append(" ");
        }

        return result.delete(result.length() - 1, result.length()).toString();

    }

}
