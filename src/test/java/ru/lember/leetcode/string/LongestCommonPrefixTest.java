package ru.lember.leetcode.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestCommonPrefixTest {


    @Test
    void lcpTest() {

        LongestCommonPrefix service = new LongestCommonPrefix();

        String[] strings = new String[]{"","flow","flight"};
        Assertions.assertEquals("", service.longestCommonPrefix(strings));

        strings = new String[]{"a"};
        Assertions.assertEquals("a", service.longestCommonPrefix(strings));

        strings = new String[]{"flower","flow","flight"};
        Assertions.assertEquals("fl", service.longestCommonPrefix(strings));

        strings = new String[]{"dog","racecar","car"};
        Assertions.assertEquals("", service.longestCommonPrefix(strings));


    }

}
