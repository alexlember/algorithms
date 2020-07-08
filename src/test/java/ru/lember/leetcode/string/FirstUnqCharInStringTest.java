package ru.lember.leetcode.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstUnqCharInStringTest {


    @Test
    void firstUnChrTest() {

        FirstUnqCharInString service = new FirstUnqCharInString();

        String s = "leetcode";
        Assertions.assertEquals(0, service.firstUniqChar(s));
        Assertions.assertEquals(0, service.firstUniqCharAlt(s));

        s = "loveleetcode";
        Assertions.assertEquals(2, service.firstUniqChar(s));
        Assertions.assertEquals(2, service.firstUniqCharAlt(s));

        s = "dddccdbba";
        Assertions.assertEquals(8, service.firstUniqChar(s));
        Assertions.assertEquals(8, service.firstUniqCharAlt(s));



    }

}
