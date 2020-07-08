package ru.lember.leetcode.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {


    @Test
    void isValidParenthesesTest() {


        ValidParentheses service = new ValidParentheses();

        String s = "()";
        Assertions.assertTrue(service.isValid(s));

        s = "()[]{}";
        Assertions.assertTrue(service.isValid(s));

        s = "(]";
        Assertions.assertFalse(service.isValid(s));

        s = "([)]";
        Assertions.assertFalse(service.isValid(s));

        s = "{[]}";
        Assertions.assertTrue(service.isValid(s));

    }

}
