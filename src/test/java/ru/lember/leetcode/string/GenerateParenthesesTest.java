package ru.lember.leetcode.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class GenerateParenthesesTest {


    @Test
    void generateParenthesesTest() {

        GenerateParentheses service = new GenerateParentheses();
//
//        Assertions.assertEquals(Stream.of(
//                "(()), ()()").collect(Collectors.toList()),
//                service.generateParenthesis(2));

        Assertions.assertEquals(Arrays.asList(
                "((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()"),
                service.generateParenthesis(3));

        Assertions.assertEquals(Arrays.asList(
                "(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"),
                service.generateParenthesis(4));

    }

//    @Test
//    void isValidTest() {
//
//        GenerateParentheses service = new GenerateParentheses();
//
//        Assertions.assertFalse(service.isValid("("));
//        Assertions.assertFalse(service.isValid(")"));
//        Assertions.assertFalse(service.isValid(")("));
//        Assertions.assertTrue(service.isValid("()"));
//        Assertions.assertTrue(service.isValid("(())"));
//        Assertions.assertTrue(service.isValid("(())"));
//
//    }

}
