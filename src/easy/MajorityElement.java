/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 169. Majority Element
 * Problem Address: https://leetcode.com/problems/majority-element/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given an array of size n, find the majority element. The majority element
 * is the element that appears more than ⌊ n/2 ⌋ times. You may assume that the
 * array is non-empty and the majority element always exist in the array.
 */

package easy;

import java.util.Arrays;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int count = 0;

        int max = 0;

        Arrays.sort(nums);

        int result = nums[0];

        int target = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    result = target;
                }
                target = nums[i];
                count = 1;
            }
        }

        if (count > max) {
            max = count;
            result = target;
        }

        return result;
    }

}
