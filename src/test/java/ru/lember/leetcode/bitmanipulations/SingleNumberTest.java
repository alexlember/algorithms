package ru.lember.leetcode.bitmanipulations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberTest {

    @Test
    void singleNumberTest() {

        SingleNumber service = new SingleNumber();

        Assertions.assertEquals(1, service.singleNumber(new int[]{2, 2, 1}));
        Assertions.assertEquals(4, service.singleNumber(new int[]{4, 1, 2, 1, 2}));

    }
}
