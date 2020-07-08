package ru.lember.leetcode.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StrStrTest {


    @Test
    void strStrTest() {

        StrStr service = new StrStr();

        Assertions.assertEquals(0, service.strStr("a", "a"));
        Assertions.assertEquals(2, service.strStr("hello", "ll"));
        Assertions.assertEquals(-1, service.strStr("aaaaa", "bba"));

    }

}
