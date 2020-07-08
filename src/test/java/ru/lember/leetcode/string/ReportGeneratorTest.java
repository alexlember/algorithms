package ru.lember.leetcode.string;

import org.junit.jupiter.api.Test;

public class ReportGeneratorTest {

    @Test
    void generateTest() {

        ReportGenerator service = new ReportGenerator();
        String generated = service.generate("abcdefghijklmnopqrstuvw", 5, 5);
        System.out.println(generated);
        String s = "";
    }
}
