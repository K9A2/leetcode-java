package easy;

/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 1. Two Sum
 * Problem Address: https://leetcode.com/problems/two-sum/#/description
 * Solution Date: Jun. 23, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
public class ImplementstrStr {

    public static int strStr(String haystack, String needle) {

        //Simplest way to do it
        return haystack.indexOf(needle);


        /* Do it with dual-loop, relatively slow */
        /*
        if (haystack.length() < needle.length()) {
            return -1;
        } else if (needle.length() == 0 || haystack.length() == 0) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            for (int j = 0; j < needle.length(); j++) {
                if ((i + j) >= haystack.length()) {
                    return -1;
                } else if (!(needle.charAt(j) == haystack.charAt(i + j))) {
                    break;
                } else if (j == needle.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
        */

    }

}
