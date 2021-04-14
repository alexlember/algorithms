package ru.lember.leetcode.string;

import java.util.*;

/**
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.
 *
 *
 *
 *
 *
 * Example 1:
 *
 * Input: digits = "23"
 * Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
 * Example 2:
 *
 * Input: digits = ""
 * Output: []
 * Example 3:
 *
 * Input: digits = "2"
 * Output: ["a","b","c"]
 *
 *
 * Constraints:
 *
 * 0 <= digits.length <= 4
 * digits[i] is a digit in the range ['2', '9'].
 */
public class LetterCombinations {

    private static final Map<String, String> CACHE = new HashMap<>();

    static {
        CACHE.put("2", "abc");
        CACHE.put("3", "def");
        CACHE.put("4", "ghi");
        CACHE.put("5", "jkl");
        CACHE.put("6", "mno");
        CACHE.put("7", "pqrs");
        CACHE.put("8", "tuv");
        CACHE.put("9", "wxyz");
    }

    List<String> output;

    public List<String> letterCombinations(String digits) {
        output = new ArrayList<>();

        if (digits != null && !digits.isEmpty()) {
            backtrack("", digits);
        }
        return output;
    }

    public void backtrack(String combination, String nextDigits) {

        if (nextDigits == null || nextDigits.isEmpty()) {
            output.add(combination);
            return;
        }

        String num = nextDigits.substring(0, 1);
        String letters = CACHE.get(num);

        for (char letter : letters.toCharArray()) {
            backtrack(combination + letter, nextDigits.substring(1));
        }

    }

}
