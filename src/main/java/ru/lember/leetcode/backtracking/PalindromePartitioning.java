package ru.lember.leetcode.backtracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.
 *
 * A palindrome string is a string that reads the same backward as forward.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "aab"
 * Output: [["a","a","b"],["aa","b"]]
 * Example 2:
 *
 * Input: s = "a"
 * Output: [["a"]]
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 16
 * s contains only lowercase English letters.
 */
public class PalindromePartitioning {

//    public List<List<String>> partition(String s) {
//
//        List<List<String>> result = new ArrayList<>();
//
//        backtrack(s, s.length() - 1, result);
//
//        return result;
//    }
//
//    private void backtrack(String s, int divisions, List<List<String>> result) {
//
//        if (divisions == 0) {
//            if (isPalindrome(s)) {
//                result.add(Collections.singletonList(s));
//            }
//            return;
//        }
//
//
//        backtrack(s, divisions - 1, result);
//
//
//    }
//
//    boolean isPalindrome(String s) {
//
//        if (s.isEmpty()) {
//            return true;
//        }
//
//        int start = 0;
//        int finish = s.length() - 1;
//
//        while (start < finish) {
//
//            if (s.charAt(start) != s.charAt(finish)) {
//                return false;
//            }
//
//            start++;
//            finish--;
//        }
//
//        return true;
//
//
//    }
//
//    private List<List<String>> parts;
//
//    List<List<String>> partitions(String s) {
//
//        parts = new ArrayList<>();
//
//        partitionsHelper(s, parts);
//
//        return parts;
//
//    }
//
//    private List<List<String>> partitionsHelper(String s, List<List<String>> parts) {
//
//        if (s.isEmpty()) {
//            return;
//        }
//
//        List<String> res = new ArrayList<>();
//
//        for (int i = 0; i < s.length(); i++) {
//
//            String head = s.substring(0, i);
//            String tail = s.substring(i + 1);
//
//            for ()
//
//        }
//
//
//    }


    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        dfs(0, result, new ArrayList<>(), s);
        return result;
    }

    void dfs(int start, List<List<String>> result, List<String> currentList, String s) {

        if (start >= s.length()) {
            result.add(new ArrayList<>(currentList)); // goal
        }

        for (int i = start; i < s.length(); i++) {

            if (isPalindrome(s, start, i)) { // constrain
                currentList.add(s.substring(start, i + 1));
                dfs(i + 1, result, currentList, s);
                currentList.remove(currentList.size() - 1);
            }
        }

    }

    boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }

}
