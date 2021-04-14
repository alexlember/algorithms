package ru.lember.leetcode.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePartitioningTest {

    PalindromePartitioning service = new PalindromePartitioning();

    @Test
    void partition() {

        Assertions.assertEquals(Arrays.asList(Arrays.asList("a","a","b"), Arrays.asList("aa","b")),
                service.partition("aab")
                );

        Assertions.assertEquals(Collections.singletonList(Collections.singletonList("a")),
                service.partition("a")
        );
    }

//    @Test
//    void isPalindrome() {
//
//
//
//
//        Assertions.assertTrue(service.isPalindrome(""));
//        Assertions.assertTrue(service.isPalindrome("a"));
//        Assertions.assertTrue(service.isPalindrome("aa"));
//        Assertions.assertTrue(service.isPalindrome("aaa"));
//        Assertions.assertTrue(service.isPalindrome("aba"));
//        Assertions.assertTrue(service.isPalindrome("abba"));
//        Assertions.assertTrue(service.isPalindrome("aacaa"));
//
//        Assertions.assertFalse(service.isPalindrome("ab"));
//        Assertions.assertFalse(service.isPalindrome("abb"));
//        Assertions.assertFalse(service.isPalindrome("abab"));
//        Assertions.assertFalse(service.isPalindrome("abac"));
//        Assertions.assertFalse(service.isPalindrome("abaa"));
//        Assertions.assertFalse(service.isPalindrome("abcaa"));
//
//    }

//    @Test
//    void allStringCombinations() {
//
//        Assertions.assertEquals(
//                Collections.singletonList(Collections.singletonList("a")),
//                service.allStringCombinations("a", 0));
//
//        Assertions.assertEquals(
//                Collections.singletonList(Arrays.asList("a", "b")),
//                service.allStringCombinations("ab", 1));
//
//        Assertions.assertEquals(
//                Arrays.asList(Arrays.asList("a", "bc"), Arrays.asList("ab", "c")),
//                service.allStringCombinations("abc", 1));
//
//        Assertions.assertEquals(
//                Arrays.asList(Arrays.asList("a", "bcd"), Arrays.asList("ab", "cd"), Arrays.asList("abc", "d")),
//                service.allStringCombinations("abcd", 1));
//
//        Assertions.assertEquals(
//                Arrays.asList(Arrays.asList("a", "bc", "d"), Arrays.asList("ab", "c", "d"), Arrays.asList("a", "b", "cd")),
//                service.allStringCombinations("abcd", 2));
//    }

    @Test
    void partitions() {

        Assertions.assertEquals(
                Collections.singletonList(Collections.singletonList("a")),
                service.partition("a"));

        Assertions.assertEquals(
                Collections.singletonList(Arrays.asList("a", "b")),
                service.partition("ab"));

        Assertions.assertEquals(
                Arrays.asList(Arrays.asList("a", "bc"), Arrays.asList("ab", "c"), Arrays.asList("a", "b", "c")),
                service.partition("abc"));

        Assertions.assertEquals(
                Arrays.asList(
                        Arrays.asList("a", "bcd"),
                        Arrays.asList("ab", "cd"),
                        Arrays.asList("abc", "d"),
                        Arrays.asList("a", "bc", "d"),
                        Arrays.asList("ab", "c", "d"),
                        Arrays.asList("a", "b", "cd"),
                        Arrays.asList("a", "b", "c", "d"),
                        Collections.singletonList("abcd")
                ),
                service.partition("abcd"));

    }
}