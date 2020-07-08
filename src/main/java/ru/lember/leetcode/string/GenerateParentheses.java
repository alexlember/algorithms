package ru.lember.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 */
public class GenerateParentheses {
//
    // решение-уродец

//    public List<String> generateParenthesis(int n) {
//
//        Set<String> result = new HashSet<>();
//
//        int until = (int) Math.pow(2, n + 2);
//        for (int i = 0; i < until; i++) {
//            result.add(String.format("%64s",
//                    Integer.toBinaryString(i))
//                    .replaceAll(" ", "(")
//                    .replaceAll("0", "(")
//                    .replaceAll("1", ")")
//                    .substring(64 - n * 2));
//        }
//
//        return result.stream().filter(this::isValid).collect(Collectors.toList());
//    }
//
//
//    boolean isValid(String row) {
//
//        char[] line = row.toCharArray();
//
//        int countOpened = 0;
//        int countClosed = 0;
//
//        for (int i = 0; i < line.length; i++) {
//
//            if (line[i] == ')') {
//                countClosed++;
//            }
//
//            if (line[i] == '(') {
//                countOpened++;
//            }
//
//            if (countClosed > countOpened) {
//                return false;
//            }
//        }
//
//        return countOpened == countClosed;
//    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    private void backtrack(List<String> ans, String cur, int open, int close, int max) {

        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        // мы не можем составить невалидную строку тут.
        if (open < max) {
            backtrack(ans, cur + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(ans, cur + ")", open, close + 1, max);
        }

    }

}
