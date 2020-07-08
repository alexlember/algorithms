package ru.lember.leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {

    @Test
    void reverseInteger() {

        ReverseInteger service = new ReverseInteger();

        Assertions.assertEquals(321, service.reverse(123));
        Assertions.assertEquals(321, service.reverseOfHealthMan(123));

        Assertions.assertEquals(-321, service.reverse(-123));
        Assertions.assertEquals(-321, service.reverseOfHealthMan(-123));

        Assertions.assertEquals(21, service.reverse(120));
        Assertions.assertEquals(21, service.reverseOfHealthMan(120));

        Assertions.assertEquals(0, service.reverse(1534236469));
        Assertions.assertEquals(0, service.reverseOfHealthMan(1534236469));

    }
}
