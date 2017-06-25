package medium;

import java.util.Arrays;

/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 215. Kth Largest Element in an Array
 * Problem Address: https://leetcode.com/problems/kth-largest-element-in-an-array/#/description
 * Solution Date: Jun. 25, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order,
 * not the kth distinct element.
 * For example,
 * Given [3,2,1,5,6,4] and k = 2, return 5.
 * -----------------------------------------------------------------------------
 * Note:
 * You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

}
