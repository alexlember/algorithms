package ru.lember.leetcode.bitmanipulations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseBitsTest {

    @Test
    void reverseBitsTest() {

        ReverseBits service = new ReverseBits();

        Assertions.assertEquals(134217728, service.reverseBits(16));
        Assertions.assertEquals(134217728, Integer.reverse(16));
        Assertions.assertEquals(964176192, service.reverseBits(43261596));
        Assertions.assertEquals(-1073741825, service.reverseBits(-3));

    }
}
