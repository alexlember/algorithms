package ru.lember.leetcode.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountAndSayTest {


    @Test
    void countAndSayTest() {

        CountAndSay service = new CountAndSay();

        //String s = service.fromPrev("111221");

        Assertions.assertEquals("1", service.countAndSay(1));
        Assertions.assertEquals("11", service.countAndSay(2));
        Assertions.assertEquals("21", service.countAndSay(3));
        Assertions.assertEquals("1211", service.countAndSay(4));
        Assertions.assertEquals("111221", service.countAndSay(5));
        Assertions.assertEquals("312211", service.countAndSay(6));


    }

}
