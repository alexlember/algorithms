package ru.lember.leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {

    @Test
    void happyNumberTest() {

        HappyNumber service = new HappyNumber();

        Assertions.assertTrue(service.isHappy(19));


    }
}
