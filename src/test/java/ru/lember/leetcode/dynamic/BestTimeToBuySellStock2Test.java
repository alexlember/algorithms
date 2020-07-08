package ru.lember.leetcode.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuySellStock2Test {

    @Test
    void maxProfitTest() {

        BestTimeToBuySellStock2 service = new BestTimeToBuySellStock2();


        Assertions.assertEquals(7, service.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assertions.assertEquals(4, service.maxProfit(new int[]{1, 2, 3, 4, 5}));
        Assertions.assertEquals(0, service.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
