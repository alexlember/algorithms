package ru.lember.leetcode.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Note:
 * <p>
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * <p>
 * <p>
 * Follow up:
 * <p>
 * 1) What if the given array is already sorted? How would you optimize your algorithm?
 * 2) What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * 3) What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 * <p>
 * <p>
 * Solution: title of the task is confusing. They doesn't mean "intersection" but just common sequence.
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * Classic two pointer iteration, i points to nums1 and j points to nums2.
 * Because a sorted array is in ascending order, so if nums1[i] > nums[j], we need to increment j, and vice versa.
 * Only when nums1[i] == nums[j], we add it to the result array. Time Complexity O(max(N, M)).
 * Worst case, for example, would be nums1 = {100}, and nums2 = {1, 2, ..., 100 }.
 * We will always iterate the longest array. The example code is below(I sorted it so it could go through OJ):
 *
 *
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * This one is a bit tricky. Let's say nums1 is K size. Then we should do binary search for every element in nums1.
 * Each lookup is O(log N), and if we do K times, we have O(K log N).
 * If K this is small enough, O(K log N) < O(max(N, M)). Otherwise, we have to use the previous two pointers method.
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 * This one is open-ended. But Map-Reduce I believe is a good answer.
 *
 */
public class IntersectionOfTwoArrays {

    int[] intersect(int[] nums1, int[] nums2) {


        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        if (nums1[0] > nums2[nums2.length - 1] || nums2[0] > nums1[nums1.length - 1]) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();

        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;

        while (i < n && j < m) {
            int a = nums1[i], b = nums2[j];
            if (a == b) {
                result.add(a);
                i++;
                j++;
            } else if (a < b) {
                i++;
            } else {
                j++;
            }
        }

        int[] ret = new int[result.size()];
        for (int k = 0; k < result.size(); k++) {
            ret[k] = result.get(k);
        }

        return ret;
    }

}
