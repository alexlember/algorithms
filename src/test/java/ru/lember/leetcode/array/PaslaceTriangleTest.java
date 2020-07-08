package ru.lember.leetcode.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PaslaceTriangleTest {

    @Test
    void generateTriangleTest() {

        PascalTriangle service = new PascalTriangle();

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> first = Collections.singletonList(1);
        List<Integer> second = Arrays.asList(1, 1);
        List<Integer> third = Arrays.asList(1, 2, 1);
        List<Integer> fourth = Arrays.asList(1, 3, 3, 1);
        List<Integer> fifth = Arrays.asList(1, 4, 6, 4, 1);
        result.add(first);
        result.add(second);
        result.add(third);
        result.add(fourth);
        result.add(fifth);

        Assertions.assertEquals(result, service.generate(5));

    }
}
