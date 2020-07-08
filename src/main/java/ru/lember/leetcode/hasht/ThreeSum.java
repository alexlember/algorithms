package ru.lember.leetcode.hasht;

import java.util.*;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 *
 * Note:
 *
 * The solution set must not contain duplicate triplets.
 *
 * Example:
 *
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 *
 * A solution set is:
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class ThreeSum {

    List<List<Integer>> threeSum(int[] nums) {

        if (nums.length == 0) {
            return Collections.emptyList();
        }

        Set<List<Integer>> result = new HashSet<>();

        Arrays.sort(nums); // важно отсортировать. O(nlong)

        for (int i = 0; i < nums.length - 2; i++) { // O(nn)

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } else if (sum > 0) {
                    k--; // если сумма больше, то нам надо уменьшить больший элемент.
                } else {
                    j++; // если сумма меньше, то нам надо увеличить малый элемент.
                }

            }


        }

        return new ArrayList<>(result);


    }

}
