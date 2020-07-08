package ru.lember.leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {

    @Test
    void rotateTest() {

        RotateArray service = new RotateArray();

        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7};

        service.rotate(input, 3);
        Assertions.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, input);

        input = new int[]{-1, -100, 3, 99};

        service.rotate(input, 2);
        Assertions.assertArrayEquals(new int[]{3, 99, -1, -100}, input);

    }
}
