package ru.lember.leetcode.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClimbingStairsTest {

    @Test
    void climbStairsTest() {

        ClimbingStairs service = new ClimbingStairs();

        Assertions.assertEquals(2, service.climbStairsBrFr(2));
        Assertions.assertEquals(2, service.climbStairsMemo(2));
        Assertions.assertEquals(2, service.climbStairsDP(2));
        Assertions.assertEquals(2, service.climbStairsFib(2));

        Assertions.assertEquals(3, service.climbStairsBrFr(3));
        Assertions.assertEquals(3, service.climbStairsMemo(3));
        Assertions.assertEquals(3, service.climbStairsDP(3));
        Assertions.assertEquals(3, service.climbStairsFib(3));

        Assertions.assertEquals(5, service.climbStairsBrFr(4));
        Assertions.assertEquals(5, service.climbStairsMemo(4));
        Assertions.assertEquals(5, service.climbStairsDP(4));
        Assertions.assertEquals(5, service.climbStairsFib(4));


    }
}
