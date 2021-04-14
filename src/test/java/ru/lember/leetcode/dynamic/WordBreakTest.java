package ru.lember.leetcode.dynamic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {

    @Test
    void wordBreak() {

        WordBreak service = new WordBreak();
//
//        Assertions.assertTrue(service.wordBreak("leetcode", Arrays.asList("leet", "code")));
//        Assertions.assertTrue(service.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
//        Assertions.assertFalse(service.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));

        Assertions.assertTrue(service.wordBreak("cars", Arrays.asList("car", "ca", "rs")));

    }
}