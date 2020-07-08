package ru.lember.leetcode.twopointers;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MoveZeroesTest {


    @Test
    void moveZeroesTest() {

        MoveZeroes service = new MoveZeroes();

        int[] nums = new int[]{0, 1, 0, 3, 12};

        service.moveZeroes(nums);

        int[] expectedNums = new int[]{1,3,12,0,0};

        Assertions.assertArrayEquals(expectedNums, nums);
    }


}
