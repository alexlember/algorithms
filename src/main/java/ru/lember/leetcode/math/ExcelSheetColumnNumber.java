package ru.lember.leetcode.math;

/**
 * Given a column title as appear in an Excel sheet, return its corresponding column number.
 *
 * For example:
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * Example 1:
 *
 * Input: "A"
 * Output: 1
 * Example 2:
 *
 * Input: "AB"
 * Output: 28
 * Example 3:
 *
 * Input: "ZY"
 * Output: 701
 */
public class ExcelSheetColumnNumber {


    private static final int ALPHABET_SIZE = 26;
    private static final char FIRST_LETTER = 'a';

    public int titleToNumber(String s) {

        if (s == null || s.isEmpty()) {
            return 0;
        }

        int number = 0;

        for (int i = s.length() - 1, k = 1; i >= 0; i--, k = k * ALPHABET_SIZE) {
            char current = s.charAt(i);

            char currentLower = Character.toLowerCase(current);
            int currentNumber = currentLower - FIRST_LETTER + 1;
            number = number + (currentNumber * k);
        }

        return number;
    }
}
