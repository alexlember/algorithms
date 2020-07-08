package ru.lember.leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PowerOfThreeTest {

    @Test
    void isPowerOfThreeTest() {

        PowerOfThree service = new PowerOfThree();

        Assertions.assertFalse(service.isPowerOfThree(0));
        Assertions.assertTrue(service.isPowerOfThree(1));
        Assertions.assertTrue(service.isPowerOfThree(9));
        Assertions.assertFalse(service.isPowerOfThree(45));

    }
}
