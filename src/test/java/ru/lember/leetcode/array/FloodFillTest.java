package ru.lember.leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodFillTest {

    @Test
    void floodFill() {


        FloodFill service = new FloodFill();

        Assertions.assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}},
                service.floodFill(
                        new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}},
                        1, 1, 2)
        );

        Assertions.assertArrayEquals(new int[][]{{2, 2, 2}, {2, 2, 2}},
                service.floodFill(
                        new int[][]{{0, 0, 0}, {0, 0, 0}},
                        0, 0, 2)
        );

//        Assertions.assertArrayEquals(new int[][]{{0, 0, 0}, {0, 1, 1}},
//                service.floodFill(
//                        new int[][]{{0, 0, 0}, {0, 1, 1}},
//                        1, 1, 1)
//        );

    }
}