/*
 * Create by stormlin. All rights reserved.
 * Website: www.stormlin.com
 * Problem Name: 387. First Unique Character in a String
 * Problem Address: https://leetcode.com/problems/first-unique-character-in-a-string/description/
 * Solution Date: Set. 09, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 *  Given a string, find the first non-repeating character in it and return it's index. If it doesn't
 *  exist, return -1.
 *
 * Examples:
 *  s = "leetcode"
 *  return 0.
 *  s = "loveleetcode",
 *  return 2.
 *
 * Note: You may assume the string contain only lowercase letters.
 */

package easy;

public class FirstUniqueCharacterinaString {

    public static int firstUniqChar(String s) {

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;

    }

}
