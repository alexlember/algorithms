package ru.lember.leetcode.string;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {


    String longestCommonPrefix(String[] strs) {

        // All given inputs are in lowercase letters a-z.

        if (strs == null || strs.length < 1) {
            return "";
        }

        String minLengthString = strs[0];
        if (minLengthString == null || minLengthString.isEmpty()) {
            return "";
        }

        int minLength = minLengthString.length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            if (s == null || s.isEmpty()) {
                return "";
            }

            if (s.length() < minLength) {
                minLength = s.length();
            }

        }

        // нашли самое все короткое
        // можно и без этого, просто нужно проверять indexOf != 0

        StringBuilder lcp = new StringBuilder();
        for (int i = 0; i < minLength; i++) {

            char currentCommonChar = Character.MIN_VALUE;

            for (String s : strs) {

                if (currentCommonChar != Character.MIN_VALUE) {
                    char currentChar = s.charAt(i);

                    if (currentCommonChar != currentChar) {
                        return lcp.toString();
                    }
                }

                currentCommonChar = s.charAt(i);

            }

            lcp.append(currentCommonChar);
        }

        return lcp.toString();
    }

}
