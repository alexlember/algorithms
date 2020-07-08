package ru.lember.leetcode.twopointers;

import java.util.ArrayList;
import java.util.List;

/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 *
 * Note:
 *
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * Example:
 *
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * Output: [1,2,2,3,5,6]
 */
public class MergeSortedArrays {

    void merge(int[] nums1, int m, int[] nums2, int n) {

        // nums1.length >= m + n.
        // можно идти по массивам назад, и заполнять больший массив с конца, так будет более наглядно и без доп. памяти.

        List<Integer> result = new ArrayList<>();

        for (int i = 0, j = 0; i < m || j < n; ) {

            if (i == m) {
                int fromSecond = nums2[j];
                result.add(fromSecond);
                j++;
            } else if (j == n) {
                int fromFirst = nums1[i];
                result.add(fromFirst);
                i++;
            } else {
                int fromFirst = nums1[i];
                int fromSecond = nums2[j];

                if (fromFirst > fromSecond) {
                    result.add(fromSecond);
                    j++;
                } else {
                    result.add(fromFirst);
                    i++;
                }
            }
        }

        for (int i = 0; i < result.size(); i++) {
            nums1[i] = result.get(i);
        }
    }

}
