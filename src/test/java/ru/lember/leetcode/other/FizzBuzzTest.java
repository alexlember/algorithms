package ru.lember.leetcode.other;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class FizzBuzzTest {

    @Test
    void robTest() {

        FizzBuzz service = new FizzBuzz();

        Assertions.assertEquals(Arrays.asList(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"), service.fizzBuzz(15));

    }
}
