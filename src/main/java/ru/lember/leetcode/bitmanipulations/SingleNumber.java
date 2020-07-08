package ru.lember.leetcode.bitmanipulations;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {


        /*

        Предположительно, нужно провести xor на каждый элемент, что останется в итоге, то и будет.
        Возможно, нужно обработать 0.

         */

        int current = nums[0];

        for (int i = 1; i < nums.length; i++) {
            current ^= nums[i];
        }

        return current;
    }

}
