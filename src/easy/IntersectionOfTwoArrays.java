/**
 * Create by stormlin. All rights reserved.
 * Personal Website: www.stormlin.com
 * Problem Name: 349. Intersection of Two Arrays
 * Problem Address: https://leetcode.com/problems/intersection-of-two-arrays/#/description
 * Solution Date: Apr. 18, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Given two arrays, write a function to compute their intersection.
 * -----------------------------------------------------------------------------
 * Example:
 * <p>
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * -----------------------------------------------------------------------------
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 **/

package easy;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet hs = new HashSet();

        HashSet hs1 = new HashSet();

        for (int i = 0; i < nums1.length; i++) {
            hs.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            hs1.add(nums2[i]);
        }

        hs.retainAll(hs1);

        Object[] obj = hs.toArray();
        int temp[] = new int[obj.length];
        for (int i = 0; i < obj.length; i++) {
            temp[i] = (int) obj[i];
        }

        return temp;
    }

}
