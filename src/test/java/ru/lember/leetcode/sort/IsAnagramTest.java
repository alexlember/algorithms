package ru.lember.leetcode.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsAnagramTest {

    @Test
    void isAnagramTest() {

        IsAnagram service = new IsAnagram();

        Assertions.assertTrue(service.isAnagram("anagram", "nagaram"));
        Assertions.assertFalse(service.isAnagram("rat", "car"));

    }


}
