/*
Author: stormlin
Personal Website: www.stormlin.com
Problem Name: 167. Two Sum II - Input array is sorted
Problem Address: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/#/description
Solution Date: Apr. 20, 2017
--------------------------------------------------------------------------------
Given an array of integers that is already sorted in ascending order, find two
numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add
up to the target, where index1 must be less than index2. Please note that your
returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not
use the same element twice.
--------------------------------------------------------------------------------
Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */

package easy;

/**
 * Problem: 167. Two Sum II - Input array is sorted
 *
 * @Author stormlin
 * @DATE 2017/4/20
 * @TIME 20:59
 * @PROJECT LeetCode
 * @PACKAGE easy
 */

public class TwoSumII_InputArrayIsSorted {

    /**
     * Get the indices which number[index1] + number[index2] == target.
     * <p>
     * Solutions with 2 loops is easy to come up with. But it waste lots of
     * time in passing the consecutive zeros or other numbers which would not
     * meet the requirement with their sum. So I add a loop for skipping these
     * consecutive numbers.
     *
     * @param numbers Numbers array, in ascending order.
     * @param target  Target that we want the two numbers meet with their sum.
     * @return Indices.
     */
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];

        int i = 0;
        int j;

        while (i < numbers.length - 1) {
            //Loop used for skipping those consecutive numbers which would
            // not meet the requirement with their sum.
            while (numbers[i] == numbers[i + 1]) {
                if (numbers[i] + numbers[i + 1] == target) {
                    result[0] = i + 1;
                    result[1] = ++i + 1;
                    return result;
                }
                i++;
            }
            j = i + 1;
            while (j < numbers.length) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = ++i;
                    result[1] = ++j;
                    return result;
                }
                j++;
            }
            i++;
        }

        return result;
    }
}
