package ru.lember.leetcode.array;

import java.util.Stack;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class PlusOne {

    /**
     * Рабочее решение (в общем виде, можно легко модифицировать в plusN), но немного избыточное + есть расход доп. памяти.
     */
    public int[] plusOne(int[] digits) {

        Stack<Integer> stack = new Stack<>();

        int lastDigit = digits[digits.length - 1];
        int plusOne = lastDigit + 1;
        int carry = (plusOne) - 9;
        stack.push(carry > 0 ? 0 : plusOne);

        for (int i = digits.length - 2; i >= 0; i--) {

            int current = digits[i];
            if (carry > 0) {
                current += carry;
            }

            carry = current - 9;
            stack.push(carry > 0 ? 0 : current);
        }

        if (carry > 0) {
            stack.push(1);
        }

        int[] result = new int[stack.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = stack.pop();
        }

        return result;
    }


    /**
     * Короткое решение.
     */
    public int[] plusOneShort(int[] digits) {

        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }

}
