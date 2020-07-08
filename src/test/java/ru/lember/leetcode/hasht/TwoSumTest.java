package ru.lember.leetcode.hasht;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {


    @Test
    void twoSumTest() {

        TwoSum service = new TwoSum();

        int[] arr = new int[]{2, 7, 11, 15};

        Assertions.assertArrayEquals(new int[]{0, 1}, service.twoSum(arr, 9));

        arr = new int[]{16, 7, 11, 5};

        Assertions.assertArrayEquals(new int[]{0, 3}, service.twoSum(arr, 21));
    }

}
