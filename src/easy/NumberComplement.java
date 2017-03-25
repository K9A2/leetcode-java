package easy;

/**
 * Create by Stormlin. All rights reserved.
 *
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.
 *
 * Note:
 * The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 * You could assume no leading zero bit in the integer’s binary representation.
 *
 * Example 1:
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 *
 * Example 2:
 * Input: 1
 * Output: 0
 * Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.
 *
 **/

public class NumberComplement {

    public int findComplement(int num) {

        int one = 1;
        int count = 0;
        //确定这个数在无前导 0 位的时候有多少位
        for (int i = 0; i < 32; i++) {
            if ((num & one) != 0) {
                count = i;
            }
            one = one << 1;
        }
        //把整个数取反，并且把原数有效的部分全部置 1
        //之后两数相与
        num = ~num;
        one = 1;
        int temp = 1;
        for (int i = count; i > 0; i--) {
            one = one << 1;
            temp += one;
        }

        return temp & num;
    }

}
