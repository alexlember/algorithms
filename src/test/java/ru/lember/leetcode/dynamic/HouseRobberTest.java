package ru.lember.leetcode.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {

    @Test
    void robTest() {

        HouseRobber service = new HouseRobber();

        Assertions.assertEquals(4, service.rob(new int[]{1, 2, 3, 1}));
        Assertions.assertEquals(12, service.rob(new int[]{2, 7, 9, 3, 1}));
        Assertions.assertEquals(4, service.rob(new int[]{2, 1, 1, 2}));

    }
}
