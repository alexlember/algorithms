package ru.lember.leetcode.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsTest {

    @Test
    void uniquePaths() {

        UniquePaths service = new UniquePaths();

        Assertions.assertEquals(3, service.uniquePaths(3, 2));
        Assertions.assertEquals(6, service.uniquePaths(3, 3));
        Assertions.assertEquals(28, service.uniquePaths(3, 7));

    }
}