package ru.lember.leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MissingNumberTest {

    @Test
    void missingNumberTest() {

        MissingNumber service = new MissingNumber();

        Assertions.assertEquals(2, service.missingNumber(new int[]{3, 0, 1}));
        Assertions.assertEquals(2, service.missingNumberBit(new int[]{3, 0, 1}));
        Assertions.assertEquals(2, service.missingNumberSort(new int[]{3, 0, 1}));
        Assertions.assertEquals(2, service.missingNumberSet(new int[]{3, 0, 1}));

        Assertions.assertEquals(8, service.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        Assertions.assertEquals(8, service.missingNumberBit(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        Assertions.assertEquals(8, service.missingNumberSort(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
        Assertions.assertEquals(8, service.missingNumberSet(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));

        Assertions.assertEquals(10, service.missingNumberSort(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));

    }
}
