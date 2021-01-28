package ru.lember.leetcode.hasht;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWORepeatingCharacterTest {

    @Test
    void lengthOfLongestSubstringTest() {

        LongestSubstringWORepeatingCharacter service = new LongestSubstringWORepeatingCharacter();

        Assertions.assertEquals(3, service.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(3, service.lengthOfLongestSubstringOptimized("abcabcbb"));

        Assertions.assertEquals(1, service.lengthOfLongestSubstring("bbbbb"));
        Assertions.assertEquals(1, service.lengthOfLongestSubstringOptimized("bbbbb"));

        Assertions.assertEquals(3, service.lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(3, service.lengthOfLongestSubstringOptimized("pwwkew"));
    }

}
