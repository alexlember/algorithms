package ru.lember.leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTrailingZeroesTest {

    @Test
    void trailingZeroesTest() {

        FactorialTrailingZeroes service = new FactorialTrailingZeroes();

        Assertions.assertEquals(0, service.trailingZeroes(3));
        Assertions.assertEquals(1, service.trailingZeroes(5));
        Assertions.assertEquals(6, service.trailingZeroes(25));
        Assertions.assertEquals(31, service.trailingZeroes(125));

    }
}
