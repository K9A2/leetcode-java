/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 217. Contains Duplicate
 * Problem Address: https://leetcode.com/problems/contains-duplicate/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */

package easy;

import java.util.HashSet;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        HashSet hashSet = new HashSet();
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!hashSet.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
