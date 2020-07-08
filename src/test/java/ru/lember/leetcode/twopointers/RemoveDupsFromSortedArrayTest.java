package ru.lember.leetcode.twopointers;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDupsFromSortedArrayTest {


    @Test
    void removeDuplicatesTest() {

        RemoveDupsFromSortedArray service = new RemoveDupsFromSortedArray();

        int[] arr = new int[]{1, 1, 2};

        Assertions.assertEquals(2, service.removeDuplicates(arr));

        arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        Assertions.assertEquals(5, service.removeDuplicates(arr));
    }


}
