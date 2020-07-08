package ru.lember.leetcode.hasht;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class FourSumTest {


    @Test
    void fourSumTest() {

        FourSum service = new FourSum();

        int[] arr = new int[]{1, 0, -1, 0, -2, 2};

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> quad1 = new ArrayList<>();
        quad1.add(-1);
        quad1.add(0);
        quad1.add(0);
        quad1.add(1);

        List<Integer> quad2 = new ArrayList<>();
        quad2.add(-2);
        quad2.add(-1);
        quad2.add(1);
        quad2.add(2);

        List<Integer> quad3 = new ArrayList<>();
        quad3.add(-2);
        quad3.add(0);
        quad3.add(0);
        quad3.add(2);

        expected.add(quad2);
        expected.add(quad3);
        expected.add(quad1);

        Assertions.assertEquals(expected, service.fourSum(arr, 0));
    }

}
