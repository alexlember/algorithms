package ru.lember.leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountPrimesTest {

    @Test
    void countPrimesTest() {

        CountPrimes service = new CountPrimes();

        Assertions.assertFalse(service.isPrime(9));
        Assertions.assertEquals(4, service.countPrimes(10));

    }
}
