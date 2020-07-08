package ru.lember.leetcode.hasht;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainsDuplicateTest {


    @Test
    void containsDuplicateTest() {

        ContainsDuplicate service = new ContainsDuplicate();
        Assertions.assertTrue(service.containsDuplicate(new int[]{1, 2, 3, 1}));
        Assertions.assertFalse(service.containsDuplicate(new int[]{1, 2, 3, 4}));
        Assertions.assertTrue(service.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

    }

}
