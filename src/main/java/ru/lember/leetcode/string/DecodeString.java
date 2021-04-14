package ru.lember.leetcode.string;


import java.util.Stack;

/**
 * Given an encoded string, return its decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid; No extra white spaces, square brackets are well-formed, etc.
 *
 * Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there won't be input like 3a or 2[4].
 *
 *
 *
 * Example 1:
 *
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 * Example 2:
 *
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 * Example 3:
 *
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 * Example 4:
 *
 * Input: s = "abc3[cd]xyz"
 * Output: "abccdcdcdxyz"
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 30
 * s consists of lowercase English letters, digits, and square brackets '[]'.
 * s is guaranteed to be a valid input.
 * All the integers in s are in the range [1, 300].
 */
public class DecodeString {

    int index;

    public String decodeString(String s) {
        index = 0;
        Stack<Integer> multiplierStack = new Stack<>();
        return decodeStringHelper(s, multiplierStack);
    }

    private String decodeStringHelper(String s, Stack<Integer> multiplierStack) {
        StringBuilder decoded = new StringBuilder();
        while (index < s.length()) {
            char c = s.charAt(index);
            if (Character.isDigit(c)) {
                decoded.append(calculatePart(s, c, multiplierStack));
            } else if (c == ']') {
                return decoded.toString();
            } else if (c != '[') {
                decoded.append(c);
            }
            index++;
        }
        return decoded.toString();
    }

    private String calculatePart(String s, Character c, Stack<Integer> multiplierStack) {

        StringBuilder multiplier = new StringBuilder();

        while (Character.isDigit(c)) {
            multiplier.append(c);
            index++;
            c = s.charAt(index);
        }

        multiplierStack.push(Integer.valueOf(multiplier.toString()));

        String part = decodeStringHelper(s, multiplierStack);

        StringBuilder result = new StringBuilder();

        int n = multiplierStack.pop();
        for (int i = 0; i < n; i++) {
            result.append(part);
        }

        return result.toString();
    }

}
