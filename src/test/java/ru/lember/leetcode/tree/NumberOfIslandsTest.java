package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class NumberOfIslandsTest {


    @Test
    void numIslandsTest() {

        NumberOfIslands service = new NumberOfIslands();

        char[][] arr = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'},
        };
        Assertions.assertEquals(1, service.numIslands(arr));

        arr = new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'},
        };

        Assertions.assertEquals(3, service.numIslands(arr));

    }


}


