package ru.lember.leetcode.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RomanToIntegerTest {


    @Test
    void romanToInteger() {

        RomanToInteger service = new RomanToInteger();

        Assertions.assertEquals(3, service.romanToInt("III"));
        Assertions.assertEquals(4, service.romanToInt("IV"));
        Assertions.assertEquals(9, service.romanToInt("IX"));
        Assertions.assertEquals(58, service.romanToInt("LVIII"));
        Assertions.assertEquals(1994, service.romanToInt("MCMXCIV"));

    }

}
