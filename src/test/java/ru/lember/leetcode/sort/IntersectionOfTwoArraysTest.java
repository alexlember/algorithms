package ru.lember.leetcode.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionOfTwoArraysTest {

    @Test
    void intersectTest() {

        IntersectionOfTwoArrays service = new IntersectionOfTwoArrays();

        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums2 = new int[]{2, 2};

        int[] intersection = service.intersect(nums1, nums2);

        Assertions.assertArrayEquals(new int[]{2, 2}, intersection);

        nums1 = new int[]{4, 9, 5};
        nums2 = new int[]{9, 4, 9, 8, 4};

        intersection = service.intersect(nums1, nums2);
        Assertions.assertArrayEquals(new int[]{4, 9}, intersection);

    }

}
