package ru.lember.leetcode.math;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 * Example 2:
 *
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 *
 * // 4 approaches:
 *         // 1 - sort, then check. complexity: O(nlong), memory O(1)
 *         // 2 - hashset, then check. complexity: O(n + n) = O(n), memory O(n)
 *         // 3 - bit manupulation xor each index with each element and get missing. complexity: O(n), memory O(1)
 *         // 4 - Gauss formula
 */
public class MissingNumber {

    /**
     * Gaussian
     */
    int missingNumber(int[] nums) {

        int expectedSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    int missingNumberBit(int[] nums) {

        int missing = nums.length;
        for (int i = 0; i < nums.length; i++) {
            missing ^= i ^ nums[i];
        }

        return missing;
    }

    int missingNumberSort(int[] nums) {

        Arrays.sort(nums);


        if (nums[0] != 0) {
            return 0;
        }

        if (nums[nums.length - 1] != nums.length) { // сравниваем с nums.length, т.к. какое-то число должно быть пропущено
            return nums.length;
        }

        for (int i = 1; i < nums.length; i++) {
            int expected = nums[i - 1] + 1;
            if (expected != nums[i]) {
                return expected;
            }
        }

        return -1; // в этом алгоритме дело не дойдет до этого.
    }

    int missingNumberSet(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return -1;
    }
}
