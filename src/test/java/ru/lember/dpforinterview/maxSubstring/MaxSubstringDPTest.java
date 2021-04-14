package ru.lember.dpforinterview.maxSubstring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSubstringDPTest {

    @Test
    void maxSubstringLengthDP() {
        MaxSubstringDP service = new MaxSubstringDP();

        Assertions.assertEquals(6, service.maxSubstringLengthDP("142124"));
        Assertions.assertEquals(4, service.maxSubstringLengthDP("9430723"));


    }
}