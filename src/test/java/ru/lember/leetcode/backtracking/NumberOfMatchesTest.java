package ru.lember.leetcode.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfMatchesTest {

    @Test
    void numberOfMatches() {


        NumberOfMatches service = new NumberOfMatches();

        Assertions.assertEquals(6, service.numberOfMatches(7));
        Assertions.assertEquals(13, service.numberOfMatches(14));

    }
}