package ru.lember.leetcode.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumSubarrayTest {

    @Test
    void maximumSubarrayTest() {

        MaximumSubarray service = new MaximumSubarray();

        Assertions.assertEquals(6, service.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        Assertions.assertEquals(6, service.maxSubArray2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));


    }
}
