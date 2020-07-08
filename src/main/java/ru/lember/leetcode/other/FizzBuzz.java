package ru.lember.leetcode.other;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that outputs the string representation of numbers from 1 to n.
 *
 * But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.
 *
 * Example:
 *
 * n = 15,
 *
 * Return:
 * [
 *     "1",
 *     "2",
 *     "Fizz",
 *     "4",
 *     "Buzz",
 *     "Fizz",
 *     "7",
 *     "8",
 *     "Fizz",
 *     "Buzz",
 *     "11",
 *     "Fizz",
 *     "13",
 *     "14",
 *     "FizzBuzz"
 * ]
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            boolean dividesOn3 = i % 3 == 0;
            boolean dividesOn5 = i % 5 == 0;

            if (dividesOn3 && !dividesOn5) {
                result.add("Fizz");
            } else if (!dividesOn3 && dividesOn5) {
                result.add("Buzz");
            } else {

                int dividedOn3Result = i / 3;

                if (dividesOn3 && dividedOn3Result != 0 && dividedOn3Result % 5 == 0) {
                    result.add("FizzBuzz");
                } else {
                    result.add(String.valueOf(i));
                }
            }
        }


        return result;
    }

}
