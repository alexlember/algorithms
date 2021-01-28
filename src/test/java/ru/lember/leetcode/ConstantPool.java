package ru.lember.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConstantPool {

    @Test
    void poolTest() {

        Assertions.assertTrue(0.0 == -0.0);
        Assertions.assertFalse(Double.valueOf(0.0).equals(Double.valueOf(-0.0)));

        Assertions.assertFalse(Double.NaN == Double.NaN);
        Assertions.assertTrue(Double.valueOf(Double.NaN).equals(Double.valueOf(Double.NaN)));


    }

}
