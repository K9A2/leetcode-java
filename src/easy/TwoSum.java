package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 1. Two Sum
 * Problem Address: https://leetcode.com/problems/two-sum/#/description
 * Solution Date: Jun. 23, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * -----------------------------------------------------------------------------
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        /*
         *  This method uses the HashMap to store the indices and return an anonymous
         *  array to avoid unnecessary actions.
         */
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }

        //Case the array length equals 2
        return new int[]{nums[0], nums[1]};

        /*
         * Below is a really slow solution implements in O(n^2) time complexity.
         */
        /*
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            result[0] = i;
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
        */

    }

}
