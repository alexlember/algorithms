package ru.lember.leetcode.string;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * mplement a basic calculator to evaluate a simple expression string.
 *
 * The expression string contains only non-negative integers, +, -, *, / operators and empty spaces . The integer division should truncate toward zero.
 *
 * Example 1:
 *
 * Input: "3+2*2"
 * Output: 7
 * Example 2:
 *
 * Input: " 3/2 "
 * Output: 1
 * Example 3:
 *
 * Input: " 3+5 / 2 "
 * Output: 5
 * Note:
 *
 * You may assume that the given expression is always valid.
 * Do not use the eval built-in library function.
 */
public class BasicCalculator {

    private static final String OPERATION_ADD = "+";
    private static final String OPERATION_SUBTRACT = "-";
    private static final String OPERATION_MULTIPLY = "*";
    private static final String OPERATION_DIVIDE = "/";
    private static final Set<String> ALLOWED_OPERATIONS = Stream.of(
            OPERATION_ADD,
            OPERATION_SUBTRACT,
            OPERATION_MULTIPLY,
            OPERATION_DIVIDE).collect(Collectors.toSet());

    private static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public int calculate(String rowS) {

        List<String> splitted = Arrays.stream(rowS.split("[\\s]")).collect(Collectors.toList());

        Stack<Integer> values = new Stack<>();
        Stack<String> operators = new Stack<>();

        boolean needApplyOperation = false;
        for (String cur : splitted) {

            if ("".equals(cur) || " ".equals(cur)) {
                continue;
            }

            if (isNumeric(cur)) {

                if (needApplyOperation) {
                    Integer val = values.pop();
                    String oper = operators.pop();
                    int result;
                    int curInt = Integer.parseInt(cur);
                    switch (oper) {
                        case OPERATION_MULTIPLY:
                            result = val * curInt;
                            break;
                        default:
                            result = val / curInt;
                            break;
                    }

                    values.push(result);
                    needApplyOperation = false;
                } else {
                    values.push(Integer.parseInt(cur));
                }
            } else {

                if (ALLOWED_OPERATIONS.contains(cur)) {

                    operators.push(cur);

                    if (OPERATION_DIVIDE.equals(cur) || OPERATION_MULTIPLY.equals(cur)) {
                        needApplyOperation = true;
                    }
                }


            }

        }

        int val;
        String oper;

        while (operators.size() > 0) {

            val = values.pop();
            oper = operators.pop();

            int cur = values.pop();

            int result;
            switch (oper) {
                case OPERATION_ADD:
                    result = val + cur;
                    break;
                default:
                    result = val - cur;
                    break;
            }

            values.push(result);

        }

        if (values.size() != 1) {
            throw new IllegalStateException();
        }

        return values.pop();

    }

    public int calculateEasy(String s) {
        int len;
        if (s == null || (len = s.length()) == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+';

        for (int i = 0; i < len; i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + s.charAt(i) - '0';
            }
            if ((!Character.isDigit(s.charAt(i)) && ' ' != s.charAt(i)) || i == len - 1) {
                if (sign == '-') {
                    stack.push(-num);
                }
                if (sign == '+') {
                    stack.push(num);
                }
                if (sign == '*') {
                    stack.push(stack.pop() * num);
                }
                if (sign == '/') {
                    stack.push(stack.pop() / num);
                }
                sign = s.charAt(i);
                num = 0;
            }
        }

        int re = 0;
        for (int i : stack) {
            re += i;
        }
        return re;
    }

}
