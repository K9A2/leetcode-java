/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 383. Ransom Note
 * Problem Address: https://leetcode.com/problems/ransom-note/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given an arbitrary ransom note string and another string containing letters
 * from all the magazines, write a function that will return true if the ransom
 * note can be constructed from the magazines ; otherwise, it will return false.
 * <p>
 * Each letter in the magazine string can only be used once in your ransom note.
 * -----------------------------------------------------------------------------
 * Note:
 * You may assume that both strings contain only lowercase letters.
 * -----------------------------------------------------------------------------
 * Examples:
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */

package easy;

import java.util.Arrays;

public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        int location = 0;

        int i = 0;

        int j = 0;

        for (i = 0; i < a.length; i++) {
            for (j = location; j < b.length; j++) {
                if (a[i] == b[j]) {
                    location = j + 1;
                    break;
                }
            }
            if (j == b.length) {
                return false;
            }
        }

        return true;
    }

}
