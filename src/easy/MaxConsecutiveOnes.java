/**
 * Author: stormlin
 * Personal Website: www.stormlin.com
 * Problem Name: 485. Max Consecutive Ones
 * Problem Address: https://leetcode.com/problems/max-consecutive-ones/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 * -----------------------------------------------------------------------------
 * Example 1:
 * <p>
 * Input: [1,1,0,1,1,1]
 * <p>
 * Output: 3
 * <p>
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 * -----------------------------------------------------------------------------
 * Note:
 * The input array will only contain 0 and 1.
 * The length of input array is a positive integer and will not exceed 10,000
 */

package easy;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0, j = 0; i < nums.length; ) {
            if (nums[i] == 1) {
                j = i;
                count = 0;
                while (j < nums.length && nums[j] == 1) {
                    count++;
                    j++;
                }
                i += count;
                if (count > max) {
                    max = count;
                }
            } else {
                i++;
            }
        }
        return max;
    }
}
