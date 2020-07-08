package ru.lember.leetcode.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {


    @Test
    void reverseString() {


        ReverseString service = new ReverseString();

        char[] seq = new char[]{ 'h','e','l','l','o'};
        service.reverseString(seq);
        Assertions.assertArrayEquals(new char[] {'o','l','l','e','h'}, seq);


        seq = new char[]{ 'H','a','n','n','a','h'};
        service.reverseString(seq);
        Assertions.assertArrayEquals(new char[] {'h','a','n','n','a','H'}, seq);

    }

}
