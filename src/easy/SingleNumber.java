/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 136. Single Number
 * Problem Address: https://leetcode.com/problems/single-number/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given an array of integers, every element appears twice except for one. Find
 * that single one.
 * -----------------------------------------------------------------------------
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 */

package easy;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

}
