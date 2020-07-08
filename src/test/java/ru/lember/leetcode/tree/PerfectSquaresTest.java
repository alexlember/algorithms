package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PerfectSquaresTest {


    @Test
    void numSquares() {

        PerfectSquares service = new PerfectSquares();

        int n = 12;

        Assertions.assertEquals(3, service.numSquares(n));
        Assertions.assertEquals(3, service.numSquaresDP(n));

        n = 13;
        Assertions.assertEquals(2, service.numSquares(n));
        Assertions.assertEquals(2, service.numSquaresDP(n));

    }


}


