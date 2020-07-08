package ru.lember.leetcode.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuySellStockTest {

    @Test
    void maxProfitTest() {

        BestTimeToBuySellStock service = new BestTimeToBuySellStock();


        Assertions.assertEquals(5, service.maxProfitBF(new int[]{7, 1, 5, 3, 6, 4}));
        Assertions.assertEquals(5, service.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

        Assertions.assertEquals(0, service.maxProfitBF(new int[]{7, 6, 4, 3, 1}));
        Assertions.assertEquals(0, service.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
