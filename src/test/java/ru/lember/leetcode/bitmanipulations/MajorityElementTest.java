package ru.lember.leetcode.bitmanipulations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {

    @Test
    void majorityElementTest() {

        MajorityElement service = new MajorityElement();

        Assertions.assertEquals(3, service.majorityElement(new int[]{3, 2, 3}));
        Assertions.assertEquals(2, service.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));

    }
}
