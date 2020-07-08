package ru.lember.leetcode.hasht;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class TopKFrequentElementsTest {

    @Test
    void topKFrequentTest() {

        TopKFrequentElements service = new TopKFrequentElements();


        Assertions.assertArrayEquals(new int[]{2, 1}, service.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2));
        Assertions.assertArrayEquals(new int[]{2, 1}, service.topKFrequentQuickSelect(new int[]{1, 1, 1, 2, 2, 3}, 2));

        Assertions.assertArrayEquals(new int[]{1}, service.topKFrequent(new int[]{1}, 1));
        Assertions.assertArrayEquals(new int[]{1}, service.topKFrequentQuickSelect(new int[]{1}, 1));
    }

}
