/*
 * Create by stormlin. All rights reserved.
 * Website: www.stormlin.com
 * Problem Name: 506. Relative Ranks
 * Problem Address: https://leetcode.com/problems/relative-ranks/description/
 * Solution Date: Oct. 10, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be
 * awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 * -----------------------------------------------------------------------------
 * Example 1:
 * Input: [5, 4, 3, 2, 1]
 * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 * For the left two athletes, you just need to output their relative ranks according to their scores.
 * -----------------------------------------------------------------------------
 * Note:
 * 1. N is a positive integer and won't exceed 10,000.
 * 2. All the scores of athletes are guaranteed to be unique.
 */

package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Hashtable;

public class RelativeRanks {

    public static String[] findRelativeRanks(int[] nums) {

        Hashtable<Integer, Integer> table = new Hashtable<>();

        // Get the maximum number in this array, and put the corresponding
        // index and value into a hash table
        for (int i = 0; i < nums.length; i++) {
            table.put(nums[i], i);
        }

        // Sort the original array to get the first three number
        Arrays.sort(nums);
        String[] result = new String[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                result[table.get(nums[i])] = "Gold Medal";
            } else if (i == nums.length - 2 ) {
                result[table.get(nums[i])] = "Silver Medal";
            } else if (i == nums.length - 3) {
                result[table.get(nums[i])] = "Bronze Medal";
            } else {
                result[table.get(nums[i])] = String.valueOf(nums.length - i);
            }
        }

        return result;
    }

}
