package ru.lember.leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SqrtTest {

    @Test
    void mySqrtTest() {

        Sqrt service = new Sqrt();

        Assertions.assertEquals(2, service.mySqrt(4));
        Assertions.assertEquals(2, service.mySqrt(8));
        Assertions.assertEquals(3, service.mySqrt(9));
        Assertions.assertEquals(4, service.mySqrt(16));
        Assertions.assertEquals(4, service.mySqrt(18));
        Assertions.assertEquals(5, service.mySqrt(25));

    }
}
