/*
 * Create by stormlin. All rights reserved.
 * Website: www.stormlin.com
 * Problem Name: 657. Judge Route Circle
 * Problem Address: https://leetcode.com/problems/judge-route-circle/description/
 * Solution Date: Oct. 11, 2017
 * -----------------------------------------------------------------------------
 * Problem Description:
 * Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle,
 * which means it moves back to the original place.
 * The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are
 * R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a
 * circle.
 * -----------------------------------------------------------------------------
 * Example 1:
 * Input: "UD"
 * Output: true
 * -----------------------------------------------------------------------------
 * Example 2:
 * Input: "LL"
 * Output: false
 */

package easy;

public class JudgeRouteCircle {

    public static boolean judgeCircle(String moves) {

        int[] result = new int[26];

        char[] array = moves.toCharArray();

        for (char anArray : array) {
            result[anArray - 65]++;
        }

        return (result['U' - 65] == result['D' - 65]) && (result['L' - 65] == result['R' - 65]);
    }

}
