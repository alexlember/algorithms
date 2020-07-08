package ru.lember.leetcode.string;

import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 * <p>
 * Example 1:
 * <p>
 * Input: "()"
 * Output: true
 * Example 2:
 * <p>
 * Input: "()[]{}"
 * Output: true
 * Example 3:
 * <p>
 * Input: "(]"
 * Output: false
 * Example 4:
 * <p>
 * Input: "([)]"
 * Output: false
 * Example 5:
 * <p>
 * Input: "{[]}"
 * Output: true
 */
public class ValidParentheses {

    boolean isValid(String s) {


        // можно упростить с сразу пушить противоположную скобку.

        Stack<Character> lastOpenedStack = new Stack<>();

        for (char c : s.toCharArray()) {

            char lastOpened;
            switch (c) {
                case '(':
                    lastOpenedStack.push(c);
                    break;
                case ')':
                    if (lastOpenedStack.isEmpty()) {
                        return false;
                    }

                    lastOpened = lastOpenedStack.pop();

                    if (lastOpened != '(') {
                        return false;
                    }

                    break;
                case '[':
                    lastOpenedStack.push(c);
                    break;
                case ']':
                    if (lastOpenedStack.isEmpty()) {
                        return false;
                    }

                    lastOpened = lastOpenedStack.pop();

                    if (lastOpened != '[') {
                        return false;
                    }

                    break;
                case '{':
                    lastOpenedStack.push(c);
                    break;
                case '}':
                    if (lastOpenedStack.isEmpty()) {
                        return false;
                    }

                    lastOpened = lastOpenedStack.pop();

                    if (lastOpened != '{') {
                        return false;
                    }

                    break;
            }

        }

        return lastOpenedStack.isEmpty();
    }

}
