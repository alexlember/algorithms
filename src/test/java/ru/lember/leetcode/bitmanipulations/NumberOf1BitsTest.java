package ru.lember.leetcode.bitmanipulations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOf1BitsTest {

    @Test
    void hammingWeightTest() {

        NumberOf1Bits service = new NumberOf1Bits();

        Assertions.assertEquals(3, service.hammingWeight(11));
        Assertions.assertEquals(1, service.hammingWeight(128));
        Assertions.assertEquals(31, service.hammingWeight(-3));

    }
}
