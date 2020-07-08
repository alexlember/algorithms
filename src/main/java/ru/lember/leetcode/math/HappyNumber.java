package ru.lember.leetcode.math;

/**
 * Write an algorithm to determine if a number n is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * Return True if n is a happy number, and False if not.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class HappyNumber {


    // 1 % 10 = 1
    // 1 / 10 = 0
    // problem similar to finding cycle in linked list.
    boolean isHappy(int n) {

        int x = n;
        int y = n;

        while (x > 1) {

            x = sumOfDigitsSquare(x);
            if (x == 1) {
                return true;
            }


            y = sumOfDigitsSquare(sumOfDigitsSquare(y));

            if (y == 1) {
                return true;
            }

            if (x == y) {
                return false;
            }
        }
        return true;
    }


    private int sumOfDigitsSquare(int x) {
        int sum = 0;
        while (x > 0) {
            int rightDigit = x % 10;
            sum += rightDigit * rightDigit;
            x /= 10;
        }
        return sum;
    }
}
