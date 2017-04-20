/*
Author: stormlin
Personal Website: www.stormlin.com
Problem Name: 492. Construct the Rectangle
Problem Address: https://leetcode.com/problems/construct-the-rectangle/#/description
Solution Date: Apr. 20, 2017
--------------------------------------------------------------------------------
For a web developer, it is very important to know how to design a web page's size.
So, given a specific rectangular web page’s area, your job by now is to design
a rectangular web page, whose length L and width W satisfy the following requirements:

1. The area of the rectangular web page you designed must equal to the given target area.

2. The width W should not be larger than the length L, which means L >= W.

3. The difference between length L and width W should be as small as possible.
You need to output the length L and the width W of the web page you designed in sequence.
--------------------------------------------------------------------------------
Example:
Input: 4
Output: [2, 2]
Explanation: The target area is 4, and all the possible ways to construct it
are: [1,4], [2,2], [4,1].
But according to requirement 2, [1,4] is illegal; according to requirement 3,
[4,1] is not optimal compared to [2,2]. So the length L is 2, and the width W is 2.
--------------------------------------------------------------------------------
Note:
The given area won't exceed 10,000,000 and is a positive integer
The web page's width and length you designed must be positive integers.
 */

package easy;

/**
 * Problem: 492. Construct the Rectangle
 *
 * @Author stormlin
 * @DATE 2017/4/20
 * @TIME 19:32
 * @PROJECT LeetCode
 * @PACKAGE easy
 */

public class ConstructTheRectangle {

    /**
     * Figure out the width and length that meet the requirements above.
     * <p>
     * If the area is a quadratic power of a single number(width = length),
     * the difference is at its minimal value, 0. Therefore, we find the
     * value of its square root, and subtract 1 until it can be exact divided
     * or down to 0.
     *
     * @param area Area Input
     * @return Result of width and length in a int array
     */
    public static int[] constructRectangle(int area) {

        int[] result = new int[2];

        int sqrt = (int) Math.sqrt(area);

        while (area % sqrt != 0) {
            sqrt--;
        }
        result[1] = sqrt;
        result[0] = area / sqrt;

        return result;
    }

}
