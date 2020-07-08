package ru.lember.leetcode.math;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Example 1:
 *
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 *
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * Note: Your solution should be in logarithmic time complexity.
 */
public class FactorialTrailingZeroes {

    // Считаем пятерки!
    public int trailingZeroes(int n) {

        if (n < 1) {
            return 0;
        }

        int numberOfFives = 0;
        for (long i = 5; i <= n; i *= 5) {
            numberOfFives += n/i;
        }

        return numberOfFives;
    }

}
