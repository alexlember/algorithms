package ru.lember.leetcode.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsTest {

    @Test
    void letterCombinations() {

        LetterCombinations service = new LetterCombinations();

        List<String> expected = Stream.of("ad","ae","af","bd","be","bf","cd","ce","cf").collect(Collectors.toList());
        Assertions.assertEquals(expected, service.letterCombinations("23"));

        Assertions.assertEquals(Collections.emptyList(), service.letterCombinations(""));

        expected = Stream.of("a","b","c").collect(Collectors.toList());
        Assertions.assertEquals(expected, service.letterCombinations("2"));
    }
}