package ru.lember.leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PlusOneTest {

    @Test
    void plusOneTest() {

        PlusOne service = new PlusOne();


        Assertions.assertArrayEquals(new int[]{1, 2, 4}, service.plusOne(new int[]{1, 2, 3}));
        Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, service.plusOne(new int[]{4, 3, 2, 1}));
        Assertions.assertArrayEquals(new int[]{1, 0, 0, 0, 0}, service.plusOne(new int[]{9, 9, 9, 9}));

    }
}
