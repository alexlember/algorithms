package ru.lember.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
 *
 *
 * In Pascal's triangle, each number is the sum of the two numbers directly above it.
 *
 * Example:
 *
 * Input: 5
 * Output:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {


        if (numRows == 0) {
            return Collections.emptyList();
        }

        List<Integer> firstRow = Collections.singletonList(1);

        if (numRows == 1) {
            return Collections.singletonList(firstRow);
        }

        List<Integer> secondRow = Arrays.asList(1, 1);

        if (numRows == 2) {
            return Arrays.asList(firstRow, secondRow);
        }

        List<List<Integer>> result = new ArrayList<>();

        result.add(firstRow);
        result.add(secondRow);

        List<Integer> previous = secondRow;

        for (int i = 2; i < numRows; i++) {
            List<Integer> current = generateRow(previous);
            result.add(current);
            previous = current;
        }

        return result;
    }

    private List<Integer> generateRow(List<Integer> previous) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        int previousPrevious = previous.get(0);

        for (int i = 1; i < previous.size(); i++) {
            int previousCurrent = previous.get(i);
            row.add(previousPrevious + previousCurrent);
            previousPrevious = previousCurrent;
        }

        row.add(1);

        return row;
    }


}
