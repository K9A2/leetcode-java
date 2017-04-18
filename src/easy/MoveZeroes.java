/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 283. Move Zeroes
 * Problem Address: https://leetcode.com/problems/move-zeroes/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given an array nums, write a function to move all 0's to the end of it while
 * maintaining the relative order of the non-zero elements.
 * -----------------------------------------------------------------------------
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
 * should be [1, 3, 12, 0, 0].
 * -----------------------------------------------------------------------------
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */

package easy;

import java.util.ArrayList;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        ArrayList list = new ArrayList();
        ArrayList zero = new ArrayList();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero.add(0);
            } else {
                list.add(nums[i]);
            }
        }
        list.addAll(zero);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) list.get(i);
        }
    }

}
