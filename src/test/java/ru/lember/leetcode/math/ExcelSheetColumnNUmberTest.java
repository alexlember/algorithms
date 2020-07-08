package ru.lember.leetcode.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExcelSheetColumnNUmberTest {

    @Test
    void titleToNumberTest() {

        ExcelSheetColumnNumber service = new ExcelSheetColumnNumber();

        Assertions.assertEquals(1, service.titleToNumber("A"));
        Assertions.assertEquals(28, service.titleToNumber("AB"));
        Assertions.assertEquals(701, service.titleToNumber("ZY"));


    }
}
