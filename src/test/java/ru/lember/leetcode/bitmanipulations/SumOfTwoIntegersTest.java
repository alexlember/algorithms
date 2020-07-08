package ru.lember.leetcode.bitmanipulations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoIntegersTest {

    @Test
    void getSumTest() {

        SumOfTwoIntegers service = new SumOfTwoIntegers();

        Assertions.assertEquals(3, service.getSum(1, 2));
        Assertions.assertEquals(1, service.getSum(-2, 3));

    }
}
