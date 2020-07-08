package ru.lember.leetcode.hasht;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ThreeSumTest {


    @Test
    void threeSumTest() {

        ThreeSum service = new ThreeSum();

        int[] arr = new int[]{-1, 0, 1, 2, -1, -4};

        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> triplet1 = new ArrayList<>();
        triplet1.add(-1);
        triplet1.add(0);
        triplet1.add(1);

        List<Integer> triplet2 = new ArrayList<>();
        triplet2.add(-1);
        triplet2.add(-1);
        triplet2.add(2);

        expected.add(triplet2);
        expected.add(triplet1);

        Assertions.assertEquals(expected, service.threeSum(arr));
    }

}
