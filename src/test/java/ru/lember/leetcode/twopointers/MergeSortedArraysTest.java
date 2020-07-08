package ru.lember.leetcode.twopointers;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MergeSortedArraysTest {


    @Test
    void mergeTest() {

        MergeSortedArrays service = new MergeSortedArrays();

        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        service.merge(nums1, 3, nums2, 3);

        int[] expectedNums1 = new int[]{1, 2, 2, 3, 5, 6};

        Assertions.assertArrayEquals(expectedNums1, nums1);
    }


}
