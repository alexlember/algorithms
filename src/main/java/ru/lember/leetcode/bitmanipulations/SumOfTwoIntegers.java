package ru.lember.leetcode.bitmanipulations;

/**
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 *
 * Example 1:
 *
 * Input: a = 1, b = 2
 * Output: 3
 * Example 2:
 *
 * Input: a = -2, b = 3
 * Output: 1
 */
public class SumOfTwoIntegers {

    public int getSum(int a, int b) {
        int carry;
        while (b != 0) { // iterate till there's no carry.
            carry = a & b; // common set of bits of x and y
            a = a ^ b;
            b = carry << 1;
        }
        return a;

    }

}
