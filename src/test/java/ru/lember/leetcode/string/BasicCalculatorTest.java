package ru.lember.leetcode.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasicCalculatorTest {

    @Test
    void calculateTest() {

        BasicCalculator service = new BasicCalculator();

        //Assertions.assertEquals(82, service.calculate("82"));
        Assertions.assertEquals(82, service.calculateEasy("82"));

        //Assertions.assertEquals(7, service.calculate("3 + 2 * 2"));
        Assertions.assertEquals(7, service.calculateEasy("3 + 2 * 2"));

        //Assertions.assertEquals(1, service.calculate("3/2"));
        Assertions.assertEquals(1, service.calculateEasy("3/2"));

        //Assertions.assertEquals(5, service.calculate("3 + 5 /2"));
        Assertions.assertEquals(5, service.calculateEasy("3 + 5 /2"));



    }

}
