package ru.lember.leetcode.backtracking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BinaryWatchTest {

    @Test
    void readBinaryWatch() {


        BinaryWatch binaryWatch = new BinaryWatch();

        Assertions.assertEquals(
                Stream.of(
                        "1:00",
                        "2:00",
                        "4:00",
                        "8:00",
                        "0:01",
                        "0:02",
                        "0:04",
                        "0:08",
                        "0:16",
                        "0:32")
                        .collect(Collectors.toList()),
                binaryWatch.readBinaryWatch(1));

    }


    @Test
    public void convertTest() {

        BinaryWatch binaryWatch = new BinaryWatch();

        Assertions.assertEquals("0", binaryWatch.convertHours("0000"));
        Assertions.assertEquals("1", binaryWatch.convertHours("0001"));
        Assertions.assertEquals("2", binaryWatch.convertHours("0010"));
        Assertions.assertEquals("3", binaryWatch.convertHours("0011"));
        Assertions.assertEquals("4", binaryWatch.convertHours("0100"));
        Assertions.assertEquals("5", binaryWatch.convertHours("0101"));
        Assertions.assertEquals("6", binaryWatch.convertHours("0110"));
        Assertions.assertEquals("7", binaryWatch.convertHours("0111"));
        Assertions.assertEquals("8", binaryWatch.convertHours("1000"));
        Assertions.assertEquals("9", binaryWatch.convertHours("1001"));
        Assertions.assertEquals("10", binaryWatch.convertHours("1010"));
        Assertions.assertEquals("11", binaryWatch.convertHours("1011"));
        Assertions.assertEquals("12", binaryWatch.convertHours("1100"));


        Assertions.assertEquals("00", binaryWatch.convertMinutes("000000"));
        Assertions.assertEquals("01", binaryWatch.convertMinutes("000001"));
        Assertions.assertEquals("02", binaryWatch.convertMinutes("000010"));
        Assertions.assertEquals("03", binaryWatch.convertMinutes("000011"));
        Assertions.assertEquals("04", binaryWatch.convertMinutes("000100"));
        Assertions.assertEquals("05", binaryWatch.convertMinutes("000101"));
        Assertions.assertEquals("06", binaryWatch.convertMinutes("000110"));
        Assertions.assertEquals("07", binaryWatch.convertMinutes("000111"));
        Assertions.assertEquals("08", binaryWatch.convertMinutes("001000"));
        Assertions.assertEquals("09", binaryWatch.convertMinutes("001001"));

        Assertions.assertEquals("10", binaryWatch.convertMinutes("001010"));
        Assertions.assertEquals("11", binaryWatch.convertMinutes("001011"));
        Assertions.assertEquals("12", binaryWatch.convertMinutes("001100"));

        Assertions.assertEquals("20", binaryWatch.convertMinutes("010100"));
        Assertions.assertEquals("30", binaryWatch.convertMinutes("011110"));
        Assertions.assertEquals("40", binaryWatch.convertMinutes("101000"));
        Assertions.assertEquals("50", binaryWatch.convertMinutes("110010"));
        Assertions.assertEquals("59", binaryWatch.convertMinutes("111011"));


        Assertions.assertEquals("0:00", binaryWatch.convert("0000", "000000"));
        Assertions.assertEquals("0:09", binaryWatch.convert("0000", "001001"));
        Assertions.assertEquals("5:09", binaryWatch.convert("0101", "001001"));
        Assertions.assertEquals("9:09", binaryWatch.convert("1001", "001001"));
        Assertions.assertEquals("11:15", binaryWatch.convert("1011", "001111"));
        Assertions.assertEquals("11:59", binaryWatch.convert("1011", "111011"));

        Assertions.assertEquals("11:15", binaryWatch.convert("1011001111"));
        Assertions.assertEquals("11:59", binaryWatch.convert("1011111011"));




    }
}